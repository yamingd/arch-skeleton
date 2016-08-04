package com.github.demo.mapper;

import org.apache.ibatis.mapping.MappedStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

/**
 * Created by dengyaming on 8/3/16.
 */
public class SelectInProvider extends MapperTemplate {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    public SelectInProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    /**
     * IN 查询
     *
     * @param ms
     * @return
     */
    public String selectIn(MappedStatement ms) {
//        if (logger.isDebugEnabled()) {
//            logger.debug("@@@ selectIn SQL Build. {}", ms);
//        }
        Class<?> entityClass = getEntityClass(ms);
        //修改返回值类型为实体类型
        setResultType(ms, entityClass);
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.selectAllColumns(entityClass));
        sql.append(SqlHelper.fromTable(entityClass, tableName(entityClass)));

        sql.append(" WHERE ID IN ");
        sql.append("<foreach collection=\"list\" item=\"itemId\"  open=\"(\" separator=\",\" close=\")\">");
        sql.append("#{itemId}");
        sql.append("</foreach>");

        return sql.toString();
    }
}
