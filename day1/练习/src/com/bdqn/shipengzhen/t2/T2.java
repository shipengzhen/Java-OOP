package com.bdqn.shipengzhen.t2;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入圆的半径:");
		Double d=input.nextDouble();
		System.out.print("周长:"+d*2*3.14);
		System.out.print("面积："+d*d*3.14);
	}
}
