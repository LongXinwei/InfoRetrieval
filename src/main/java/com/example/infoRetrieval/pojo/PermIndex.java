package com.example.infoRetrieval.pojo;

public class PermIndex {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perm_index.varia
     *
     * @mbggenerated Sun May 06 17:07:00 GMT+08:00 2018
     */
    private String varia;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perm_index.proto
     *
     * @mbggenerated Sun May 06 17:07:00 GMT+08:00 2018
     */
    private String proto;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perm_index.varia
     *
     * @return the value of perm_index.varia
     *
     * @mbggenerated Sun May 06 17:07:00 GMT+08:00 2018
     */
    public String getVaria() {
        return varia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perm_index.varia
     *
     * @param varia the value for perm_index.varia
     *
     * @mbggenerated Sun May 06 17:07:00 GMT+08:00 2018
     */
    public void setVaria(String varia) {
        this.varia = varia == null ? null : varia.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perm_index.proto
     *
     * @return the value of perm_index.proto
     *
     * @mbggenerated Sun May 06 17:07:00 GMT+08:00 2018
     */
    public String getProto() {
        return proto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perm_index.proto
     *
     * @param proto the value for perm_index.proto
     *
     * @mbggenerated Sun May 06 17:07:00 GMT+08:00 2018
     */
    public void setProto(String proto) {
        this.proto = proto == null ? null : proto.trim();
    }
}