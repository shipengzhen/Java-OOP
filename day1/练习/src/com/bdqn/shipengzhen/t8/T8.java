package com.bdqn.shipengzhen.t8;

public class T8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num=new int[]{1,2,3,5,4};
		for (int i =num.length-1; i>=0 ; i--) {
			System.out.println(num[i]);
		}
		int n=1;
		for (int i = 0; i < num.length; i++) {
			if (num[i]>n) {
				n=num[i];
			}
		}
		System.out.println("最大值"+n);
		for (int i = 0; i < num.length; i++) {
			if (num[i]<n) {
				n=num[i];
			}
		}
		System.out.println("最小值"+n);
	}

}
