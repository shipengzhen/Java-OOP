package com.baqn.spz.text;

public class Xixi {
	public Pet x(String name){
		Pet p=null;
		if (name=="��") {
			p=new Dog();
		}
		if (name=="���") {
			p=new Penguin();
		}
		return p;
	}
}
