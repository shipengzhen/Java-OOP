package com.bdqn.shipengzhen.student;

public class Student2 extends Student1{
	//性别
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
	//专业
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
	//构造方法
	public Student2() {}
	public Student2(String name,int age,String sex,String subject) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.setSubjecct(subject);
	}
	//方法
	//方法
		public void student2Test() {
			// TODO Auto-generated method stub
			System.out.println("姓名："+getName()+"年龄："+getAge()+"性别"+getSex()+"专业"+getSubjecct());
		}
}
