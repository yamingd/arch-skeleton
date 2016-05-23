package com.github.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TMomentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMomentExample() {
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

        public Criteria andObjectIdIsNull() {
            addCriterion("objectId is null");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNotNull() {
            addCriterion("objectId is not null");
            return (Criteria) this;
        }

        public Criteria andObjectIdEqualTo(Integer value) {
            addCriterion("objectId =", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotEqualTo(Integer value) {
            addCriterion("objectId <>", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThan(Integer value) {
            addCriterion("objectId >", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("objectId >=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThan(Integer value) {
            addCriterion("objectId <", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("objectId <=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdIn(List<Integer> values) {
            addCriterion("objectId in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotIn(List<Integer> values) {
            addCriterion("objectId not in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdBetween(Integer value1, Integer value2) {
            addCriterion("objectId between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("objectId not between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectKindIsNull() {
            addCriterion("objectKind is null");
            return (Criteria) this;
        }

        public Criteria andObjectKindIsNotNull() {
            addCriterion("objectKind is not null");
            return (Criteria) this;
        }

        public Criteria andObjectKindEqualTo(Integer value) {
            addCriterion("objectKind =", value, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindNotEqualTo(Integer value) {
            addCriterion("objectKind <>", value, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindGreaterThan(Integer value) {
            addCriterion("objectKind >", value, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("objectKind >=", value, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindLessThan(Integer value) {
            addCriterion("objectKind <", value, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindLessThanOrEqualTo(Integer value) {
            addCriterion("objectKind <=", value, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindIn(List<Integer> values) {
            addCriterion("objectKind in", values, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindNotIn(List<Integer> values) {
            addCriterion("objectKind not in", values, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindBetween(Integer value1, Integer value2) {
            addCriterion("objectKind between", value1, value2, "objectKind");
            return (Criteria) this;
        }

        public Criteria andObjectKindNotBetween(Integer value1, Integer value2) {
            addCriterion("objectKind not between", value1, value2, "objectKind");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("imageId is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("imageId is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Integer value) {
            addCriterion("imageId =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Integer value) {
            addCriterion("imageId <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Integer value) {
            addCriterion("imageId >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("imageId >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Integer value) {
            addCriterion("imageId <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("imageId <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Integer> values) {
            addCriterion("imageId in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Integer> values) {
            addCriterion("imageId not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Integer value1, Integer value2) {
            addCriterion("imageId between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("imageId not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("videoId is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("videoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Integer value) {
            addCriterion("videoId =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Integer value) {
            addCriterion("videoId <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Integer value) {
            addCriterion("videoId >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoId >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Integer value) {
            addCriterion("videoId <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Integer value) {
            addCriterion("videoId <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Integer> values) {
            addCriterion("videoId in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Integer> values) {
            addCriterion("videoId not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Integer value1, Integer value2) {
            addCriterion("videoId between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("videoId not between", value1, value2, "videoId");
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

        public Criteria andTotalLikeIsNull() {
            addCriterion("totalLike is null");
            return (Criteria) this;
        }

        public Criteria andTotalLikeIsNotNull() {
            addCriterion("totalLike is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLikeEqualTo(Integer value) {
            addCriterion("totalLike =", value, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeNotEqualTo(Integer value) {
            addCriterion("totalLike <>", value, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeGreaterThan(Integer value) {
            addCriterion("totalLike >", value, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalLike >=", value, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeLessThan(Integer value) {
            addCriterion("totalLike <", value, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeLessThanOrEqualTo(Integer value) {
            addCriterion("totalLike <=", value, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeIn(List<Integer> values) {
            addCriterion("totalLike in", values, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeNotIn(List<Integer> values) {
            addCriterion("totalLike not in", values, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeBetween(Integer value1, Integer value2) {
            addCriterion("totalLike between", value1, value2, "totalLike");
            return (Criteria) this;
        }

        public Criteria andTotalLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("totalLike not between", value1, value2, "totalLike");
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

        public Criteria andTotalPlayIsNull() {
            addCriterion("totalPlay is null");
            return (Criteria) this;
        }

        public Criteria andTotalPlayIsNotNull() {
            addCriterion("totalPlay is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPlayEqualTo(Integer value) {
            addCriterion("totalPlay =", value, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayNotEqualTo(Integer value) {
            addCriterion("totalPlay <>", value, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayGreaterThan(Integer value) {
            addCriterion("totalPlay >", value, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalPlay >=", value, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayLessThan(Integer value) {
            addCriterion("totalPlay <", value, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayLessThanOrEqualTo(Integer value) {
            addCriterion("totalPlay <=", value, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayIn(List<Integer> values) {
            addCriterion("totalPlay in", values, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayNotIn(List<Integer> values) {
            addCriterion("totalPlay not in", values, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayBetween(Integer value1, Integer value2) {
            addCriterion("totalPlay between", value1, value2, "totalPlay");
            return (Criteria) this;
        }

        public Criteria andTotalPlayNotBetween(Integer value1, Integer value2) {
            addCriterion("totalPlay not between", value1, value2, "totalPlay");
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