package com.bdqn.spz.text;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
	public void method() {
		try {
			System.out.print("请输入数字：");
			Scanner scanner=new Scanner(System.in);
			int a=scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("异常");
			e.printStackTrace();
			System.exit(1);
		}finally{
			System.out.println("嘿嘿");
		}
	}
	
	/**
	 * @throws ArrayIndexOutOfBoundsException
	 * 这个方法体中的代码可能会出现异常
	 * 但是我没有用异常处理机制处理
	 * 检查异常：不处理就报错
	 */
	public void method1() throws InputMismatchException,ArrayIndexOutOfBoundsException {
		
	}
	
	public void method2(String sex) throws Exception{
		if (sex.equals("男")||sex.equals("女")) {
			
		} else {
			throw new Exception("性别是能是男和女");
		}
	}
}