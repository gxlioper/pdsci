package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.AidProj;
import com.pinde.sci.model.mo.AidProjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidProjMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int countByExample(AidProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int deleteByExample(AidProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int deleteByPrimaryKey(String projFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int insert(AidProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int insertSelective(AidProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	List<AidProj> selectByExampleWithBLOBs(AidProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	List<AidProj> selectByExample(AidProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	AidProj selectByPrimaryKey(String projFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int updateByExampleSelective(@Param("record") AidProj record,
			@Param("example") AidProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int updateByExampleWithBLOBs(@Param("record") AidProj record,
			@Param("example") AidProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int updateByExample(@Param("record") AidProj record,
			@Param("example") AidProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int updateByPrimaryKeySelective(AidProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int updateByPrimaryKeyWithBLOBs(AidProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.AID_PROJ
	 * @mbggenerated  Fri Jun 12 09:20:30 CST 2015
	 */
	int updateByPrimaryKey(AidProj record);
}