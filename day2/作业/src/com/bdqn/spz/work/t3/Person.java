/**
 * 
 */
package com.bdqn.spz.work.t3;

/**
 * @author ʩ����
 *3	����һ�����ࣨPerson�������������ԣ�������name��,�Ա�sex��;�����������Ĺ��췽�������Եķ�����������
 *�����������������ѧ���ࣨStudent�����������ԣ�ѧ�ţ�ID�����������Ĺ��췽�������Եķ�����������
 */
public class Person {
	
	/**
	 * ����
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * �Ա�
	 */
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * ���췽��
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
