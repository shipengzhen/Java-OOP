package com.bdqn.spz.pet;

/**
 * @author ʩ����
 *�����
 */
public class Penguin extends Pet implements Eatable, Swimmable {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("��Ӿ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("�������");
	}

}
