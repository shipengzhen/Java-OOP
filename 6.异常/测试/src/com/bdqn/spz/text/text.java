package com.bdqn.spz.text;

import java.util.InputMismatchException;

public class text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.method();
		try {
			a.method1();
			a.method2("»À");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
