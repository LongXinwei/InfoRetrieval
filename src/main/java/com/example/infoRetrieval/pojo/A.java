package com.example.infoRetrieval.pojo;

public class A {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a.term
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    private String term;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a.a
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    private Float a;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a.term
     *
     * @return the value of a.term
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public String getTerm() {
        return term;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a.term
     *
     * @param term the value for a.term
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a.a
     *
     * @return the value of a.a
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public Float getA() {
        return a;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a.a
     *
     * @param a the value for a.a
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void setA(Float a) {
        this.a = a;
    }
}