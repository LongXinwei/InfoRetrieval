package com.example.infoRetrieval.pojo;

import java.util.ArrayList;
import java.util.List;

public class AfterIndexExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public AfterIndexExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
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
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
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
            addCriterion("Term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("Term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("Term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("Term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("Term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("Term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("Term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("Term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("Term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("Term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("Term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("Term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("Term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("Term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andNDocsIsNull() {
            addCriterion("N_docs is null");
            return (Criteria) this;
        }

        public Criteria andNDocsIsNotNull() {
            addCriterion("N_docs is not null");
            return (Criteria) this;
        }

        public Criteria andNDocsEqualTo(Integer value) {
            addCriterion("N_docs =", value, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsNotEqualTo(Integer value) {
            addCriterion("N_docs <>", value, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsGreaterThan(Integer value) {
            addCriterion("N_docs >", value, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_docs >=", value, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsLessThan(Integer value) {
            addCriterion("N_docs <", value, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsLessThanOrEqualTo(Integer value) {
            addCriterion("N_docs <=", value, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsIn(List<Integer> values) {
            addCriterion("N_docs in", values, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsNotIn(List<Integer> values) {
            addCriterion("N_docs not in", values, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsBetween(Integer value1, Integer value2) {
            addCriterion("N_docs between", value1, value2, "nDocs");
            return (Criteria) this;
        }

        public Criteria andNDocsNotBetween(Integer value1, Integer value2) {
            addCriterion("N_docs not between", value1, value2, "nDocs");
            return (Criteria) this;
        }

        public Criteria andFreqIsNull() {
            addCriterion("freq is null");
            return (Criteria) this;
        }

        public Criteria andFreqIsNotNull() {
            addCriterion("freq is not null");
            return (Criteria) this;
        }

        public Criteria andFreqEqualTo(Integer value) {
            addCriterion("freq =", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotEqualTo(Integer value) {
            addCriterion("freq <>", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThan(Integer value) {
            addCriterion("freq >", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThanOrEqualTo(Integer value) {
            addCriterion("freq >=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThan(Integer value) {
            addCriterion("freq <", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThanOrEqualTo(Integer value) {
            addCriterion("freq <=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqIn(List<Integer> values) {
            addCriterion("freq in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotIn(List<Integer> values) {
            addCriterion("freq not in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqBetween(Integer value1, Integer value2) {
            addCriterion("freq between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotBetween(Integer value1, Integer value2) {
            addCriterion("freq not between", value1, value2, "freq");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table after_index
     *
     * @mbggenerated do_not_delete_during_merge Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table after_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
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