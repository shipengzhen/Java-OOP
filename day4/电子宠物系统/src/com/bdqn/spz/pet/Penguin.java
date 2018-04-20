package com.bdqn.spz.pet;

/**
 * @author 施鹏振
 *企鹅类
 */
public class Penguin extends Pet implements Eatable, Swimmable {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("游泳");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃鱼");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("我是企鹅");
	}

}
