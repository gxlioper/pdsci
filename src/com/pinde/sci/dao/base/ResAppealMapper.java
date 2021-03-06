package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.ResAppeal;
import com.pinde.sci.model.mo.ResAppealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResAppealMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int countByExample(ResAppealExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int deleteByExample(ResAppealExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int deleteByPrimaryKey(String appealFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int insert(ResAppeal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int insertSelective(ResAppeal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	List<ResAppeal> selectByExample(ResAppealExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	ResAppeal selectByPrimaryKey(String appealFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int updateByExampleSelective(@Param("record") ResAppeal record,
			@Param("example") ResAppealExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int updateByExample(@Param("record") ResAppeal record,
			@Param("example") ResAppealExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int updateByPrimaryKeySelective(ResAppeal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_APPEAL
	 * @mbggenerated  Wed Aug 26 08:35:07 CST 2015
	 */
	int updateByPrimaryKey(ResAppeal record);
}