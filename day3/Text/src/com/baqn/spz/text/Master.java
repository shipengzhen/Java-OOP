package com.baqn.spz.text;

public class Master {

	/**
	 * @param args
	 */
	public void feed(Pet p){
		p.eat();
	}
	public void play(Pet p){
		if (p instanceof Dog) {
			((Dog) p).play();
		}
		if (p instanceof Penguin) {
			((Dog) p).play();
		}
	}
}