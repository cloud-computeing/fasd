package com.gzu.bbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPosttitleIsNull() {
            addCriterion("postTitle is null");
            return (Criteria) this;
        }

        public Criteria andPosttitleIsNotNull() {
            addCriterion("postTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPosttitleEqualTo(String value) {
            addCriterion("postTitle =", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotEqualTo(String value) {
            addCriterion("postTitle <>", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleGreaterThan(String value) {
            addCriterion("postTitle >", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleGreaterThanOrEqualTo(String value) {
            addCriterion("postTitle >=", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLessThan(String value) {
            addCriterion("postTitle <", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLessThanOrEqualTo(String value) {
            addCriterion("postTitle <=", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLike(String value) {
            addCriterion("postTitle like", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotLike(String value) {
            addCriterion("postTitle not like", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleIn(List<String> values) {
            addCriterion("postTitle in", values, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotIn(List<String> values) {
            addCriterion("postTitle not in", values, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleBetween(String value1, String value2) {
            addCriterion("postTitle between", value1, value2, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotBetween(String value1, String value2) {
            addCriterion("postTitle not between", value1, value2, "posttitle");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andClickamountIsNull() {
            addCriterion("clickAmount is null");
            return (Criteria) this;
        }

        public Criteria andClickamountIsNotNull() {
            addCriterion("clickAmount is not null");
            return (Criteria) this;
        }

        public Criteria andClickamountEqualTo(Integer value) {
            addCriterion("clickAmount =", value, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountNotEqualTo(Integer value) {
            addCriterion("clickAmount <>", value, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountGreaterThan(Integer value) {
            addCriterion("clickAmount >", value, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("clickAmount >=", value, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountLessThan(Integer value) {
            addCriterion("clickAmount <", value, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountLessThanOrEqualTo(Integer value) {
            addCriterion("clickAmount <=", value, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountIn(List<Integer> values) {
            addCriterion("clickAmount in", values, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountNotIn(List<Integer> values) {
            addCriterion("clickAmount not in", values, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountBetween(Integer value1, Integer value2) {
            addCriterion("clickAmount between", value1, value2, "clickamount");
            return (Criteria) this;
        }

        public Criteria andClickamountNotBetween(Integer value1, Integer value2) {
            addCriterion("clickAmount not between", value1, value2, "clickamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountIsNull() {
            addCriterion("goodAmount is null");
            return (Criteria) this;
        }

        public Criteria andGoodamountIsNotNull() {
            addCriterion("goodAmount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodamountEqualTo(Integer value) {
            addCriterion("goodAmount =", value, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountNotEqualTo(Integer value) {
            addCriterion("goodAmount <>", value, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountGreaterThan(Integer value) {
            addCriterion("goodAmount >", value, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodAmount >=", value, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountLessThan(Integer value) {
            addCriterion("goodAmount <", value, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountLessThanOrEqualTo(Integer value) {
            addCriterion("goodAmount <=", value, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountIn(List<Integer> values) {
            addCriterion("goodAmount in", values, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountNotIn(List<Integer> values) {
            addCriterion("goodAmount not in", values, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountBetween(Integer value1, Integer value2) {
            addCriterion("goodAmount between", value1, value2, "goodamount");
            return (Criteria) this;
        }

        public Criteria andGoodamountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodAmount not between", value1, value2, "goodamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountIsNull() {
            addCriterion("replyAmount is null");
            return (Criteria) this;
        }

        public Criteria andReplyamountIsNotNull() {
            addCriterion("replyAmount is not null");
            return (Criteria) this;
        }

        public Criteria andReplyamountEqualTo(Integer value) {
            addCriterion("replyAmount =", value, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountNotEqualTo(Integer value) {
            addCriterion("replyAmount <>", value, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountGreaterThan(Integer value) {
            addCriterion("replyAmount >", value, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyAmount >=", value, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountLessThan(Integer value) {
            addCriterion("replyAmount <", value, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountLessThanOrEqualTo(Integer value) {
            addCriterion("replyAmount <=", value, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountIn(List<Integer> values) {
            addCriterion("replyAmount in", values, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountNotIn(List<Integer> values) {
            addCriterion("replyAmount not in", values, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountBetween(Integer value1, Integer value2) {
            addCriterion("replyAmount between", value1, value2, "replyamount");
            return (Criteria) this;
        }

        public Criteria andReplyamountNotBetween(Integer value1, Integer value2) {
            addCriterion("replyAmount not between", value1, value2, "replyamount");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeIsNull() {
            addCriterion("latestReplyTime is null");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeIsNotNull() {
            addCriterion("latestReplyTime is not null");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("latestReplyTime =", value, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("latestReplyTime <>", value, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("latestReplyTime >", value, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latestReplyTime >=", value, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeLessThan(Date value) {
            addCriterionForJDBCDate("latestReplyTime <", value, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latestReplyTime <=", value, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("latestReplyTime in", values, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("latestReplyTime not in", values, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latestReplyTime between", value1, value2, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andLatestreplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latestReplyTime not between", value1, value2, "latestreplytime");
            return (Criteria) this;
        }

        public Criteria andPictureidIsNull() {
            addCriterion("pictureId is null");
            return (Criteria) this;
        }

        public Criteria andPictureidIsNotNull() {
            addCriterion("pictureId is not null");
            return (Criteria) this;
        }

        public Criteria andPictureidEqualTo(String value) {
            addCriterion("pictureId =", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotEqualTo(String value) {
            addCriterion("pictureId <>", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThan(String value) {
            addCriterion("pictureId >", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThanOrEqualTo(String value) {
            addCriterion("pictureId >=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThan(String value) {
            addCriterion("pictureId <", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThanOrEqualTo(String value) {
            addCriterion("pictureId <=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLike(String value) {
            addCriterion("pictureId like", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotLike(String value) {
            addCriterion("pictureId not like", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidIn(List<String> values) {
            addCriterion("pictureId in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotIn(List<String> values) {
            addCriterion("pictureId not in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidBetween(String value1, String value2) {
            addCriterion("pictureId between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotBetween(String value1, String value2) {
            addCriterion("pictureId not between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andTopflagIsNull() {
            addCriterion("topFlag is null");
            return (Criteria) this;
        }

        public Criteria andTopflagIsNotNull() {
            addCriterion("topFlag is not null");
            return (Criteria) this;
        }

        public Criteria andTopflagEqualTo(Integer value) {
            addCriterion("topFlag =", value, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagNotEqualTo(Integer value) {
            addCriterion("topFlag <>", value, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagGreaterThan(Integer value) {
            addCriterion("topFlag >", value, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("topFlag >=", value, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagLessThan(Integer value) {
            addCriterion("topFlag <", value, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagLessThanOrEqualTo(Integer value) {
            addCriterion("topFlag <=", value, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagIn(List<Integer> values) {
            addCriterion("topFlag in", values, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagNotIn(List<Integer> values) {
            addCriterion("topFlag not in", values, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagBetween(Integer value1, Integer value2) {
            addCriterion("topFlag between", value1, value2, "topflag");
            return (Criteria) this;
        }

        public Criteria andTopflagNotBetween(Integer value1, Integer value2) {
            addCriterion("topFlag not between", value1, value2, "topflag");
            return (Criteria) this;
        }

        public Criteria andPlateidIsNull() {
            addCriterion("plateId is null");
            return (Criteria) this;
        }

        public Criteria andPlateidIsNotNull() {
            addCriterion("plateId is not null");
            return (Criteria) this;
        }

        public Criteria andPlateidEqualTo(Integer value) {
            addCriterion("plateId =", value, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidNotEqualTo(Integer value) {
            addCriterion("plateId <>", value, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidGreaterThan(Integer value) {
            addCriterion("plateId >", value, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("plateId >=", value, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidLessThan(Integer value) {
            addCriterion("plateId <", value, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidLessThanOrEqualTo(Integer value) {
            addCriterion("plateId <=", value, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidIn(List<Integer> values) {
            addCriterion("plateId in", values, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidNotIn(List<Integer> values) {
            addCriterion("plateId not in", values, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidBetween(Integer value1, Integer value2) {
            addCriterion("plateId between", value1, value2, "plateid");
            return (Criteria) this;
        }

        public Criteria andPlateidNotBetween(Integer value1, Integer value2) {
            addCriterion("plateId not between", value1, value2, "plateid");
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