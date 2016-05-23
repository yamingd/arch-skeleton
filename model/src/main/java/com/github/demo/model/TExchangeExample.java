package com.github.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TExchangeExample() {
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

        public Criteria andToUserIdIsNull() {
            addCriterion("toUserId is null");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNotNull() {
            addCriterion("toUserId is not null");
            return (Criteria) this;
        }

        public Criteria andToUserIdEqualTo(Integer value) {
            addCriterion("toUserId =", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotEqualTo(Integer value) {
            addCriterion("toUserId <>", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThan(Integer value) {
            addCriterion("toUserId >", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("toUserId >=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThan(Integer value) {
            addCriterion("toUserId <", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("toUserId <=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIn(List<Integer> values) {
            addCriterion("toUserId in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotIn(List<Integer> values) {
            addCriterion("toUserId not in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdBetween(Integer value1, Integer value2) {
            addCriterion("toUserId between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("toUserId not between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToBookIdIsNull() {
            addCriterion("toBookId is null");
            return (Criteria) this;
        }

        public Criteria andToBookIdIsNotNull() {
            addCriterion("toBookId is not null");
            return (Criteria) this;
        }

        public Criteria andToBookIdEqualTo(Integer value) {
            addCriterion("toBookId =", value, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdNotEqualTo(Integer value) {
            addCriterion("toBookId <>", value, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdGreaterThan(Integer value) {
            addCriterion("toBookId >", value, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("toBookId >=", value, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdLessThan(Integer value) {
            addCriterion("toBookId <", value, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("toBookId <=", value, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdIn(List<Integer> values) {
            addCriterion("toBookId in", values, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdNotIn(List<Integer> values) {
            addCriterion("toBookId not in", values, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdBetween(Integer value1, Integer value2) {
            addCriterion("toBookId between", value1, value2, "toBookId");
            return (Criteria) this;
        }

        public Criteria andToBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("toBookId not between", value1, value2, "toBookId");
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

        public Criteria andBarIdIsNull() {
            addCriterion("barId is null");
            return (Criteria) this;
        }

        public Criteria andBarIdIsNotNull() {
            addCriterion("barId is not null");
            return (Criteria) this;
        }

        public Criteria andBarIdEqualTo(Integer value) {
            addCriterion("barId =", value, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdNotEqualTo(Integer value) {
            addCriterion("barId <>", value, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdGreaterThan(Integer value) {
            addCriterion("barId >", value, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("barId >=", value, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdLessThan(Integer value) {
            addCriterion("barId <", value, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdLessThanOrEqualTo(Integer value) {
            addCriterion("barId <=", value, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdIn(List<Integer> values) {
            addCriterion("barId in", values, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdNotIn(List<Integer> values) {
            addCriterion("barId not in", values, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdBetween(Integer value1, Integer value2) {
            addCriterion("barId between", value1, value2, "barId");
            return (Criteria) this;
        }

        public Criteria andBarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("barId not between", value1, value2, "barId");
            return (Criteria) this;
        }

        public Criteria andExchangeDateIsNull() {
            addCriterion("exchangeDate is null");
            return (Criteria) this;
        }

        public Criteria andExchangeDateIsNotNull() {
            addCriterion("exchangeDate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeDateEqualTo(Integer value) {
            addCriterion("exchangeDate =", value, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateNotEqualTo(Integer value) {
            addCriterion("exchangeDate <>", value, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateGreaterThan(Integer value) {
            addCriterion("exchangeDate >", value, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchangeDate >=", value, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateLessThan(Integer value) {
            addCriterion("exchangeDate <", value, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateLessThanOrEqualTo(Integer value) {
            addCriterion("exchangeDate <=", value, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateIn(List<Integer> values) {
            addCriterion("exchangeDate in", values, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateNotIn(List<Integer> values) {
            addCriterion("exchangeDate not in", values, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateBetween(Integer value1, Integer value2) {
            addCriterion("exchangeDate between", value1, value2, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andExchangeDateNotBetween(Integer value1, Integer value2) {
            addCriterion("exchangeDate not between", value1, value2, "exchangeDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("returnDate is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("returnDate is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Integer value) {
            addCriterion("returnDate =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Integer value) {
            addCriterion("returnDate <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Integer value) {
            addCriterion("returnDate >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("returnDate >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Integer value) {
            addCriterion("returnDate <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Integer value) {
            addCriterion("returnDate <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Integer> values) {
            addCriterion("returnDate in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Integer> values) {
            addCriterion("returnDate not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Integer value1, Integer value2) {
            addCriterion("returnDate between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Integer value1, Integer value2) {
            addCriterion("returnDate not between", value1, value2, "returnDate");
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

        public Criteria andToFromIsNull() {
            addCriterion("toFrom is null");
            return (Criteria) this;
        }

        public Criteria andToFromIsNotNull() {
            addCriterion("toFrom is not null");
            return (Criteria) this;
        }

        public Criteria andToFromEqualTo(Short value) {
            addCriterion("toFrom =", value, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromNotEqualTo(Short value) {
            addCriterion("toFrom <>", value, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromGreaterThan(Short value) {
            addCriterion("toFrom >", value, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromGreaterThanOrEqualTo(Short value) {
            addCriterion("toFrom >=", value, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromLessThan(Short value) {
            addCriterion("toFrom <", value, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromLessThanOrEqualTo(Short value) {
            addCriterion("toFrom <=", value, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromIn(List<Short> values) {
            addCriterion("toFrom in", values, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromNotIn(List<Short> values) {
            addCriterion("toFrom not in", values, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromBetween(Short value1, Short value2) {
            addCriterion("toFrom between", value1, value2, "toFrom");
            return (Criteria) this;
        }

        public Criteria andToFromNotBetween(Short value1, Short value2) {
            addCriterion("toFrom not between", value1, value2, "toFrom");
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