package com.bdqn.shipengzhen.student;

public class Student2 extends Student1{
	//�Ա�
	private String sex;

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	//רҵ
		private String subjecct;
	/**
	 * @return the subjecct
	 */
	public String getSubjecct() {
		return subjecct;
	}

	/**
	 * @param subjecct the subjecct to set
	 */
	public void setSubjecct(String subjecct) {
		this.subjecct = subjecct;
	}
	//���췽��
	public Student2() {}
	public Student2(String name,int age,String sex,String subject) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.setSubjecct(subject);
	}
	//����
	//����
		public void student2Test() {
			// TODO Auto-generated method stub
			System.out.println("������"+getName()+"���䣺"+getAge()+"�Ա�"+getSex()+"רҵ"+getSubjecct());
		}
}
