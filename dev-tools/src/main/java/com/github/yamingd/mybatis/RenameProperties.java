package com.github.yamingd.mybatis;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RenameProperties {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final String DOT = ".";

	private boolean enabled;

	private String subPpackage;
	private String classSuffix;

	private String originalType;
	private String newType;

	public boolean isEnabled() {
		return enabled;
	}

	public String getSubPpackage() {
		return subPpackage;
	}

	public String getClassSuffix() {
		return classSuffix;
	}

	public String getOriginalType() {
		return originalType;
	}

	public String getNewType() {
		return newType;
	}

	public void validate(String theSubPpackage, String theClassSuffix) {
		enabled = theSubPpackage != null || theClassSuffix != null;

		if (enabled) {
			if (theSubPpackage == null) {
				subPpackage = StringUtils.EMPTY;
			} else if (!theSubPpackage.startsWith(DOT)) {
				subPpackage = DOT + theSubPpackage;
			} else {
				subPpackage = theSubPpackage;
			}

			classSuffix = theClassSuffix == null ? StringUtils.EMPTY : theClassSuffix;
		}
	}

	public String setTypes(String theOriginalType) {
		if (enabled) {
			this.originalType = theOriginalType;
			int lastDot = originalType.lastIndexOf(DOT);
			newType = originalType.substring(0, lastDot) + subPpackage + originalType.substring(lastDot) + classSuffix;
			logger.debug("replace type [{}][{}]", originalType, newType);
			return newType;
		}

		return theOriginalType;
	}

	public FullyQualifiedJavaType renameType(FullyQualifiedJavaType theJavaType) {
		if (theJavaType.getFullyQualifiedName().contains(newType)) {
			logger.debug("set new return type: [{}][{}]", newType, originalType);
			return new FullyQualifiedJavaType(theJavaType.getFullyQualifiedName().replace(newType, originalType));
		} else {
			return theJavaType;
		}
	}

	public Attribute renameAttribute(Attribute attribute) {
		if (newType.equals(attribute.getValue())) {
			logger.debug("set new model attribute: [{}][{}][{}]", attribute.getName(), newType, originalType);
			return new Attribute(attribute.getName(), originalType);
		} else {
			return attribute;
		}
	}
}
