package com.bdqn.shipengzhen.t4;

import java.util.*;
public class T4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三角形底和高：");
		Scanner input=new Scanner(System.in);
		Double di=input.nextDouble();
		Double gao=input.nextDouble();
		System.out.format( "三角形的面积是：%f",di*gao );

	}

}
