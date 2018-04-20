package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person=new Person();
		int[] is=person.is;
		String name=person.name;
		
		name="ss";
		is[2]=4;
		
		System.out.println(person.name);
		for (int i : person.is) {
			System.out.println(i);
		}
		System.out.println(name);
		for (int i : is) {
			System.out.println(i);
		}
	}

}
