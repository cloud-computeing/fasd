package com.gzu.bbs.pojo;

import java.util.ArrayList;
import java.util.List;

public class PlatetypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlatetypeExample() {
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

        public Criteria andPlatetypeidIsNull() {
            addCriterion("plateTypeId is null");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidIsNotNull() {
            addCriterion("plateTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidEqualTo(Integer value) {
            addCriterion("plateTypeId =", value, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidNotEqualTo(Integer value) {
            addCriterion("plateTypeId <>", value, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidGreaterThan(Integer value) {
            addCriterion("plateTypeId >", value, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("plateTypeId >=", value, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidLessThan(Integer value) {
            addCriterion("plateTypeId <", value, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("plateTypeId <=", value, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidIn(List<Integer> values) {
            addCriterion("plateTypeId in", values, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidNotIn(List<Integer> values) {
            addCriterion("plateTypeId not in", values, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidBetween(Integer value1, Integer value2) {
            addCriterion("plateTypeId between", value1, value2, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("plateTypeId not between", value1, value2, "platetypeid");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameIsNull() {
            addCriterion("plateTypeName is null");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameIsNotNull() {
            addCriterion("plateTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameEqualTo(String value) {
            addCriterion("plateTypeName =", value, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameNotEqualTo(String value) {
            addCriterion("plateTypeName <>", value, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameGreaterThan(String value) {
            addCriterion("plateTypeName >", value, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("plateTypeName >=", value, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameLessThan(String value) {
            addCriterion("plateTypeName <", value, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameLessThanOrEqualTo(String value) {
            addCriterion("plateTypeName <=", value, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameLike(String value) {
            addCriterion("plateTypeName like", value, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameNotLike(String value) {
            addCriterion("plateTypeName not like", value, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameIn(List<String> values) {
            addCriterion("plateTypeName in", values, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameNotIn(List<String> values) {
            addCriterion("plateTypeName not in", values, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameBetween(String value1, String value2) {
            addCriterion("plateTypeName between", value1, value2, "platetypename");
            return (Criteria) this;
        }

        public Criteria andPlatetypenameNotBetween(String value1, String value2) {
            addCriterion("plateTypeName not between", value1, value2, "platetypename");
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