package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.SrmFundSchemeDetail;
import com.pinde.sci.model.mo.SrmFundSchemeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrmFundSchemeDetailMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int countByExample(SrmFundSchemeDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByExample(SrmFundSchemeDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int deleteByPrimaryKey(String itemFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insert(SrmFundSchemeDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int insertSelective(SrmFundSchemeDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	List<SrmFundSchemeDetail> selectByExample(SrmFundSchemeDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	SrmFundSchemeDetail selectByPrimaryKey(String itemFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExampleSelective(@Param("record") SrmFundSchemeDetail record,
			@Param("example") SrmFundSchemeDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByExample(@Param("record") SrmFundSchemeDetail record,
			@Param("example") SrmFundSchemeDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKeySelective(SrmFundSchemeDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.SRM_FUND_SCHEME_DETAIL
	 * @mbggenerated  Thu Aug 21 17:48:25 CST 2014
	 */
	int updateByPrimaryKey(SrmFundSchemeDetail record);
}