package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.EdcAttribute;
import com.pinde.sci.model.mo.EdcAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdcAttributeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int countByExample(EdcAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int deleteByExample(EdcAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int deleteByPrimaryKey(String attrFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int insert(EdcAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int insertSelective(EdcAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	List<EdcAttribute> selectByExample(EdcAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	EdcAttribute selectByPrimaryKey(String attrFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int updateByExampleSelective(@Param("record") EdcAttribute record,
			@Param("example") EdcAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int updateByExample(@Param("record") EdcAttribute record,
			@Param("example") EdcAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int updateByPrimaryKeySelective(EdcAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EDC_ATTRIBUTE
	 * @mbggenerated  Mon Apr 25 10:20:13 CST 2016
	 */
	int updateByPrimaryKey(EdcAttribute record);
}