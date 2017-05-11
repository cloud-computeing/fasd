package com.gzu.bbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andPostidIsNull() {
            addCriterion("postId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postId not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andReplyeridIsNull() {
            addCriterion("replyerId is null");
            return (Criteria) this;
        }

        public Criteria andReplyeridIsNotNull() {
            addCriterion("replyerId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyeridEqualTo(String value) {
            addCriterion("replyerId =", value, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridNotEqualTo(String value) {
            addCriterion("replyerId <>", value, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridGreaterThan(String value) {
            addCriterion("replyerId >", value, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridGreaterThanOrEqualTo(String value) {
            addCriterion("replyerId >=", value, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridLessThan(String value) {
            addCriterion("replyerId <", value, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridLessThanOrEqualTo(String value) {
            addCriterion("replyerId <=", value, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridLike(String value) {
            addCriterion("replyerId like", value, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridNotLike(String value) {
            addCriterion("replyerId not like", value, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridIn(List<String> values) {
            addCriterion("replyerId in", values, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridNotIn(List<String> values) {
            addCriterion("replyerId not in", values, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridBetween(String value1, String value2) {
            addCriterion("replyerId between", value1, value2, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyeridNotBetween(String value1, String value2) {
            addCriterion("replyerId not between", value1, value2, "replyerid");
            return (Criteria) this;
        }

        public Criteria andReplyernameIsNull() {
            addCriterion("replyerName is null");
            return (Criteria) this;
        }

        public Criteria andReplyernameIsNotNull() {
            addCriterion("replyerName is not null");
            return (Criteria) this;
        }

        public Criteria andReplyernameEqualTo(String value) {
            addCriterion("replyerName =", value, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameNotEqualTo(String value) {
            addCriterion("replyerName <>", value, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameGreaterThan(String value) {
            addCriterion("replyerName >", value, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameGreaterThanOrEqualTo(String value) {
            addCriterion("replyerName >=", value, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameLessThan(String value) {
            addCriterion("replyerName <", value, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameLessThanOrEqualTo(String value) {
            addCriterion("replyerName <=", value, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameLike(String value) {
            addCriterion("replyerName like", value, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameNotLike(String value) {
            addCriterion("replyerName not like", value, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameIn(List<String> values) {
            addCriterion("replyerName in", values, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameNotIn(List<String> values) {
            addCriterion("replyerName not in", values, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameBetween(String value1, String value2) {
            addCriterion("replyerName between", value1, value2, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplyernameNotBetween(String value1, String value2) {
            addCriterion("replyerName not between", value1, value2, "replyername");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("replyTime is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("replyTime is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("replyTime =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("replyTime <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("replyTime >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("replyTime >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(Date value) {
            addCriterionForJDBCDate("replyTime <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("replyTime <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("replyTime in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("replyTime not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("replyTime between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("replyTime not between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidIsNull() {
            addCriterion("replyToObjectId is null");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidIsNotNull() {
            addCriterion("replyToObjectId is not null");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidEqualTo(String value) {
            addCriterion("replyToObjectId =", value, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidNotEqualTo(String value) {
            addCriterion("replyToObjectId <>", value, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidGreaterThan(String value) {
            addCriterion("replyToObjectId >", value, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidGreaterThanOrEqualTo(String value) {
            addCriterion("replyToObjectId >=", value, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidLessThan(String value) {
            addCriterion("replyToObjectId <", value, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidLessThanOrEqualTo(String value) {
            addCriterion("replyToObjectId <=", value, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidLike(String value) {
            addCriterion("replyToObjectId like", value, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidNotLike(String value) {
            addCriterion("replyToObjectId not like", value, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidIn(List<String> values) {
            addCriterion("replyToObjectId in", values, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidNotIn(List<String> values) {
            addCriterion("replyToObjectId not in", values, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidBetween(String value1, String value2) {
            addCriterion("replyToObjectId between", value1, value2, "replytoobjectid");
            return (Criteria) this;
        }

        public Criteria andReplytoobjectidNotBetween(String value1, String value2) {
            addCriterion("replyToObjectId not between", value1, value2, "replytoobjectid");
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