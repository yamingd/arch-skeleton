package com.github.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TAttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAttachmentExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMimeIsNull() {
            addCriterion("mime is null");
            return (Criteria) this;
        }

        public Criteria andMimeIsNotNull() {
            addCriterion("mime is not null");
            return (Criteria) this;
        }

        public Criteria andMimeEqualTo(String value) {
            addCriterion("mime =", value, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeNotEqualTo(String value) {
            addCriterion("mime <>", value, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeGreaterThan(String value) {
            addCriterion("mime >", value, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeGreaterThanOrEqualTo(String value) {
            addCriterion("mime >=", value, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeLessThan(String value) {
            addCriterion("mime <", value, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeLessThanOrEqualTo(String value) {
            addCriterion("mime <=", value, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeLike(String value) {
            addCriterion("mime like", value, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeNotLike(String value) {
            addCriterion("mime not like", value, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeIn(List<String> values) {
            addCriterion("mime in", values, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeNotIn(List<String> values) {
            addCriterion("mime not in", values, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeBetween(String value1, String value2) {
            addCriterion("mime between", value1, value2, "mime");
            return (Criteria) this;
        }

        public Criteria andMimeNotBetween(String value1, String value2) {
            addCriterion("mime not between", value1, value2, "mime");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andRealPathIsNull() {
            addCriterion("realPath is null");
            return (Criteria) this;
        }

        public Criteria andRealPathIsNotNull() {
            addCriterion("realPath is not null");
            return (Criteria) this;
        }

        public Criteria andRealPathEqualTo(String value) {
            addCriterion("realPath =", value, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathNotEqualTo(String value) {
            addCriterion("realPath <>", value, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathGreaterThan(String value) {
            addCriterion("realPath >", value, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathGreaterThanOrEqualTo(String value) {
            addCriterion("realPath >=", value, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathLessThan(String value) {
            addCriterion("realPath <", value, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathLessThanOrEqualTo(String value) {
            addCriterion("realPath <=", value, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathLike(String value) {
            addCriterion("realPath like", value, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathNotLike(String value) {
            addCriterion("realPath not like", value, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathIn(List<String> values) {
            addCriterion("realPath in", values, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathNotIn(List<String> values) {
            addCriterion("realPath not in", values, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathBetween(String value1, String value2) {
            addCriterion("realPath between", value1, value2, "realPath");
            return (Criteria) this;
        }

        public Criteria andRealPathNotBetween(String value1, String value2) {
            addCriterion("realPath not between", value1, value2, "realPath");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("createAt is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("createAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Integer value) {
            addCriterion("createAt =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Integer value) {
            addCriterion("createAt <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Integer value) {
            addCriterion("createAt >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("createAt >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Integer value) {
            addCriterion("createAt <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Integer value) {
            addCriterion("createAt <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Integer> values) {
            addCriterion("createAt in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Integer> values) {
            addCriterion("createAt not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Integer value1, Integer value2) {
            addCriterion("createAt between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Integer value1, Integer value2) {
            addCriterion("createAt not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNull() {
            addCriterion("accessUrl is null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNotNull() {
            addCriterion("accessUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlEqualTo(String value) {
            addCriterion("accessUrl =", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotEqualTo(String value) {
            addCriterion("accessUrl <>", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThan(String value) {
            addCriterion("accessUrl >", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThanOrEqualTo(String value) {
            addCriterion("accessUrl >=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThan(String value) {
            addCriterion("accessUrl <", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThanOrEqualTo(String value) {
            addCriterion("accessUrl <=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLike(String value) {
            addCriterion("accessUrl like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotLike(String value) {
            addCriterion("accessUrl not like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIn(List<String> values) {
            addCriterion("accessUrl in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotIn(List<String> values) {
            addCriterion("accessUrl not in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlBetween(String value1, String value2) {
            addCriterion("accessUrl between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotBetween(String value1, String value2) {
            addCriterion("accessUrl not between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAcessCountIsNull() {
            addCriterion("acessCount is null");
            return (Criteria) this;
        }

        public Criteria andAcessCountIsNotNull() {
            addCriterion("acessCount is not null");
            return (Criteria) this;
        }

        public Criteria andAcessCountEqualTo(Integer value) {
            addCriterion("acessCount =", value, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountNotEqualTo(Integer value) {
            addCriterion("acessCount <>", value, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountGreaterThan(Integer value) {
            addCriterion("acessCount >", value, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("acessCount >=", value, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountLessThan(Integer value) {
            addCriterion("acessCount <", value, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountLessThanOrEqualTo(Integer value) {
            addCriterion("acessCount <=", value, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountIn(List<Integer> values) {
            addCriterion("acessCount in", values, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountNotIn(List<Integer> values) {
            addCriterion("acessCount not in", values, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountBetween(Integer value1, Integer value2) {
            addCriterion("acessCount between", value1, value2, "acessCount");
            return (Criteria) this;
        }

        public Criteria andAcessCountNotBetween(Integer value1, Integer value2) {
            addCriterion("acessCount not between", value1, value2, "acessCount");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Short value) {
            addCriterion("categoryId =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Short value) {
            addCriterion("categoryId <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Short value) {
            addCriterion("categoryId >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Short value) {
            addCriterion("categoryId >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Short value) {
            addCriterion("categoryId <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Short value) {
            addCriterion("categoryId <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Short> values) {
            addCriterion("categoryId in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Short> values) {
            addCriterion("categoryId not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Short value1, Short value2) {
            addCriterion("categoryId between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Short value1, Short value2) {
            addCriterion("categoryId not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCreateFromIsNull() {
            addCriterion("createFrom is null");
            return (Criteria) this;
        }

        public Criteria andCreateFromIsNotNull() {
            addCriterion("createFrom is not null");
            return (Criteria) this;
        }

        public Criteria andCreateFromEqualTo(Short value) {
            addCriterion("createFrom =", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromNotEqualTo(Short value) {
            addCriterion("createFrom <>", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromGreaterThan(Short value) {
            addCriterion("createFrom >", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromGreaterThanOrEqualTo(Short value) {
            addCriterion("createFrom >=", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromLessThan(Short value) {
            addCriterion("createFrom <", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromLessThanOrEqualTo(Short value) {
            addCriterion("createFrom <=", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromIn(List<Short> values) {
            addCriterion("createFrom in", values, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromNotIn(List<Short> values) {
            addCriterion("createFrom not in", values, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromBetween(Short value1, Short value2) {
            addCriterion("createFrom between", value1, value2, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromNotBetween(Short value1, Short value2) {
            addCriterion("createFrom not between", value1, value2, "createFrom");
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