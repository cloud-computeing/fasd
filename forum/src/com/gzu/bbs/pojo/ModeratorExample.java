package com.gzu.bbs.pojo;

import java.util.ArrayList;
import java.util.List;

public class ModeratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModeratorExample() {
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

        public Criteria andModeratoridIsNull() {
            addCriterion("moderatorId is null");
            return (Criteria) this;
        }

        public Criteria andModeratoridIsNotNull() {
            addCriterion("moderatorId is not null");
            return (Criteria) this;
        }

        public Criteria andModeratoridEqualTo(Integer value) {
            addCriterion("moderatorId =", value, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridNotEqualTo(Integer value) {
            addCriterion("moderatorId <>", value, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridGreaterThan(Integer value) {
            addCriterion("moderatorId >", value, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("moderatorId >=", value, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridLessThan(Integer value) {
            addCriterion("moderatorId <", value, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridLessThanOrEqualTo(Integer value) {
            addCriterion("moderatorId <=", value, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridIn(List<Integer> values) {
            addCriterion("moderatorId in", values, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridNotIn(List<Integer> values) {
            addCriterion("moderatorId not in", values, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridBetween(Integer value1, Integer value2) {
            addCriterion("moderatorId between", value1, value2, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratoridNotBetween(Integer value1, Integer value2) {
            addCriterion("moderatorId not between", value1, value2, "moderatorid");
            return (Criteria) this;
        }

        public Criteria andModeratornameIsNull() {
            addCriterion("moderatorName is null");
            return (Criteria) this;
        }

        public Criteria andModeratornameIsNotNull() {
            addCriterion("moderatorName is not null");
            return (Criteria) this;
        }

        public Criteria andModeratornameEqualTo(String value) {
            addCriterion("moderatorName =", value, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameNotEqualTo(String value) {
            addCriterion("moderatorName <>", value, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameGreaterThan(String value) {
            addCriterion("moderatorName >", value, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameGreaterThanOrEqualTo(String value) {
            addCriterion("moderatorName >=", value, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameLessThan(String value) {
            addCriterion("moderatorName <", value, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameLessThanOrEqualTo(String value) {
            addCriterion("moderatorName <=", value, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameLike(String value) {
            addCriterion("moderatorName like", value, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameNotLike(String value) {
            addCriterion("moderatorName not like", value, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameIn(List<String> values) {
            addCriterion("moderatorName in", values, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameNotIn(List<String> values) {
            addCriterion("moderatorName not in", values, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameBetween(String value1, String value2) {
            addCriterion("moderatorName between", value1, value2, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratornameNotBetween(String value1, String value2) {
            addCriterion("moderatorName not between", value1, value2, "moderatorname");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordIsNull() {
            addCriterion("moderatorPassWord is null");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordIsNotNull() {
            addCriterion("moderatorPassWord is not null");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordEqualTo(String value) {
            addCriterion("moderatorPassWord =", value, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordNotEqualTo(String value) {
            addCriterion("moderatorPassWord <>", value, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordGreaterThan(String value) {
            addCriterion("moderatorPassWord >", value, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("moderatorPassWord >=", value, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordLessThan(String value) {
            addCriterion("moderatorPassWord <", value, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordLessThanOrEqualTo(String value) {
            addCriterion("moderatorPassWord <=", value, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordLike(String value) {
            addCriterion("moderatorPassWord like", value, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordNotLike(String value) {
            addCriterion("moderatorPassWord not like", value, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordIn(List<String> values) {
            addCriterion("moderatorPassWord in", values, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordNotIn(List<String> values) {
            addCriterion("moderatorPassWord not in", values, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordBetween(String value1, String value2) {
            addCriterion("moderatorPassWord between", value1, value2, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorpasswordNotBetween(String value1, String value2) {
            addCriterion("moderatorPassWord not between", value1, value2, "moderatorpassword");
            return (Criteria) this;
        }

        public Criteria andModeratorsexIsNull() {
            addCriterion("moderatorSex is null");
            return (Criteria) this;
        }

        public Criteria andModeratorsexIsNotNull() {
            addCriterion("moderatorSex is not null");
            return (Criteria) this;
        }

        public Criteria andModeratorsexEqualTo(String value) {
            addCriterion("moderatorSex =", value, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexNotEqualTo(String value) {
            addCriterion("moderatorSex <>", value, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexGreaterThan(String value) {
            addCriterion("moderatorSex >", value, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexGreaterThanOrEqualTo(String value) {
            addCriterion("moderatorSex >=", value, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexLessThan(String value) {
            addCriterion("moderatorSex <", value, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexLessThanOrEqualTo(String value) {
            addCriterion("moderatorSex <=", value, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexLike(String value) {
            addCriterion("moderatorSex like", value, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexNotLike(String value) {
            addCriterion("moderatorSex not like", value, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexIn(List<String> values) {
            addCriterion("moderatorSex in", values, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexNotIn(List<String> values) {
            addCriterion("moderatorSex not in", values, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexBetween(String value1, String value2) {
            addCriterion("moderatorSex between", value1, value2, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorsexNotBetween(String value1, String value2) {
            addCriterion("moderatorSex not between", value1, value2, "moderatorsex");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidIsNull() {
            addCriterion("moderatorHeadId is null");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidIsNotNull() {
            addCriterion("moderatorHeadId is not null");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidEqualTo(String value) {
            addCriterion("moderatorHeadId =", value, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidNotEqualTo(String value) {
            addCriterion("moderatorHeadId <>", value, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidGreaterThan(String value) {
            addCriterion("moderatorHeadId >", value, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidGreaterThanOrEqualTo(String value) {
            addCriterion("moderatorHeadId >=", value, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidLessThan(String value) {
            addCriterion("moderatorHeadId <", value, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidLessThanOrEqualTo(String value) {
            addCriterion("moderatorHeadId <=", value, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidLike(String value) {
            addCriterion("moderatorHeadId like", value, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidNotLike(String value) {
            addCriterion("moderatorHeadId not like", value, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidIn(List<String> values) {
            addCriterion("moderatorHeadId in", values, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidNotIn(List<String> values) {
            addCriterion("moderatorHeadId not in", values, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidBetween(String value1, String value2) {
            addCriterion("moderatorHeadId between", value1, value2, "moderatorheadid");
            return (Criteria) this;
        }

        public Criteria andModeratorheadidNotBetween(String value1, String value2) {
            addCriterion("moderatorHeadId not between", value1, value2, "moderatorheadid");
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