package com.bdqn.spz.text;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
	public void method() {
		try {
			System.out.print("���������֣�");
			Scanner scanner=new Scanner(System.in);
			int a=scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("�쳣");
			e.printStackTrace();
			System.exit(1);
		}finally{
			System.out.println("�ٺ�");
		}
	}
	
	/**
	 * @throws ArrayIndexOutOfBoundsException
	 * ����������еĴ�����ܻ�����쳣
	 * ������û�����쳣������ƴ���
	 * ����쳣��������ͱ���
	 */
	public void method1() throws InputMismatchException,ArrayIndexOutOfBoundsException {
		
	}
	
	public void method2(String sex) throws Exception{
		if (sex.equals("��")||sex.equals("Ů")) {
			
		} else {
			throw new Exception("�Ա��������к�Ů");
		}
	}
}