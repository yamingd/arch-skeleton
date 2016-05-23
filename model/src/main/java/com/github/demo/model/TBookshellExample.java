package com.github.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TBookshellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBookshellExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("bookId is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("bookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("bookId =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("bookId <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("bookId >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookId >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("bookId <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("bookId <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("bookId in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("bookId not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("bookId between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bookId not between", value1, value2, "bookId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIfOwnerIsNull() {
            addCriterion("ifOwner is null");
            return (Criteria) this;
        }

        public Criteria andIfOwnerIsNotNull() {
            addCriterion("ifOwner is not null");
            return (Criteria) this;
        }

        public Criteria andIfOwnerEqualTo(Boolean value) {
            addCriterion("ifOwner =", value, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerNotEqualTo(Boolean value) {
            addCriterion("ifOwner <>", value, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerGreaterThan(Boolean value) {
            addCriterion("ifOwner >", value, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifOwner >=", value, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerLessThan(Boolean value) {
            addCriterion("ifOwner <", value, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerLessThanOrEqualTo(Boolean value) {
            addCriterion("ifOwner <=", value, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerIn(List<Boolean> values) {
            addCriterion("ifOwner in", values, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerNotIn(List<Boolean> values) {
            addCriterion("ifOwner not in", values, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerBetween(Boolean value1, Boolean value2) {
            addCriterion("ifOwner between", value1, value2, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andIfOwnerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifOwner not between", value1, value2, "ifOwner");
            return (Criteria) this;
        }

        public Criteria andToReadIsNull() {
            addCriterion("toRead is null");
            return (Criteria) this;
        }

        public Criteria andToReadIsNotNull() {
            addCriterion("toRead is not null");
            return (Criteria) this;
        }

        public Criteria andToReadEqualTo(Boolean value) {
            addCriterion("toRead =", value, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadNotEqualTo(Boolean value) {
            addCriterion("toRead <>", value, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadGreaterThan(Boolean value) {
            addCriterion("toRead >", value, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("toRead >=", value, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadLessThan(Boolean value) {
            addCriterion("toRead <", value, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadLessThanOrEqualTo(Boolean value) {
            addCriterion("toRead <=", value, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadIn(List<Boolean> values) {
            addCriterion("toRead in", values, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadNotIn(List<Boolean> values) {
            addCriterion("toRead not in", values, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadBetween(Boolean value1, Boolean value2) {
            addCriterion("toRead between", value1, value2, "toRead");
            return (Criteria) this;
        }

        public Criteria andToReadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("toRead not between", value1, value2, "toRead");
            return (Criteria) this;
        }

        public Criteria andIfViewIsNull() {
            addCriterion("ifView is null");
            return (Criteria) this;
        }

        public Criteria andIfViewIsNotNull() {
            addCriterion("ifView is not null");
            return (Criteria) this;
        }

        public Criteria andIfViewEqualTo(Boolean value) {
            addCriterion("ifView =", value, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewNotEqualTo(Boolean value) {
            addCriterion("ifView <>", value, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewGreaterThan(Boolean value) {
            addCriterion("ifView >", value, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifView >=", value, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewLessThan(Boolean value) {
            addCriterion("ifView <", value, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewLessThanOrEqualTo(Boolean value) {
            addCriterion("ifView <=", value, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewIn(List<Boolean> values) {
            addCriterion("ifView in", values, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewNotIn(List<Boolean> values) {
            addCriterion("ifView not in", values, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewBetween(Boolean value1, Boolean value2) {
            addCriterion("ifView between", value1, value2, "ifView");
            return (Criteria) this;
        }

        public Criteria andIfViewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifView not between", value1, value2, "ifView");
            return (Criteria) this;
        }

        public Criteria andOptFromIsNull() {
            addCriterion("optFrom is null");
            return (Criteria) this;
        }

        public Criteria andOptFromIsNotNull() {
            addCriterion("optFrom is not null");
            return (Criteria) this;
        }

        public Criteria andOptFromEqualTo(Short value) {
            addCriterion("optFrom =", value, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromNotEqualTo(Short value) {
            addCriterion("optFrom <>", value, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromGreaterThan(Short value) {
            addCriterion("optFrom >", value, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromGreaterThanOrEqualTo(Short value) {
            addCriterion("optFrom >=", value, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromLessThan(Short value) {
            addCriterion("optFrom <", value, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromLessThanOrEqualTo(Short value) {
            addCriterion("optFrom <=", value, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromIn(List<Short> values) {
            addCriterion("optFrom in", values, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromNotIn(List<Short> values) {
            addCriterion("optFrom not in", values, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromBetween(Short value1, Short value2) {
            addCriterion("optFrom between", value1, value2, "optFrom");
            return (Criteria) this;
        }

        public Criteria andOptFromNotBetween(Short value1, Short value2) {
            addCriterion("optFrom not between", value1, value2, "optFrom");
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