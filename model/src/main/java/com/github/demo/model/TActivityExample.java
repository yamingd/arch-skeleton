package com.github.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TActivityExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andChsCodeIsNull() {
            addCriterion("chsCode is null");
            return (Criteria) this;
        }

        public Criteria andChsCodeIsNotNull() {
            addCriterion("chsCode is not null");
            return (Criteria) this;
        }

        public Criteria andChsCodeEqualTo(String value) {
            addCriterion("chsCode =", value, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeNotEqualTo(String value) {
            addCriterion("chsCode <>", value, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeGreaterThan(String value) {
            addCriterion("chsCode >", value, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("chsCode >=", value, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeLessThan(String value) {
            addCriterion("chsCode <", value, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeLessThanOrEqualTo(String value) {
            addCriterion("chsCode <=", value, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeLike(String value) {
            addCriterion("chsCode like", value, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeNotLike(String value) {
            addCriterion("chsCode not like", value, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeIn(List<String> values) {
            addCriterion("chsCode in", values, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeNotIn(List<String> values) {
            addCriterion("chsCode not in", values, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeBetween(String value1, String value2) {
            addCriterion("chsCode between", value1, value2, "chsCode");
            return (Criteria) this;
        }

        public Criteria andChsCodeNotBetween(String value1, String value2) {
            addCriterion("chsCode not between", value1, value2, "chsCode");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("startTime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("startTime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("startTime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("endTime <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("createUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("createUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("createUserId =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("createUserId <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("createUserId >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("createUserId >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("createUserId <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("createUserId <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("createUserId in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("createUserId not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("createUserId between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("createUserId not between", value1, value2, "createUserId");
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

        public Criteria andCoverImageIdIsNull() {
            addCriterion("coverImageId is null");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdIsNotNull() {
            addCriterion("coverImageId is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdEqualTo(Integer value) {
            addCriterion("coverImageId =", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdNotEqualTo(Integer value) {
            addCriterion("coverImageId <>", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdGreaterThan(Integer value) {
            addCriterion("coverImageId >", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coverImageId >=", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdLessThan(Integer value) {
            addCriterion("coverImageId <", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("coverImageId <=", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdIn(List<Integer> values) {
            addCriterion("coverImageId in", values, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdNotIn(List<Integer> values) {
            addCriterion("coverImageId not in", values, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdBetween(Integer value1, Integer value2) {
            addCriterion("coverImageId between", value1, value2, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coverImageId not between", value1, value2, "coverImageId");
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

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeIsNull() {
            addCriterion("signEndTime is null");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeIsNotNull() {
            addCriterion("signEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeEqualTo(Date value) {
            addCriterion("signEndTime =", value, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeNotEqualTo(Date value) {
            addCriterion("signEndTime <>", value, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeGreaterThan(Date value) {
            addCriterion("signEndTime >", value, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signEndTime >=", value, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeLessThan(Date value) {
            addCriterion("signEndTime <", value, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("signEndTime <=", value, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeIn(List<Date> values) {
            addCriterion("signEndTime in", values, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeNotIn(List<Date> values) {
            addCriterion("signEndTime not in", values, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeBetween(Date value1, Date value2) {
            addCriterion("signEndTime between", value1, value2, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andSignEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("signEndTime not between", value1, value2, "signEndTime");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contactPhone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contactPhone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contactPhone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contactPhone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contactPhone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactPhone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contactPhone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contactPhone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contactPhone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contactPhone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contactPhone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contactPhone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contactPhone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contactPhone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contactName is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contactName is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contactName =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contactName <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contactName >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contactName >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contactName <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contactName <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contactName like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contactName not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contactName in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contactName not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contactName between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contactName not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andIfRecommendIsNull() {
            addCriterion("ifRecommend is null");
            return (Criteria) this;
        }

        public Criteria andIfRecommendIsNotNull() {
            addCriterion("ifRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andIfRecommendEqualTo(Boolean value) {
            addCriterion("ifRecommend =", value, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendNotEqualTo(Boolean value) {
            addCriterion("ifRecommend <>", value, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendGreaterThan(Boolean value) {
            addCriterion("ifRecommend >", value, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifRecommend >=", value, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendLessThan(Boolean value) {
            addCriterion("ifRecommend <", value, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("ifRecommend <=", value, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendIn(List<Boolean> values) {
            addCriterion("ifRecommend in", values, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendNotIn(List<Boolean> values) {
            addCriterion("ifRecommend not in", values, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("ifRecommend between", value1, value2, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifRecommend not between", value1, value2, "ifRecommend");
            return (Criteria) this;
        }

        public Criteria andIfTopIsNull() {
            addCriterion("ifTop is null");
            return (Criteria) this;
        }

        public Criteria andIfTopIsNotNull() {
            addCriterion("ifTop is not null");
            return (Criteria) this;
        }

        public Criteria andIfTopEqualTo(Boolean value) {
            addCriterion("ifTop =", value, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopNotEqualTo(Boolean value) {
            addCriterion("ifTop <>", value, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopGreaterThan(Boolean value) {
            addCriterion("ifTop >", value, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifTop >=", value, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopLessThan(Boolean value) {
            addCriterion("ifTop <", value, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopLessThanOrEqualTo(Boolean value) {
            addCriterion("ifTop <=", value, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopIn(List<Boolean> values) {
            addCriterion("ifTop in", values, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopNotIn(List<Boolean> values) {
            addCriterion("ifTop not in", values, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopBetween(Boolean value1, Boolean value2) {
            addCriterion("ifTop between", value1, value2, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfTopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifTop not between", value1, value2, "ifTop");
            return (Criteria) this;
        }

        public Criteria andIfNewIsNull() {
            addCriterion("ifNew is null");
            return (Criteria) this;
        }

        public Criteria andIfNewIsNotNull() {
            addCriterion("ifNew is not null");
            return (Criteria) this;
        }

        public Criteria andIfNewEqualTo(Boolean value) {
            addCriterion("ifNew =", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewNotEqualTo(Boolean value) {
            addCriterion("ifNew <>", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewGreaterThan(Boolean value) {
            addCriterion("ifNew >", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifNew >=", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewLessThan(Boolean value) {
            addCriterion("ifNew <", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewLessThanOrEqualTo(Boolean value) {
            addCriterion("ifNew <=", value, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewIn(List<Boolean> values) {
            addCriterion("ifNew in", values, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewNotIn(List<Boolean> values) {
            addCriterion("ifNew not in", values, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewBetween(Boolean value1, Boolean value2) {
            addCriterion("ifNew between", value1, value2, "ifNew");
            return (Criteria) this;
        }

        public Criteria andIfNewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifNew not between", value1, value2, "ifNew");
            return (Criteria) this;
        }

        public Criteria andTotalSignIsNull() {
            addCriterion("totalSign is null");
            return (Criteria) this;
        }

        public Criteria andTotalSignIsNotNull() {
            addCriterion("totalSign is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSignEqualTo(Integer value) {
            addCriterion("totalSign =", value, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignNotEqualTo(Integer value) {
            addCriterion("totalSign <>", value, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignGreaterThan(Integer value) {
            addCriterion("totalSign >", value, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalSign >=", value, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignLessThan(Integer value) {
            addCriterion("totalSign <", value, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignLessThanOrEqualTo(Integer value) {
            addCriterion("totalSign <=", value, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignIn(List<Integer> values) {
            addCriterion("totalSign in", values, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignNotIn(List<Integer> values) {
            addCriterion("totalSign not in", values, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignBetween(Integer value1, Integer value2) {
            addCriterion("totalSign between", value1, value2, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalSignNotBetween(Integer value1, Integer value2) {
            addCriterion("totalSign not between", value1, value2, "totalSign");
            return (Criteria) this;
        }

        public Criteria andTotalWantIsNull() {
            addCriterion("totalWant is null");
            return (Criteria) this;
        }

        public Criteria andTotalWantIsNotNull() {
            addCriterion("totalWant is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWantEqualTo(Integer value) {
            addCriterion("totalWant =", value, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantNotEqualTo(Integer value) {
            addCriterion("totalWant <>", value, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantGreaterThan(Integer value) {
            addCriterion("totalWant >", value, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalWant >=", value, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantLessThan(Integer value) {
            addCriterion("totalWant <", value, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantLessThanOrEqualTo(Integer value) {
            addCriterion("totalWant <=", value, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantIn(List<Integer> values) {
            addCriterion("totalWant in", values, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantNotIn(List<Integer> values) {
            addCriterion("totalWant not in", values, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantBetween(Integer value1, Integer value2) {
            addCriterion("totalWant between", value1, value2, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalWantNotBetween(Integer value1, Integer value2) {
            addCriterion("totalWant not between", value1, value2, "totalWant");
            return (Criteria) this;
        }

        public Criteria andTotalViewIsNull() {
            addCriterion("totalView is null");
            return (Criteria) this;
        }

        public Criteria andTotalViewIsNotNull() {
            addCriterion("totalView is not null");
            return (Criteria) this;
        }

        public Criteria andTotalViewEqualTo(Integer value) {
            addCriterion("totalView =", value, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewNotEqualTo(Integer value) {
            addCriterion("totalView <>", value, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewGreaterThan(Integer value) {
            addCriterion("totalView >", value, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalView >=", value, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewLessThan(Integer value) {
            addCriterion("totalView <", value, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewLessThanOrEqualTo(Integer value) {
            addCriterion("totalView <=", value, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewIn(List<Integer> values) {
            addCriterion("totalView in", values, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewNotIn(List<Integer> values) {
            addCriterion("totalView not in", values, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewBetween(Integer value1, Integer value2) {
            addCriterion("totalView between", value1, value2, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalViewNotBetween(Integer value1, Integer value2) {
            addCriterion("totalView not between", value1, value2, "totalView");
            return (Criteria) this;
        }

        public Criteria andTotalShareIsNull() {
            addCriterion("totalShare is null");
            return (Criteria) this;
        }

        public Criteria andTotalShareIsNotNull() {
            addCriterion("totalShare is not null");
            return (Criteria) this;
        }

        public Criteria andTotalShareEqualTo(Integer value) {
            addCriterion("totalShare =", value, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareNotEqualTo(Integer value) {
            addCriterion("totalShare <>", value, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareGreaterThan(Integer value) {
            addCriterion("totalShare >", value, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalShare >=", value, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareLessThan(Integer value) {
            addCriterion("totalShare <", value, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareLessThanOrEqualTo(Integer value) {
            addCriterion("totalShare <=", value, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareIn(List<Integer> values) {
            addCriterion("totalShare in", values, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareNotIn(List<Integer> values) {
            addCriterion("totalShare not in", values, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareBetween(Integer value1, Integer value2) {
            addCriterion("totalShare between", value1, value2, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalShareNotBetween(Integer value1, Integer value2) {
            addCriterion("totalShare not between", value1, value2, "totalShare");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedIsNull() {
            addCriterion("totalAttended is null");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedIsNotNull() {
            addCriterion("totalAttended is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedEqualTo(Integer value) {
            addCriterion("totalAttended =", value, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedNotEqualTo(Integer value) {
            addCriterion("totalAttended <>", value, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedGreaterThan(Integer value) {
            addCriterion("totalAttended >", value, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalAttended >=", value, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedLessThan(Integer value) {
            addCriterion("totalAttended <", value, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedLessThanOrEqualTo(Integer value) {
            addCriterion("totalAttended <=", value, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedIn(List<Integer> values) {
            addCriterion("totalAttended in", values, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedNotIn(List<Integer> values) {
            addCriterion("totalAttended not in", values, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedBetween(Integer value1, Integer value2) {
            addCriterion("totalAttended between", value1, value2, "totalAttended");
            return (Criteria) this;
        }

        public Criteria andTotalAttendedNotBetween(Integer value1, Integer value2) {
            addCriterion("totalAttended not between", value1, value2, "totalAttended");
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