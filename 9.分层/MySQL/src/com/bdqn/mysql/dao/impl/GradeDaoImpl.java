package com.bdqn.mysql.dao.impl;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.mysql.dao.BaseDao;
import com.bdqn.mysql.dao.IGradeDao;
import com.bdqn.mysql.entity.Grade;

public class GradeDaoImpl extends BaseDao implements IGradeDao {

	@Override
	public int save(Grade grade) {
		String sql = "insert into Grade values(0,?)";
		Object[] pats = { grade.getGradeName() };
		return exceUpdate(sql, pats);
	}

	@Override
	public int del(Grade grade) {
		String sql="delete from Grade where GradeId=?";
		Object[] pats = { grade.getGradeId()};
		return exceUpdate(sql, pats);
	}

	@Override
	public int update(Grade grade) {
		String sql="update Grade set GradeName=? where GradeId=?";
		Object[] pats={grade.getGradeName(),grade.getGradeId()};
		return exceUpdate(sql, pats);
	}
	@Override
	public List<Grade> findAll() {
		List<Grade> grades = new ArrayList<>();
		connection= getConnection();
		String sql = "select * from Grade";
		try {
			preparedStatement =connection.prepareStatement(sql);
			resultSet =preparedStatement.executeQuery();
			while (resultSet.next()) {
				Grade grade = new Grade(resultSet.getInt(1), resultSet.getString(2));
				grades.add(grade);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return grades;
	}

	@Override
	public Grade findAll(int gradeId) {
		Grade grade = null;
		connection = getConnection();
		String sql = "select * from Grade where GradeId=?";
		try {
			preparedStatement =(PreparedStatement)connection.prepareStatement(sql);
			preparedStatement.setInt(1, gradeId);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				grade = new Grade(resultSet.getInt(1), resultSet.getString(2));
				return grade;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return grade;
	}

}
