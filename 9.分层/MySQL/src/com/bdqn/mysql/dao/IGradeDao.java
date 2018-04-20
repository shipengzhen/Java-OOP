package com.bdqn.mysql.dao;

import java.util.List;

import com.bdqn.mysql.entity.Grade;

public interface IGradeDao {
	/**
	 * ����
	 * @param gradeName
	 */
	int save(Grade grade);
	
	/**
	 * ɾ��
	 * @param gradeId
	 */
	int del(Grade grade);
	
	/**
	 * �޸�
	 * @param gradeId
	 * @param gradeName
	 */
	int update(Grade grade);
	
	/**
	 * ��ѯȫ��
	 * @return
	 */
	List<Grade> findAll();
	
	/**
	 * ��������ѯ
	 * @param gradeId
	 * @return
	 */
	Grade findAll(int gradeId);
}
