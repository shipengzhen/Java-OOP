package com.bdqn.shipengzhen.t7;

public class T7 {

	/**
	 * @param args
	 */
//	7¡¢¼ÆËã 1/1+1/2+1/3+...+1/100 µÄÖµ
	public static void main(String[] args) {
		Double num1=1.0;
		Double num2=1.0;
		for (int i = 1; i <= 100; i++) {
			num1=num1+i;
			System.out.println("num1\t"+num1);
//			num2=num2/num1;
//			System.out.println("num2\t"+num2);
		}
	}

}
