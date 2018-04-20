package com.bdqn.spz.pet;

/**
 * @author 施鹏振
 *狗类
 */
public class Dog extends Pet implements Eatable, FlyingDiscCatchable {

	@Override
	public void catchingFlyDisc() {
		// TODO Auto-generated method stub
		System.out.println("接飞盘");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃狗粮");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("我是一只小狗");
	}

}
