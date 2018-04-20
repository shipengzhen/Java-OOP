package com.bdqn.spz.work.t3;


/**
 * @author 施鹏振
 *
 */
public class Student extends Person {

	
	/**
	 * 学号
	 */
	private int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * 构造方法
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String sex ,int id) {
		super(name, sex);
		this.setName(name);
		this.setSex(sex);
		this.setID(id);
	}
	
}
