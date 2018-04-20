/**
 * 
 */
package com.bdqn.spz.work.t3;

/**
 * @author 施鹏振
 *3	定义一个人类（Person），它包含属性：姓名（name）,性别（sex）;带两个参数的构造方法；属性的访问器方法。
 *定义上面人类的子类学生类（Student），包括属性：学号（ID），带参数的构造方法；属性的访问器方法。
 */
public class Person {
	
	/**
	 * 姓名
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 性别
	 */
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * 构造方法
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex) {
		super();
		this.setName(name);
		this.setSex(sex);
	}
	
	
}
