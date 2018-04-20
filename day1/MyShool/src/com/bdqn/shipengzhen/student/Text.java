package com.bdqn.shipengzhen.student;

public class Text {
	public static void main(String[] args) {
		Student1 stu=new Student1("11",12);
		stu.student1Test();
		Student1 s=new Student1("11",16);
		s.student1Test();
		Student2 stu2=new Student2();
		stu2.student2Test();
		Student2 s2=new Student2("11",17,"1","1");
		s2.student2Test();
	}
}
