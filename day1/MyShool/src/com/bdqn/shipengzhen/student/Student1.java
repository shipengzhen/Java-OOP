package com.bdqn.shipengzhen.student;

/**
 * @author ʩ����
 *
 */
public class Student1 {
	//����
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	//����
	private int age;
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if (age<16) {
			System.out.println("���䲻��С��16");
			return;
		}
		this.age = age;
	}
	public Student1() {}
	public Student1(String name,int age) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setAge(age);
	}
	//����
	public void student1Test() {
		// TODO Auto-generated method stub
		System.out.println("������"+getName()+"���䣺"+getAge());
	}
}
