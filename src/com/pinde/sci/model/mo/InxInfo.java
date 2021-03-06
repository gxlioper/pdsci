package com.pinde.sci.model.mo;

import org.springframework.web.bind.annotation.PathVariable;

import com.pinde.core.model.MybatisObject;

public class InxInfo extends MybatisObject {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.INFO_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String infoFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.INFO_TITLE
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String infoTitle;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.TITLE_IMG
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String titleImg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.COLUMN_ID
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String columnId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.COLUMN_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String columnName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.INFO_STATUS_ID
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String infoStatusId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.INFO_STATUS_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String infoStatusName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.INFO_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String infoTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.PASS_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String passTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.PASS_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String passUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.CANCEL_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String cancelTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.CANCEL_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String cancelUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.DELETE_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String deleteTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.DELETE_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String deleteUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.INFO_KEYWORD
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String infoKeyword;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.IS_TOP
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String isTop;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.VIEW_NUM
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private Long viewNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.RECORD_STATUS
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String recordStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.CREATE_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.CREATE_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String createUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.MODIFY_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String modifyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.MODIFY_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String modifyUserFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.ORG_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String orgFlow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.ORG_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String orgName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PDSCI.INX_INFO.INFO_CONTENT
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	private String infoContent;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.INFO_FLOW
	 * @return  the value of PDSCI.INX_INFO.INFO_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getInfoFlow() {
		return infoFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.INFO_FLOW
	 * @param infoFlow  the value for PDSCI.INX_INFO.INFO_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setInfoFlow(String infoFlow) {
		this.infoFlow = infoFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.INFO_TITLE
	 * @return  the value of PDSCI.INX_INFO.INFO_TITLE
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getInfoTitle() {
		return infoTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.INFO_TITLE
	 * @param infoTitle  the value for PDSCI.INX_INFO.INFO_TITLE
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.TITLE_IMG
	 * @return  the value of PDSCI.INX_INFO.TITLE_IMG
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getTitleImg() {
		return titleImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.TITLE_IMG
	 * @param titleImg  the value for PDSCI.INX_INFO.TITLE_IMG
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.COLUMN_ID
	 * @return  the value of PDSCI.INX_INFO.COLUMN_ID
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getColumnId() {
		return columnId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.COLUMN_ID
	 * @param columnId  the value for PDSCI.INX_INFO.COLUMN_ID
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.COLUMN_NAME
	 * @return  the value of PDSCI.INX_INFO.COLUMN_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.COLUMN_NAME
	 * @param columnName  the value for PDSCI.INX_INFO.COLUMN_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.INFO_STATUS_ID
	 * @return  the value of PDSCI.INX_INFO.INFO_STATUS_ID
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getInfoStatusId() {
		return infoStatusId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.INFO_STATUS_ID
	 * @param infoStatusId  the value for PDSCI.INX_INFO.INFO_STATUS_ID
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setInfoStatusId(String infoStatusId) {
		this.infoStatusId = infoStatusId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.INFO_STATUS_NAME
	 * @return  the value of PDSCI.INX_INFO.INFO_STATUS_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getInfoStatusName() {
		return infoStatusName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.INFO_STATUS_NAME
	 * @param infoStatusName  the value for PDSCI.INX_INFO.INFO_STATUS_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setInfoStatusName(String infoStatusName) {
		this.infoStatusName = infoStatusName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.INFO_TIME
	 * @return  the value of PDSCI.INX_INFO.INFO_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getInfoTime() {
		return infoTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.INFO_TIME
	 * @param infoTime  the value for PDSCI.INX_INFO.INFO_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setInfoTime(String infoTime) {
		this.infoTime = infoTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.PASS_TIME
	 * @return  the value of PDSCI.INX_INFO.PASS_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getPassTime() {
		return passTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.PASS_TIME
	 * @param passTime  the value for PDSCI.INX_INFO.PASS_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setPassTime(String passTime) {
		this.passTime = passTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.PASS_USER_FLOW
	 * @return  the value of PDSCI.INX_INFO.PASS_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getPassUserFlow() {
		return passUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.PASS_USER_FLOW
	 * @param passUserFlow  the value for PDSCI.INX_INFO.PASS_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setPassUserFlow(String passUserFlow) {
		this.passUserFlow = passUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.CANCEL_TIME
	 * @return  the value of PDSCI.INX_INFO.CANCEL_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getCancelTime() {
		return cancelTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.CANCEL_TIME
	 * @param cancelTime  the value for PDSCI.INX_INFO.CANCEL_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.CANCEL_USER_FLOW
	 * @return  the value of PDSCI.INX_INFO.CANCEL_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getCancelUserFlow() {
		return cancelUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.CANCEL_USER_FLOW
	 * @param cancelUserFlow  the value for PDSCI.INX_INFO.CANCEL_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setCancelUserFlow(String cancelUserFlow) {
		this.cancelUserFlow = cancelUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.DELETE_TIME
	 * @return  the value of PDSCI.INX_INFO.DELETE_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getDeleteTime() {
		return deleteTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.DELETE_TIME
	 * @param deleteTime  the value for PDSCI.INX_INFO.DELETE_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setDeleteTime(String deleteTime) {
		this.deleteTime = deleteTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.DELETE_USER_FLOW
	 * @return  the value of PDSCI.INX_INFO.DELETE_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getDeleteUserFlow() {
		return deleteUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.DELETE_USER_FLOW
	 * @param deleteUserFlow  the value for PDSCI.INX_INFO.DELETE_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setDeleteUserFlow(String deleteUserFlow) {
		this.deleteUserFlow = deleteUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.INFO_KEYWORD
	 * @return  the value of PDSCI.INX_INFO.INFO_KEYWORD
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getInfoKeyword() {
		return infoKeyword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.INFO_KEYWORD
	 * @param infoKeyword  the value for PDSCI.INX_INFO.INFO_KEYWORD
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setInfoKeyword(String infoKeyword) {
		this.infoKeyword = infoKeyword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.IS_TOP
	 * @return  the value of PDSCI.INX_INFO.IS_TOP
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getIsTop() {
		return isTop;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.IS_TOP
	 * @param isTop  the value for PDSCI.INX_INFO.IS_TOP
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.VIEW_NUM
	 * @return  the value of PDSCI.INX_INFO.VIEW_NUM
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public Long getViewNum() {
		return viewNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.VIEW_NUM
	 * @param viewNum  the value for PDSCI.INX_INFO.VIEW_NUM
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setViewNum(Long viewNum) {
		this.viewNum = viewNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.RECORD_STATUS
	 * @return  the value of PDSCI.INX_INFO.RECORD_STATUS
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getRecordStatus() {
		return recordStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.RECORD_STATUS
	 * @param recordStatus  the value for PDSCI.INX_INFO.RECORD_STATUS
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.CREATE_TIME
	 * @return  the value of PDSCI.INX_INFO.CREATE_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.CREATE_TIME
	 * @param createTime  the value for PDSCI.INX_INFO.CREATE_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.CREATE_USER_FLOW
	 * @return  the value of PDSCI.INX_INFO.CREATE_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getCreateUserFlow() {
		return createUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.CREATE_USER_FLOW
	 * @param createUserFlow  the value for PDSCI.INX_INFO.CREATE_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setCreateUserFlow(String createUserFlow) {
		this.createUserFlow = createUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.MODIFY_TIME
	 * @return  the value of PDSCI.INX_INFO.MODIFY_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.MODIFY_TIME
	 * @param modifyTime  the value for PDSCI.INX_INFO.MODIFY_TIME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.MODIFY_USER_FLOW
	 * @return  the value of PDSCI.INX_INFO.MODIFY_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getModifyUserFlow() {
		return modifyUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.MODIFY_USER_FLOW
	 * @param modifyUserFlow  the value for PDSCI.INX_INFO.MODIFY_USER_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setModifyUserFlow(String modifyUserFlow) {
		this.modifyUserFlow = modifyUserFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.ORG_FLOW
	 * @return  the value of PDSCI.INX_INFO.ORG_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getOrgFlow() {
		return orgFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.ORG_FLOW
	 * @param orgFlow  the value for PDSCI.INX_INFO.ORG_FLOW
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setOrgFlow(String orgFlow) {
		this.orgFlow = orgFlow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.ORG_NAME
	 * @return  the value of PDSCI.INX_INFO.ORG_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.ORG_NAME
	 * @param orgName  the value for PDSCI.INX_INFO.ORG_NAME
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PDSCI.INX_INFO.INFO_CONTENT
	 * @return  the value of PDSCI.INX_INFO.INFO_CONTENT
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public String getInfoContent() {
		return infoContent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PDSCI.INX_INFO.INFO_CONTENT
	 * @param infoContent  the value for PDSCI.INX_INFO.INFO_CONTENT
	 * @mbggenerated  Thu Jul 09 09:19:30 CST 2015
	 */
	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8279247236077064751L;
}