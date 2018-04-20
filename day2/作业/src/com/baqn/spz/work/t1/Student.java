package com.baqn.spz.work.t1;
/**
 * @author 施鹏振
 *1	定义一个学生类，包括属性：学号（ID），姓名（name），成绩（score）；构造方法（带三个参数）；每个属性的访问器方法。
 */
public class Student { 
	/**
	 * 学号
	 */
	private int studentNo;
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	/**
	 * 姓名
	 */
	private String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * 成绩
	 */
	private int score;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * 构造方法
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
