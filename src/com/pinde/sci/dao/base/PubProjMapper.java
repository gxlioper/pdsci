package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.PubProj;
import com.pinde.sci.model.mo.PubProjExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PubProjMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int countByExample(PubProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int deleteByExample(PubProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int deleteByPrimaryKey(String projFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int insert(PubProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int insertSelective(PubProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	List<PubProj> selectByExampleWithBLOBs(PubProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	List<PubProj> selectByExample(PubProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	PubProj selectByPrimaryKey(String projFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int updateByExampleSelective(@Param("record") PubProj record,
			@Param("example") PubProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int updateByExampleWithBLOBs(@Param("record") PubProj record,
			@Param("example") PubProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int updateByExample(@Param("record") PubProj record,
			@Param("example") PubProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int updateByPrimaryKeySelective(PubProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int updateByPrimaryKeyWithBLOBs(PubProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PROJ
	 * @mbggenerated  Mon Nov 10 14:54:01 GMT+08:00 2014
	 */
	int updateByPrimaryKey(PubProj record);


}