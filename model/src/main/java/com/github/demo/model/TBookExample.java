package com.github.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBookExample() {
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdIsNull() {
            addCriterion("coverIconId is null");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdIsNotNull() {
            addCriterion("coverIconId is not null");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdEqualTo(Integer value) {
            addCriterion("coverIconId =", value, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdNotEqualTo(Integer value) {
            addCriterion("coverIconId <>", value, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdGreaterThan(Integer value) {
            addCriterion("coverIconId >", value, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coverIconId >=", value, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdLessThan(Integer value) {
            addCriterion("coverIconId <", value, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdLessThanOrEqualTo(Integer value) {
            addCriterion("coverIconId <=", value, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdIn(List<Integer> values) {
            addCriterion("coverIconId in", values, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdNotIn(List<Integer> values) {
            addCriterion("coverIconId not in", values, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdBetween(Integer value1, Integer value2) {
            addCriterion("coverIconId between", value1, value2, "coverIconId");
            return (Criteria) this;
        }

        public Criteria andCoverIconIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coverIconId not between", value1, value2, "coverIconId");
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

        public Criteria andParentCategoryIdIsNull() {
            addCriterion("parentCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNotNull() {
            addCriterion("parentCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdEqualTo(Integer value) {
            addCriterion("parentCategoryId =", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotEqualTo(Integer value) {
            addCriterion("parentCategoryId <>", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThan(Integer value) {
            addCriterion("parentCategoryId >", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentCategoryId >=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThan(Integer value) {
            addCriterion("parentCategoryId <", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("parentCategoryId <=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIn(List<Integer> values) {
            addCriterion("parentCategoryId in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotIn(List<Integer> values) {
            addCriterion("parentCategoryId not in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("parentCategoryId between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parentCategoryId not between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andTotalOwnerIsNull() {
            addCriterion("totalOwner is null");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerIsNotNull() {
            addCriterion("totalOwner is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerEqualTo(Integer value) {
            addCriterion("totalOwner =", value, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerNotEqualTo(Integer value) {
            addCriterion("totalOwner <>", value, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerGreaterThan(Integer value) {
            addCriterion("totalOwner >", value, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalOwner >=", value, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerLessThan(Integer value) {
            addCriterion("totalOwner <", value, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("totalOwner <=", value, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerIn(List<Integer> values) {
            addCriterion("totalOwner in", values, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerNotIn(List<Integer> values) {
            addCriterion("totalOwner not in", values, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerBetween(Integer value1, Integer value2) {
            addCriterion("totalOwner between", value1, value2, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("totalOwner not between", value1, value2, "totalOwner");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeIsNull() {
            addCriterion("totalExchange is null");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeIsNotNull() {
            addCriterion("totalExchange is not null");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeEqualTo(Integer value) {
            addCriterion("totalExchange =", value, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeNotEqualTo(Integer value) {
            addCriterion("totalExchange <>", value, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeGreaterThan(Integer value) {
            addCriterion("totalExchange >", value, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalExchange >=", value, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeLessThan(Integer value) {
            addCriterion("totalExchange <", value, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeLessThanOrEqualTo(Integer value) {
            addCriterion("totalExchange <=", value, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeIn(List<Integer> values) {
            addCriterion("totalExchange in", values, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeNotIn(List<Integer> values) {
            addCriterion("totalExchange not in", values, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeBetween(Integer value1, Integer value2) {
            addCriterion("totalExchange between", value1, value2, "totalExchange");
            return (Criteria) this;
        }

        public Criteria andTotalExchangeNotBetween(Integer value1, Integer value2) {
            addCriterion("totalExchange not between", value1, value2, "totalExchange");
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