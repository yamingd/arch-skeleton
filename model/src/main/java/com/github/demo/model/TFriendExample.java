package com.github.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TFriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFriendExample() {
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

        public Criteria andFriendIdIsNull() {
            addCriterion("friendId is null");
            return (Criteria) this;
        }

        public Criteria andFriendIdIsNotNull() {
            addCriterion("friendId is not null");
            return (Criteria) this;
        }

        public Criteria andFriendIdEqualTo(Integer value) {
            addCriterion("friendId =", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotEqualTo(Integer value) {
            addCriterion("friendId <>", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdGreaterThan(Integer value) {
            addCriterion("friendId >", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("friendId >=", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLessThan(Integer value) {
            addCriterion("friendId <", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLessThanOrEqualTo(Integer value) {
            addCriterion("friendId <=", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdIn(List<Integer> values) {
            addCriterion("friendId in", values, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotIn(List<Integer> values) {
            addCriterion("friendId not in", values, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdBetween(Integer value1, Integer value2) {
            addCriterion("friendId between", value1, value2, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("friendId not between", value1, value2, "friendId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("addTime =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("addTime <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("addTime >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addTime >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("addTime <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("addTime <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("addTime in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("addTime not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("addTime between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addTime not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUserFromIsNull() {
            addCriterion("userFrom is null");
            return (Criteria) this;
        }

        public Criteria andUserFromIsNotNull() {
            addCriterion("userFrom is not null");
            return (Criteria) this;
        }

        public Criteria andUserFromEqualTo(Short value) {
            addCriterion("userFrom =", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotEqualTo(Short value) {
            addCriterion("userFrom <>", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromGreaterThan(Short value) {
            addCriterion("userFrom >", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromGreaterThanOrEqualTo(Short value) {
            addCriterion("userFrom >=", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromLessThan(Short value) {
            addCriterion("userFrom <", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromLessThanOrEqualTo(Short value) {
            addCriterion("userFrom <=", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromIn(List<Short> values) {
            addCriterion("userFrom in", values, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotIn(List<Short> values) {
            addCriterion("userFrom not in", values, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromBetween(Short value1, Short value2) {
            addCriterion("userFrom between", value1, value2, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotBetween(Short value1, Short value2) {
            addCriterion("userFrom not between", value1, value2, "userFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromIsNull() {
            addCriterion("friendFrom is null");
            return (Criteria) this;
        }

        public Criteria andFriendFromIsNotNull() {
            addCriterion("friendFrom is not null");
            return (Criteria) this;
        }

        public Criteria andFriendFromEqualTo(Short value) {
            addCriterion("friendFrom =", value, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromNotEqualTo(Short value) {
            addCriterion("friendFrom <>", value, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromGreaterThan(Short value) {
            addCriterion("friendFrom >", value, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromGreaterThanOrEqualTo(Short value) {
            addCriterion("friendFrom >=", value, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromLessThan(Short value) {
            addCriterion("friendFrom <", value, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromLessThanOrEqualTo(Short value) {
            addCriterion("friendFrom <=", value, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromIn(List<Short> values) {
            addCriterion("friendFrom in", values, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromNotIn(List<Short> values) {
            addCriterion("friendFrom not in", values, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromBetween(Short value1, Short value2) {
            addCriterion("friendFrom between", value1, value2, "friendFrom");
            return (Criteria) this;
        }

        public Criteria andFriendFromNotBetween(Short value1, Short value2) {
            addCriterion("friendFrom not between", value1, value2, "friendFrom");
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