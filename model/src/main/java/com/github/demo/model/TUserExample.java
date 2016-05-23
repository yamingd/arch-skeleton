package com.github.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("realName =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("realName >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("realName <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("realName like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("realName not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("realName in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nickName =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nickName <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nickName like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nickName not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nickName in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andHashPasswdIsNull() {
            addCriterion("hashPasswd is null");
            return (Criteria) this;
        }

        public Criteria andHashPasswdIsNotNull() {
            addCriterion("hashPasswd is not null");
            return (Criteria) this;
        }

        public Criteria andHashPasswdEqualTo(String value) {
            addCriterion("hashPasswd =", value, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdNotEqualTo(String value) {
            addCriterion("hashPasswd <>", value, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdGreaterThan(String value) {
            addCriterion("hashPasswd >", value, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("hashPasswd >=", value, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdLessThan(String value) {
            addCriterion("hashPasswd <", value, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdLessThanOrEqualTo(String value) {
            addCriterion("hashPasswd <=", value, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdLike(String value) {
            addCriterion("hashPasswd like", value, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdNotLike(String value) {
            addCriterion("hashPasswd not like", value, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdIn(List<String> values) {
            addCriterion("hashPasswd in", values, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdNotIn(List<String> values) {
            addCriterion("hashPasswd not in", values, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdBetween(String value1, String value2) {
            addCriterion("hashPasswd between", value1, value2, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andHashPasswdNotBetween(String value1, String value2) {
            addCriterion("hashPasswd not between", value1, value2, "hashPasswd");
            return (Criteria) this;
        }

        public Criteria andWxIdIsNull() {
            addCriterion("wxId is null");
            return (Criteria) this;
        }

        public Criteria andWxIdIsNotNull() {
            addCriterion("wxId is not null");
            return (Criteria) this;
        }

        public Criteria andWxIdEqualTo(String value) {
            addCriterion("wxId =", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotEqualTo(String value) {
            addCriterion("wxId <>", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdGreaterThan(String value) {
            addCriterion("wxId >", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdGreaterThanOrEqualTo(String value) {
            addCriterion("wxId >=", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLessThan(String value) {
            addCriterion("wxId <", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLessThanOrEqualTo(String value) {
            addCriterion("wxId <=", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLike(String value) {
            addCriterion("wxId like", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotLike(String value) {
            addCriterion("wxId not like", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdIn(List<String> values) {
            addCriterion("wxId in", values, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotIn(List<String> values) {
            addCriterion("wxId not in", values, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdBetween(String value1, String value2) {
            addCriterion("wxId between", value1, value2, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotBetween(String value1, String value2) {
            addCriterion("wxId not between", value1, value2, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxTokenIsNull() {
            addCriterion("wxToken is null");
            return (Criteria) this;
        }

        public Criteria andWxTokenIsNotNull() {
            addCriterion("wxToken is not null");
            return (Criteria) this;
        }

        public Criteria andWxTokenEqualTo(String value) {
            addCriterion("wxToken =", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotEqualTo(String value) {
            addCriterion("wxToken <>", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenGreaterThan(String value) {
            addCriterion("wxToken >", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenGreaterThanOrEqualTo(String value) {
            addCriterion("wxToken >=", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLessThan(String value) {
            addCriterion("wxToken <", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLessThanOrEqualTo(String value) {
            addCriterion("wxToken <=", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLike(String value) {
            addCriterion("wxToken like", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotLike(String value) {
            addCriterion("wxToken not like", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenIn(List<String> values) {
            addCriterion("wxToken in", values, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotIn(List<String> values) {
            addCriterion("wxToken not in", values, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenBetween(String value1, String value2) {
            addCriterion("wxToken between", value1, value2, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotBetween(String value1, String value2) {
            addCriterion("wxToken not between", value1, value2, "wxToken");
            return (Criteria) this;
        }

        public Criteria andQqIdIsNull() {
            addCriterion("qqId is null");
            return (Criteria) this;
        }

        public Criteria andQqIdIsNotNull() {
            addCriterion("qqId is not null");
            return (Criteria) this;
        }

        public Criteria andQqIdEqualTo(String value) {
            addCriterion("qqId =", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdNotEqualTo(String value) {
            addCriterion("qqId <>", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdGreaterThan(String value) {
            addCriterion("qqId >", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdGreaterThanOrEqualTo(String value) {
            addCriterion("qqId >=", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdLessThan(String value) {
            addCriterion("qqId <", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdLessThanOrEqualTo(String value) {
            addCriterion("qqId <=", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdLike(String value) {
            addCriterion("qqId like", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdNotLike(String value) {
            addCriterion("qqId not like", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdIn(List<String> values) {
            addCriterion("qqId in", values, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdNotIn(List<String> values) {
            addCriterion("qqId not in", values, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdBetween(String value1, String value2) {
            addCriterion("qqId between", value1, value2, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdNotBetween(String value1, String value2) {
            addCriterion("qqId not between", value1, value2, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqTokenIsNull() {
            addCriterion("qqToken is null");
            return (Criteria) this;
        }

        public Criteria andQqTokenIsNotNull() {
            addCriterion("qqToken is not null");
            return (Criteria) this;
        }

        public Criteria andQqTokenEqualTo(String value) {
            addCriterion("qqToken =", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenNotEqualTo(String value) {
            addCriterion("qqToken <>", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenGreaterThan(String value) {
            addCriterion("qqToken >", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenGreaterThanOrEqualTo(String value) {
            addCriterion("qqToken >=", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenLessThan(String value) {
            addCriterion("qqToken <", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenLessThanOrEqualTo(String value) {
            addCriterion("qqToken <=", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenLike(String value) {
            addCriterion("qqToken like", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenNotLike(String value) {
            addCriterion("qqToken not like", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenIn(List<String> values) {
            addCriterion("qqToken in", values, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenNotIn(List<String> values) {
            addCriterion("qqToken not in", values, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenBetween(String value1, String value2) {
            addCriterion("qqToken between", value1, value2, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenNotBetween(String value1, String value2) {
            addCriterion("qqToken not between", value1, value2, "qqToken");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIsNull() {
            addCriterion("weiboId is null");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIsNotNull() {
            addCriterion("weiboId is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboIdEqualTo(String value) {
            addCriterion("weiboId =", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotEqualTo(String value) {
            addCriterion("weiboId <>", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdGreaterThan(String value) {
            addCriterion("weiboId >", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdGreaterThanOrEqualTo(String value) {
            addCriterion("weiboId >=", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLessThan(String value) {
            addCriterion("weiboId <", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLessThanOrEqualTo(String value) {
            addCriterion("weiboId <=", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLike(String value) {
            addCriterion("weiboId like", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotLike(String value) {
            addCriterion("weiboId not like", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIn(List<String> values) {
            addCriterion("weiboId in", values, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotIn(List<String> values) {
            addCriterion("weiboId not in", values, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdBetween(String value1, String value2) {
            addCriterion("weiboId between", value1, value2, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotBetween(String value1, String value2) {
            addCriterion("weiboId not between", value1, value2, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenIsNull() {
            addCriterion("weiboToken is null");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenIsNotNull() {
            addCriterion("weiboToken is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenEqualTo(String value) {
            addCriterion("weiboToken =", value, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenNotEqualTo(String value) {
            addCriterion("weiboToken <>", value, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenGreaterThan(String value) {
            addCriterion("weiboToken >", value, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenGreaterThanOrEqualTo(String value) {
            addCriterion("weiboToken >=", value, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenLessThan(String value) {
            addCriterion("weiboToken <", value, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenLessThanOrEqualTo(String value) {
            addCriterion("weiboToken <=", value, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenLike(String value) {
            addCriterion("weiboToken like", value, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenNotLike(String value) {
            addCriterion("weiboToken not like", value, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenIn(List<String> values) {
            addCriterion("weiboToken in", values, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenNotIn(List<String> values) {
            addCriterion("weiboToken not in", values, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenBetween(String value1, String value2) {
            addCriterion("weiboToken between", value1, value2, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andWeiboTokenNotBetween(String value1, String value2) {
            addCriterion("weiboToken not between", value1, value2, "weiboToken");
            return (Criteria) this;
        }

        public Criteria andIconIdIsNull() {
            addCriterion("iconId is null");
            return (Criteria) this;
        }

        public Criteria andIconIdIsNotNull() {
            addCriterion("iconId is not null");
            return (Criteria) this;
        }

        public Criteria andIconIdEqualTo(Integer value) {
            addCriterion("iconId =", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotEqualTo(Integer value) {
            addCriterion("iconId <>", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdGreaterThan(Integer value) {
            addCriterion("iconId >", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iconId >=", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLessThan(Integer value) {
            addCriterion("iconId <", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLessThanOrEqualTo(Integer value) {
            addCriterion("iconId <=", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdIn(List<Integer> values) {
            addCriterion("iconId in", values, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotIn(List<Integer> values) {
            addCriterion("iconId not in", values, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdBetween(Integer value1, Integer value2) {
            addCriterion("iconId between", value1, value2, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iconId not between", value1, value2, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconPathIsNull() {
            addCriterion("iconPath is null");
            return (Criteria) this;
        }

        public Criteria andIconPathIsNotNull() {
            addCriterion("iconPath is not null");
            return (Criteria) this;
        }

        public Criteria andIconPathEqualTo(String value) {
            addCriterion("iconPath =", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotEqualTo(String value) {
            addCriterion("iconPath <>", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathGreaterThan(String value) {
            addCriterion("iconPath >", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathGreaterThanOrEqualTo(String value) {
            addCriterion("iconPath >=", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLessThan(String value) {
            addCriterion("iconPath <", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLessThanOrEqualTo(String value) {
            addCriterion("iconPath <=", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLike(String value) {
            addCriterion("iconPath like", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotLike(String value) {
            addCriterion("iconPath not like", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathIn(List<String> values) {
            addCriterion("iconPath in", values, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotIn(List<String> values) {
            addCriterion("iconPath not in", values, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathBetween(String value1, String value2) {
            addCriterion("iconPath between", value1, value2, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotBetween(String value1, String value2) {
            addCriterion("iconPath not between", value1, value2, "iconPath");
            return (Criteria) this;
        }

        public Criteria andGenderIdIsNull() {
            addCriterion("genderId is null");
            return (Criteria) this;
        }

        public Criteria andGenderIdIsNotNull() {
            addCriterion("genderId is not null");
            return (Criteria) this;
        }

        public Criteria andGenderIdEqualTo(Short value) {
            addCriterion("genderId =", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotEqualTo(Short value) {
            addCriterion("genderId <>", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdGreaterThan(Short value) {
            addCriterion("genderId >", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdGreaterThanOrEqualTo(Short value) {
            addCriterion("genderId >=", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdLessThan(Short value) {
            addCriterion("genderId <", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdLessThanOrEqualTo(Short value) {
            addCriterion("genderId <=", value, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdIn(List<Short> values) {
            addCriterion("genderId in", values, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotIn(List<Short> values) {
            addCriterion("genderId not in", values, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdBetween(Short value1, Short value2) {
            addCriterion("genderId between", value1, value2, "genderId");
            return (Criteria) this;
        }

        public Criteria andGenderIdNotBetween(Short value1, Short value2) {
            addCriterion("genderId not between", value1, value2, "genderId");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("provinceId is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("provinceId is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("provinceId =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("provinceId <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("provinceId >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("provinceId >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("provinceId <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("provinceId <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("provinceId in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("provinceId not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("provinceId between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("provinceId not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("cityId =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("cityId <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("cityId >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityId >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("cityId <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("cityId <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("cityId in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("cityId not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("cityId between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cityId not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("districtId is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("districtId is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("districtId =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("districtId <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("districtId >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("districtId >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("districtId <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("districtId <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("districtId in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("districtId not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("districtId between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("districtId not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Integer value) {
            addCriterion("createDate =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Integer value) {
            addCriterion("createDate <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Integer value) {
            addCriterion("createDate >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("createDate >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Integer value) {
            addCriterion("createDate <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Integer value) {
            addCriterion("createDate <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Integer> values) {
            addCriterion("createDate in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Integer> values) {
            addCriterion("createDate not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Integer value1, Integer value2) {
            addCriterion("createDate between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Integer value1, Integer value2) {
            addCriterion("createDate not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTotalLoginIsNull() {
            addCriterion("totalLogin is null");
            return (Criteria) this;
        }

        public Criteria andTotalLoginIsNotNull() {
            addCriterion("totalLogin is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLoginEqualTo(Integer value) {
            addCriterion("totalLogin =", value, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginNotEqualTo(Integer value) {
            addCriterion("totalLogin <>", value, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginGreaterThan(Integer value) {
            addCriterion("totalLogin >", value, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalLogin >=", value, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginLessThan(Integer value) {
            addCriterion("totalLogin <", value, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginLessThanOrEqualTo(Integer value) {
            addCriterion("totalLogin <=", value, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginIn(List<Integer> values) {
            addCriterion("totalLogin in", values, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginNotIn(List<Integer> values) {
            addCriterion("totalLogin not in", values, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginBetween(Integer value1, Integer value2) {
            addCriterion("totalLogin between", value1, value2, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andTotalLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("totalLogin not between", value1, value2, "totalLogin");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("vipLevel is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("vipLevel is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(Short value) {
            addCriterion("vipLevel =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(Short value) {
            addCriterion("vipLevel <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(Short value) {
            addCriterion("vipLevel >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("vipLevel >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(Short value) {
            addCriterion("vipLevel <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(Short value) {
            addCriterion("vipLevel <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<Short> values) {
            addCriterion("vipLevel in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<Short> values) {
            addCriterion("vipLevel not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(Short value1, Short value2) {
            addCriterion("vipLevel between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(Short value1, Short value2) {
            addCriterion("vipLevel not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andTotalCreditIsNull() {
            addCriterion("totalCredit is null");
            return (Criteria) this;
        }

        public Criteria andTotalCreditIsNotNull() {
            addCriterion("totalCredit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCreditEqualTo(Integer value) {
            addCriterion("totalCredit =", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditNotEqualTo(Integer value) {
            addCriterion("totalCredit <>", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditGreaterThan(Integer value) {
            addCriterion("totalCredit >", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalCredit >=", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditLessThan(Integer value) {
            addCriterion("totalCredit <", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditLessThanOrEqualTo(Integer value) {
            addCriterion("totalCredit <=", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditIn(List<Integer> values) {
            addCriterion("totalCredit in", values, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditNotIn(List<Integer> values) {
            addCriterion("totalCredit not in", values, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditBetween(Integer value1, Integer value2) {
            addCriterion("totalCredit between", value1, value2, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("totalCredit not between", value1, value2, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("statusId is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("statusId is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Short value) {
            addCriterion("statusId =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Short value) {
            addCriterion("statusId <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Short value) {
            addCriterion("statusId >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Short value) {
            addCriterion("statusId >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Short value) {
            addCriterion("statusId <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Short value) {
            addCriterion("statusId <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Short> values) {
            addCriterion("statusId in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Short> values) {
            addCriterion("statusId not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Short value1, Short value2) {
            addCriterion("statusId between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Short value1, Short value2) {
            addCriterion("statusId not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgIsNull() {
            addCriterion("totalUnreadMsg is null");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgIsNotNull() {
            addCriterion("totalUnreadMsg is not null");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgEqualTo(Integer value) {
            addCriterion("totalUnreadMsg =", value, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgNotEqualTo(Integer value) {
            addCriterion("totalUnreadMsg <>", value, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgGreaterThan(Integer value) {
            addCriterion("totalUnreadMsg >", value, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalUnreadMsg >=", value, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgLessThan(Integer value) {
            addCriterion("totalUnreadMsg <", value, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgLessThanOrEqualTo(Integer value) {
            addCriterion("totalUnreadMsg <=", value, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgIn(List<Integer> values) {
            addCriterion("totalUnreadMsg in", values, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgNotIn(List<Integer> values) {
            addCriterion("totalUnreadMsg not in", values, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgBetween(Integer value1, Integer value2) {
            addCriterion("totalUnreadMsg between", value1, value2, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andTotalUnreadMsgNotBetween(Integer value1, Integer value2) {
            addCriterion("totalUnreadMsg not between", value1, value2, "totalUnreadMsg");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNull() {
            addCriterion("idcardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNotNull() {
            addCriterion("idcardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoEqualTo(String value) {
            addCriterion("idcardNo =", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotEqualTo(String value) {
            addCriterion("idcardNo <>", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThan(String value) {
            addCriterion("idcardNo >", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("idcardNo >=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThan(String value) {
            addCriterion("idcardNo <", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("idcardNo <=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLike(String value) {
            addCriterion("idcardNo like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotLike(String value) {
            addCriterion("idcardNo not like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIn(List<String> values) {
            addCriterion("idcardNo in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotIn(List<String> values) {
            addCriterion("idcardNo not in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoBetween(String value1, String value2) {
            addCriterion("idcardNo between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotBetween(String value1, String value2) {
            addCriterion("idcardNo not between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdIsNull() {
            addCriterion("idcardTypeId is null");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdIsNotNull() {
            addCriterion("idcardTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdEqualTo(Integer value) {
            addCriterion("idcardTypeId =", value, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdNotEqualTo(Integer value) {
            addCriterion("idcardTypeId <>", value, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdGreaterThan(Integer value) {
            addCriterion("idcardTypeId >", value, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("idcardTypeId >=", value, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdLessThan(Integer value) {
            addCriterion("idcardTypeId <", value, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("idcardTypeId <=", value, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdIn(List<Integer> values) {
            addCriterion("idcardTypeId in", values, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdNotIn(List<Integer> values) {
            addCriterion("idcardTypeId not in", values, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("idcardTypeId between", value1, value2, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("idcardTypeId not between", value1, value2, "idcardTypeId");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1IsNull() {
            addCriterion("idcardImageId1 is null");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1IsNotNull() {
            addCriterion("idcardImageId1 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1EqualTo(Integer value) {
            addCriterion("idcardImageId1 =", value, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1NotEqualTo(Integer value) {
            addCriterion("idcardImageId1 <>", value, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1GreaterThan(Integer value) {
            addCriterion("idcardImageId1 >", value, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("idcardImageId1 >=", value, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1LessThan(Integer value) {
            addCriterion("idcardImageId1 <", value, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1LessThanOrEqualTo(Integer value) {
            addCriterion("idcardImageId1 <=", value, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1In(List<Integer> values) {
            addCriterion("idcardImageId1 in", values, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1NotIn(List<Integer> values) {
            addCriterion("idcardImageId1 not in", values, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1Between(Integer value1, Integer value2) {
            addCriterion("idcardImageId1 between", value1, value2, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId1NotBetween(Integer value1, Integer value2) {
            addCriterion("idcardImageId1 not between", value1, value2, "idcardImageId1");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2IsNull() {
            addCriterion("idcardImageId2 is null");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2IsNotNull() {
            addCriterion("idcardImageId2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2EqualTo(Integer value) {
            addCriterion("idcardImageId2 =", value, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2NotEqualTo(Integer value) {
            addCriterion("idcardImageId2 <>", value, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2GreaterThan(Integer value) {
            addCriterion("idcardImageId2 >", value, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("idcardImageId2 >=", value, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2LessThan(Integer value) {
            addCriterion("idcardImageId2 <", value, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2LessThanOrEqualTo(Integer value) {
            addCriterion("idcardImageId2 <=", value, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2In(List<Integer> values) {
            addCriterion("idcardImageId2 in", values, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2NotIn(List<Integer> values) {
            addCriterion("idcardImageId2 not in", values, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2Between(Integer value1, Integer value2) {
            addCriterion("idcardImageId2 between", value1, value2, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andIdcardImageId2NotBetween(Integer value1, Integer value2) {
            addCriterion("idcardImageId2 not between", value1, value2, "idcardImageId2");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIsNull() {
            addCriterion("approveTime is null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIsNotNull() {
            addCriterion("approveTime is not null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeEqualTo(Integer value) {
            addCriterion("approveTime =", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotEqualTo(Integer value) {
            addCriterion("approveTime <>", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThan(Integer value) {
            addCriterion("approveTime >", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("approveTime >=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThan(Integer value) {
            addCriterion("approveTime <", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("approveTime <=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIn(List<Integer> values) {
            addCriterion("approveTime in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotIn(List<Integer> values) {
            addCriterion("approveTime not in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeBetween(Integer value1, Integer value2) {
            addCriterion("approveTime between", value1, value2, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("approveTime not between", value1, value2, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveMarkIsNull() {
            addCriterion("approveMark is null");
            return (Criteria) this;
        }

        public Criteria andApproveMarkIsNotNull() {
            addCriterion("approveMark is not null");
            return (Criteria) this;
        }

        public Criteria andApproveMarkEqualTo(String value) {
            addCriterion("approveMark =", value, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkNotEqualTo(String value) {
            addCriterion("approveMark <>", value, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkGreaterThan(String value) {
            addCriterion("approveMark >", value, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkGreaterThanOrEqualTo(String value) {
            addCriterion("approveMark >=", value, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkLessThan(String value) {
            addCriterion("approveMark <", value, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkLessThanOrEqualTo(String value) {
            addCriterion("approveMark <=", value, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkLike(String value) {
            addCriterion("approveMark like", value, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkNotLike(String value) {
            addCriterion("approveMark not like", value, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkIn(List<String> values) {
            addCriterion("approveMark in", values, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkNotIn(List<String> values) {
            addCriterion("approveMark not in", values, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkBetween(String value1, String value2) {
            addCriterion("approveMark between", value1, value2, "approveMark");
            return (Criteria) this;
        }

        public Criteria andApproveMarkNotBetween(String value1, String value2) {
            addCriterion("approveMark not between", value1, value2, "approveMark");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSignFromIsNull() {
            addCriterion("signFrom is null");
            return (Criteria) this;
        }

        public Criteria andSignFromIsNotNull() {
            addCriterion("signFrom is not null");
            return (Criteria) this;
        }

        public Criteria andSignFromEqualTo(Short value) {
            addCriterion("signFrom =", value, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromNotEqualTo(Short value) {
            addCriterion("signFrom <>", value, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromGreaterThan(Short value) {
            addCriterion("signFrom >", value, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromGreaterThanOrEqualTo(Short value) {
            addCriterion("signFrom >=", value, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromLessThan(Short value) {
            addCriterion("signFrom <", value, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromLessThanOrEqualTo(Short value) {
            addCriterion("signFrom <=", value, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromIn(List<Short> values) {
            addCriterion("signFrom in", values, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromNotIn(List<Short> values) {
            addCriterion("signFrom not in", values, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromBetween(Short value1, Short value2) {
            addCriterion("signFrom between", value1, value2, "signFrom");
            return (Criteria) this;
        }

        public Criteria andSignFromNotBetween(Short value1, Short value2) {
            addCriterion("signFrom not between", value1, value2, "signFrom");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("deviceId is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("deviceId is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("deviceId =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("deviceId <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("deviceId >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviceId >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("deviceId <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("deviceId <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("deviceId in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("deviceId not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("deviceId between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deviceId not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdIsNull() {
            addCriterion("lastDeviceId is null");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdIsNotNull() {
            addCriterion("lastDeviceId is not null");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdEqualTo(Integer value) {
            addCriterion("lastDeviceId =", value, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdNotEqualTo(Integer value) {
            addCriterion("lastDeviceId <>", value, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdGreaterThan(Integer value) {
            addCriterion("lastDeviceId >", value, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastDeviceId >=", value, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdLessThan(Integer value) {
            addCriterion("lastDeviceId <", value, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("lastDeviceId <=", value, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdIn(List<Integer> values) {
            addCriterion("lastDeviceId in", values, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdNotIn(List<Integer> values) {
            addCriterion("lastDeviceId not in", values, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("lastDeviceId between", value1, value2, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lastDeviceId not between", value1, value2, "lastDeviceId");
            return (Criteria) this;
        }

        public Criteria andLastFromIsNull() {
            addCriterion("lastFrom is null");
            return (Criteria) this;
        }

        public Criteria andLastFromIsNotNull() {
            addCriterion("lastFrom is not null");
            return (Criteria) this;
        }

        public Criteria andLastFromEqualTo(Short value) {
            addCriterion("lastFrom =", value, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromNotEqualTo(Short value) {
            addCriterion("lastFrom <>", value, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromGreaterThan(Short value) {
            addCriterion("lastFrom >", value, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromGreaterThanOrEqualTo(Short value) {
            addCriterion("lastFrom >=", value, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromLessThan(Short value) {
            addCriterion("lastFrom <", value, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromLessThanOrEqualTo(Short value) {
            addCriterion("lastFrom <=", value, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromIn(List<Short> values) {
            addCriterion("lastFrom in", values, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromNotIn(List<Short> values) {
            addCriterion("lastFrom not in", values, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromBetween(Short value1, Short value2) {
            addCriterion("lastFrom between", value1, value2, "lastFrom");
            return (Criteria) this;
        }

        public Criteria andLastFromNotBetween(Short value1, Short value2) {
            addCriterion("lastFrom not between", value1, value2, "lastFrom");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}