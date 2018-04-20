package com.dl;


public class Dl {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private Dl() {
		super();
	}

	private static Dl dl;
	public static Dl dl(){
		if (dl==null) {
			dl=new Dl();
		}
		return dl;
	}
}
