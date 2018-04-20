package com.bdqn.mysql.entity;

/**
 * @author 施鹏振
 *Grade表
 */
public class Grade {
	/**
	 * 年纪ID
	 */
	private int gradeId;

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	
	/**
	 * 年纪名称
	 */
	private String gradeName;

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeNam(String gradeNam) {
		this.gradeName = gradeNam;
	}
	public Grade(int gradeId) {
		super();
		this.gradeId = gradeId;
	}

	/**
	 * 构造
	 * @param gradeId
	 * @param gradeNam
	 */
	public Grade(int gradeId, String gradeNam) {
		super();
		this.setGradeId(gradeId);
		this.setGradeNam(gradeNam);
	}

	public Grade() {
		super();
	}

	public Grade(String gradeName) {
		super();
		this.setGradeNam(gradeName);
	}
	
}
