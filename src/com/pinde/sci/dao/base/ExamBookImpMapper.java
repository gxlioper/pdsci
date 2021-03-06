package com.pinde.sci.dao.base;

import com.pinde.sci.model.mo.ExamBookImp;
import com.pinde.sci.model.mo.ExamBookImpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamBookImpMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int countByExample(ExamBookImpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int deleteByExample(ExamBookImpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int deleteByPrimaryKey(String bookImpFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int insert(ExamBookImp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int insertSelective(ExamBookImp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	List<ExamBookImp> selectByExample(ExamBookImpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	ExamBookImp selectByPrimaryKey(String bookImpFlow);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int updateByExampleSelective(@Param("record") ExamBookImp record,
			@Param("example") ExamBookImpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int updateByExample(@Param("record") ExamBookImp record,
			@Param("example") ExamBookImpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int updateByPrimaryKeySelective(ExamBookImp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PDSCI.EXAM_BOOK_IMP
	 * @mbggenerated  Thu Dec 18 15:18:44 CST 2014
	 */
	int updateByPrimaryKey(ExamBookImp record);
}