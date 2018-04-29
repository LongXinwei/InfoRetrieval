package com.example.infoRetrieval.dao;

import com.example.infoRetrieval.pojo.BeforeIndex;
import com.example.infoRetrieval.pojo.BeforeIndexExample;
import com.example.infoRetrieval.pojo.BeforeIndexKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BeforeIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int countByExample(BeforeIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int deleteByExample(BeforeIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int deleteByPrimaryKey(BeforeIndexKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int insert(BeforeIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int insertSelective(BeforeIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    List<BeforeIndex> selectByExample(BeforeIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    BeforeIndex selectByPrimaryKey(BeforeIndexKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int updateByExampleSelective(@Param("record") BeforeIndex record, @Param("example") BeforeIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int updateByExample(@Param("record") BeforeIndex record, @Param("example") BeforeIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int updateByPrimaryKeySelective(BeforeIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table before_index
     *
     * @mbggenerated Sun Apr 29 13:37:54 GMT+08:00 2018
     */
    int updateByPrimaryKey(BeforeIndex record);
}