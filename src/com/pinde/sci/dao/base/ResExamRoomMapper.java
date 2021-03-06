package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.ResExamRoom;
import com.pinde.sci.model.mo.ResExamRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResExamRoomMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int countByExample(ResExamRoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int deleteByExample(ResExamRoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int deleteByPrimaryKey(String roomFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int insert(ResExamRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int insertSelective(ResExamRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	List<ResExamRoom> selectByExample(ResExamRoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	ResExamRoom selectByPrimaryKey(String roomFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int updateByExampleSelective(@Param("record") ResExamRoom record,
			@Param("example") ResExamRoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int updateByExample(@Param("record") ResExamRoom record,
			@Param("example") ResExamRoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int updateByPrimaryKeySelective(ResExamRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.RES_EXAM_ROOM
	 * @mbggenerated  Mon Mar 23 13:25:29 CST 2015
	 */
	int updateByPrimaryKey(ResExamRoom record);
}