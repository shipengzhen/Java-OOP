package com.bdqn.mysql.entity;

/**
 * @author ʩ����
 *Grade��
 */
public class Grade {
	/**
	 * ���ID
	 */
	private int gradeId;

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	
	/**
	 * �������
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
	 * ����
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
