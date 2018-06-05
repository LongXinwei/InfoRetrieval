package com.example.infoRetrieval.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodexistsingleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public GoodexistsingleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
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

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andPIsNull() {
            addCriterion("P is null");
            return (Criteria) this;
        }

        public Criteria andPIsNotNull() {
            addCriterion("P is not null");
            return (Criteria) this;
        }

        public Criteria andPEqualTo(Float value) {
            addCriterion("P =", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotEqualTo(Float value) {
            addCriterion("P <>", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThan(Float value) {
            addCriterion("P >", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThanOrEqualTo(Float value) {
            addCriterion("P >=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThan(Float value) {
            addCriterion("P <", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThanOrEqualTo(Float value) {
            addCriterion("P <=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPIn(List<Float> values) {
            addCriterion("P in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPNotIn(List<Float> values) {
            addCriterion("P not in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPBetween(Float value1, Float value2) {
            addCriterion("P between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andPNotBetween(Float value1, Float value2) {
            addCriterion("P not between", value1, value2, "p");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goodexistsingle
     *
     * @mbggenerated do_not_delete_during_merge Wed Jun 06 09:43:35 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goodexistsingle
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
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