package com.github.yamingd.mybatis;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.internal.util.StringUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.mybatis.mapper.generator.MapperCommentGenerator;
import tk.mybatis.mapper.generator.MapperPlugin;

import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * Created by dengyaming on 7/25/16.
 */
public class FlexMapperPlugin extends MapperPlugin {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    static final String ATTRIBUTE_NAMESPACE = "namespace";
    static final String ATTRIBUTE_TYPE = "type";

    private RenameProperties modelProperties;
    private RenameProperties mapperProperties;
    private RenameProperties exampleProperties;

    private Set<String> mappers = new HashSet<String>();
    private boolean caseSensitive = false;

    public FlexMapperPlugin() {
        super();

        modelProperties = new RenameProperties();
        mapperProperties = new RenameProperties();
        exampleProperties = new RenameProperties();
    }

    @Override
    public boolean validate(List<String> warnings) {

        modelProperties.validate("gen", "Gen");
        mapperProperties.validate("gen", "Gen");

        return true;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        introspectedTable.setBaseRecordType(modelProperties.setTypes(introspectedTable.getBaseRecordType()));
//        introspectedTable.setMyBatis3JavaMapperType(mapperProperties.setTypes(introspectedTable
//                .getMyBatis3JavaMapperType()));
    }

    @Override
    public void setContext(Context context) {
        super.setContext(context);
        //设置默认的注释生成器
        CommentGeneratorConfiguration commentCfg = new CommentGeneratorConfiguration();
        commentCfg.setConfigurationType(MapperCommentGenerator.class.getCanonicalName());
        context.setCommentGeneratorConfiguration(commentCfg);
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        String mappers = this.properties.getProperty("mappers");
        if (StringUtility.stringHasValue(mappers)) {
            for (String mapper : mappers.split(",")) {
                this.mappers.add(mapper);
            }
        } else {
            throw new RuntimeException("Mapper插件缺少必要的mappers属性!");
        }
        String caseSensitive = this.properties.getProperty("caseSensitive");
        if (StringUtility.stringHasValue(caseSensitive)) {
            this.caseSensitive = caseSensitive.equalsIgnoreCase("TRUE");
        }
    }

    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        return renameElementAttribute(document.getRootElement(), ATTRIBUTE_NAMESPACE);
    }

    @Override
    public boolean sqlMapResultMapWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return renameElementAttribute(element, ATTRIBUTE_TYPE);
    }

    @Override
    public boolean sqlMapResultMapWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return renameElementAttribute(element, ATTRIBUTE_TYPE);
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        FullyQualifiedJavaType modelType = new FullyQualifiedJavaType(modelProperties.getOriginalType());
        // FullyQualifiedJavaType modelType = new FullyQualifiedJavaType(introspectedTable.getBaseRecordType());
        if (interfaze != null) {
            interfaze.addImportedType(modelType);
        }
        if (topLevelClass != null) {
            topLevelClass.addImportedType(modelType);
        }

        //import接口
        for (String mapper : mappers) {
            interfaze.addImportedType(new FullyQualifiedJavaType(mapper));
            interfaze.addSuperInterface(new FullyQualifiedJavaType(mapper + "<" + modelType.getShortName() + ">"));
        }
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        return true;
    }

    /**
     * 处理实体类的包和@Table注解
     *
     * @param topLevelClass
     * @param introspectedTable
     */
    private void processEntityClass(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        //引入JPA注解
        topLevelClass.addImportedType("javax.persistence.*");
        topLevelClass.addImportedType("java.io.Serializable");
        topLevelClass.addImportedType("org.msgpack.annotation.MessagePackMessage");

        String tableName = introspectedTable.getFullyQualifiedTableNameAtRuntime();
        //如果包含空格，或者需要分隔符，需要完善
        if (StringUtility.stringContainsSpace(tableName)) {
            tableName = context.getBeginningDelimiter()
                    + tableName
                    + context.getEndingDelimiter();
        }
        //是否忽略大小写，对于区分大小写的数据库，会有用
        if (caseSensitive && !topLevelClass.getType().getShortName().equals(tableName)) {
            topLevelClass.addAnnotation("@Table(name = \"" + tableName + "\")");
            topLevelClass.addAnnotation("@MessagePackMessage");
            topLevelClass.setAbstract(true);
            topLevelClass.addSuperInterface(new FullyQualifiedJavaType("java.io.Serializable"));
        } else if (!topLevelClass.getType().getShortName().equalsIgnoreCase(tableName)) {
            topLevelClass.addAnnotation("@Table(name = \"" + tableName + "\")");
            topLevelClass.addAnnotation("@MessagePackMessage");
            topLevelClass.setAbstract(true);
            topLevelClass.addSuperInterface(new FullyQualifiedJavaType("java.io.Serializable"));
        }
    }

    /**
     * Rename the method types.
     *
     * @param method
     *            the method
     * @return true
     */
    boolean renameMethod(Method method) {
        method.setReturnType(modelProperties.renameType(method.getReturnType()));

        for (int i = 0; i < method.getParameters().size(); i++) {
            Parameter parameter = method.getParameters().get(i);
            FullyQualifiedJavaType parameterType = parameter.getType();
            FullyQualifiedJavaType newParameterType = modelProperties.renameType(parameterType);
            if (parameterType != newParameterType) {
                Parameter newParam = new Parameter(newParameterType, parameter.getName(), parameter.isVarargs());
                for (String annotation : parameter.getAnnotations()) {
                    newParam.addAnnotation(annotation);
                }
                method.getParameters().set(i, newParam);
                logger.debug("set new parameter: [{}][{}]", parameter, newParam);
            }
        }

        return true;
    }

    /**
     * Rename the element attribute.
     *
     * @param element
     *            the element
     * @param attributeName
     *            the attribute name
     * @return true
     */
    boolean renameElementAttribute(XmlElement element, String attributeName) {
        for (int i = 0; i < element.getAttributes().size(); i++) {
            Attribute attribute = element.getAttributes().get(i);
            if (attributeName.equals(attribute.getName())) {
                element.getAttributes().set(i, modelProperties.renameAttribute(element.getAttributes().get(i)));
                //element.getAttributes().set(i, mapperProperties.renameAttribute(element.getAttributes().get(i)));
            }
        }

        return true;
    }
}
