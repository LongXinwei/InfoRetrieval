package com.example.infoRetrieval.pojo;

public class Stemmer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stemmer.varia
     *
     * @mbggenerated Sat Jun 02 23:00:51 CST 2018
     */
    private String varia;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stemmer.stem
     *
     * @mbggenerated Sat Jun 02 23:00:51 CST 2018
     */
    private String stem;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stemmer.varia
     *
     * @return the value of stemmer.varia
     *
     * @mbggenerated Sat Jun 02 23:00:51 CST 2018
     */
    public String getVaria() {
        return varia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stemmer.varia
     *
     * @param varia the value for stemmer.varia
     *
     * @mbggenerated Sat Jun 02 23:00:51 CST 2018
     */
    public void setVaria(String varia) {
        this.varia = varia == null ? null : varia.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stemmer.stem
     *
     * @return the value of stemmer.stem
     *
     * @mbggenerated Sat Jun 02 23:00:51 CST 2018
     */
    public String getStem() {
        return stem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stemmer.stem
     *
     * @param stem the value for stemmer.stem
     *
     * @mbggenerated Sat Jun 02 23:00:51 CST 2018
     */
    public void setStem(String stem) {
        this.stem = stem == null ? null : stem.trim();
    }
}