package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.ErpCrmContractRef;
import com.pinde.sci.model.mo.ErpCrmContractRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpCrmContractRefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int countByExample(ErpCrmContractRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int deleteByExample(ErpCrmContractRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int deleteByPrimaryKey(String recordFlow);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int insert(ErpCrmContractRef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int insertSelective(ErpCrmContractRef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    List<ErpCrmContractRef> selectByExample(ErpCrmContractRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    ErpCrmContractRef selectByPrimaryKey(String recordFlow);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int updateByExampleSelective(@Param("record") ErpCrmContractRef record, @Param("example") ErpCrmContractRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int updateByExample(@Param("record") ErpCrmContractRef record, @Param("example") ErpCrmContractRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int updateByPrimaryKeySelective(ErpCrmContractRef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PDSCI.ERP_CRM_CONTRACT_REF
     *
     * @mbggenerated Fri Dec 26 15:36:44 GMT+08:00 2014
     */
    int updateByPrimaryKey(ErpCrmContractRef record);
}