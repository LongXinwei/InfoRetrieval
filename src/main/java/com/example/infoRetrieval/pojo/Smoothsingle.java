package com.example.infoRetrieval.pojo;

public class Smoothsingle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smoothsingle.term
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    private String term;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smoothsingle.doc
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    private String doc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smoothsingle.freq
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    private Float freq;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smoothsingle.term
     *
     * @return the value of smoothsingle.term
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public String getTerm() {
        return term;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smoothsingle.term
     *
     * @param term the value for smoothsingle.term
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smoothsingle.doc
     *
     * @return the value of smoothsingle.doc
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public String getDoc() {
        return doc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smoothsingle.doc
     *
     * @param doc the value for smoothsingle.doc
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void setDoc(String doc) {
        this.doc = doc == null ? null : doc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smoothsingle.freq
     *
     * @return the value of smoothsingle.freq
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public Float getFreq() {
        return freq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smoothsingle.freq
     *
     * @param freq the value for smoothsingle.freq
     *
     * @mbggenerated Wed Jun 06 09:43:35 CST 2018
     */
    public void setFreq(Float freq) {
        this.freq = freq;
    }
}