package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.EduUserChangeApply;
import com.pinde.sci.model.mo.EduUserChangeApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduUserChangeApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int countByExample(EduUserChangeApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int deleteByExample(EduUserChangeApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int deleteByPrimaryKey(String recordFlow);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int insert(EduUserChangeApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int insertSelective(EduUserChangeApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    List<EduUserChangeApply> selectByExampleWithBLOBs(EduUserChangeApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    List<EduUserChangeApply> selectByExample(EduUserChangeApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    EduUserChangeApply selectByPrimaryKey(String recordFlow);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int updateByExampleSelective(@Param("record") EduUserChangeApply record, @Param("example") EduUserChangeApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") EduUserChangeApply record, @Param("example") EduUserChangeApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int updateByExample(@Param("record") EduUserChangeApply record, @Param("example") EduUserChangeApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int updateByPrimaryKeySelective(EduUserChangeApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(EduUserChangeApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.EDU_USER_CHANGE_APPLY
     *
     * @mbggenerated Wed Aug 19 10:44:19 CST 2015
     */
    int updateByPrimaryKey(EduUserChangeApply record);
}