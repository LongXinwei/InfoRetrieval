package com.example.infoRetrieval.pojo;

public class Lyrics {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lyrics.doc
     *
     * @mbggenerated Sun Jun 03 23:06:25 GMT+08:00 2018
     */
    private String doc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lyrics.lyric
     *
     * @mbggenerated Sun Jun 03 23:06:25 GMT+08:00 2018
     */
    private String lyric;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lyrics.doc
     *
     * @return the value of lyrics.doc
     *
     * @mbggenerated Sun Jun 03 23:06:25 GMT+08:00 2018
     */
    public String getDoc() {
        return doc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lyrics.doc
     *
     * @param doc the value for lyrics.doc
     *
     * @mbggenerated Sun Jun 03 23:06:25 GMT+08:00 2018
     */
    public void setDoc(String doc) {
        this.doc = doc == null ? null : doc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lyrics.lyric
     *
     * @return the value of lyrics.lyric
     *
     * @mbggenerated Sun Jun 03 23:06:25 GMT+08:00 2018
     */
    public String getLyric() {
        return lyric;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lyrics.lyric
     *
     * @param lyric the value for lyrics.lyric
     *
     * @mbggenerated Sun Jun 03 23:06:25 GMT+08:00 2018
     */
    public void setLyric(String lyric) {
        this.lyric = lyric == null ? null : lyric.trim();
    }
}