package com.baqn.spz.text;

public class Xixi {
	public Pet x(String name){
		Pet p=null;
		if (name=="¹·") {
			p=new Dog();
		}
		if (name=="Æó¶ì") {
			p=new Penguin();
		}
		return p;
	}
}
