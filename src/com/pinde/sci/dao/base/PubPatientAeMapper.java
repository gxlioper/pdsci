package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.PubPatientAe;
import com.pinde.sci.model.mo.PubPatientAeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PubPatientAeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int countByExample(PubPatientAeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int deleteByExample(PubPatientAeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int deleteByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int insert(PubPatientAe record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int insertSelective(PubPatientAe record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	List<PubPatientAe> selectByExampleWithBLOBs(PubPatientAeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	List<PubPatientAe> selectByExample(PubPatientAeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	PubPatientAe selectByPrimaryKey(String recordFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int updateByExampleSelective(@Param("record") PubPatientAe record,
			@Param("example") PubPatientAeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int updateByExampleWithBLOBs(@Param("record") PubPatientAe record,
			@Param("example") PubPatientAeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int updateByExample(@Param("record") PubPatientAe record,
			@Param("example") PubPatientAeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int updateByPrimaryKeySelective(PubPatientAe record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int updateByPrimaryKeyWithBLOBs(PubPatientAe record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.PUB_PATIENT_AE
	 * @mbggenerated  Mon Nov 03 14:50:24 GMT+08:00 2014
	 */
	int updateByPrimaryKey(PubPatientAe record);
}