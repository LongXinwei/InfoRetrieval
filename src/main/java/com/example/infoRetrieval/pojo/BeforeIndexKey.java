package com.example.infoRetrieval.pojo;

public class BeforeIndexKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column before_index.Term
     *
     * @mbggenerated Tue May 01 12:50:14 CST 2018
     */
    private String term;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column before_index.doc
     *
     * @mbggenerated Tue May 01 12:50:14 CST 2018
     */
    private String doc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column before_index.Term
     *
     * @return the value of before_index.Term
     *
     * @mbggenerated Tue May 01 12:50:14 CST 2018
     */
    public String getTerm() {
        return term;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column before_index.Term
     *
     * @param term the value for before_index.Term
     *
     * @mbggenerated Tue May 01 12:50:14 CST 2018
     */
    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column before_index.doc
     *
     * @return the value of before_index.doc
     *
     * @mbggenerated Tue May 01 12:50:14 CST 2018
     */
    public String getDoc() {
        return doc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column before_index.doc
     *
     * @param doc the value for before_index.doc
     *
     * @mbggenerated Tue May 01 12:50:14 CST 2018
     */
    public void setDoc(String doc) {
        this.doc = doc == null ? null : doc.trim();
    }
}