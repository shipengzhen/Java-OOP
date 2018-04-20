package com.bdqn.mysql.dao;

import java.util.List;

import com.bdqn.mysql.entity.Grade;

public interface IGradeDao {
	/**
	 * 新增
	 * @param gradeName
	 */
	int save(Grade grade);
	
	/**
	 * 删除
	 * @param gradeId
	 */
	int del(Grade grade);
	
	/**
	 * 修改
	 * @param gradeId
	 * @param gradeName
	 */
	int update(Grade grade);
	
	/**
	 * 查询全部
	 * @return
	 */
	List<Grade> findAll();
	
	/**
	 * 按条件查询
	 * @param gradeId
	 * @return
	 */
	Grade findAll(int gradeId);
}
