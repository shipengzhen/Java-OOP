package com.baqn.spz.work.t1;
/**
 * @author ʩ����
 *1	����һ��ѧ���࣬�������ԣ�ѧ�ţ�ID����������name�����ɼ���score�������췽������������������ÿ�����Եķ�����������
 */
public class Student { 
	/**
	 * ѧ��
	 */
	private int studentNo;
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	/**
	 * ����
	 */
	private String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * �ɼ�
	 */
	private int score;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * ���췽��
	 */
	public Student() {
		super();
	}
	public Student(int studentNo, String studentName, int score) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setScore(score);
	}
	
	
}
