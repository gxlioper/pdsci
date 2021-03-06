package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.FstuProj;
import com.pinde.sci.model.mo.FstuProjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FstuProjMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int countByExample(FstuProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int deleteByExample(FstuProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int deleteByPrimaryKey(String projFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int insert(FstuProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int insertSelective(FstuProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	List<FstuProj> selectByExample(FstuProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	FstuProj selectByPrimaryKey(String projFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int updateByExampleSelective(@Param("record") FstuProj record,
			@Param("example") FstuProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int updateByExample(@Param("record") FstuProj record,
			@Param("example") FstuProjExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int updateByPrimaryKeySelective(FstuProj record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.FSTU_PROJ
	 * @mbggenerated  Fri Jul 03 15:49:04 CST 2015
	 */
	int updateByPrimaryKey(FstuProj record);
}