package com.bdqn.spz.pet;

/**
 * @author ʩ����
 *����
 */
public class Dog extends Pet implements Eatable, FlyingDiscCatchable {

	@Override
	public void catchingFlyDisc() {
		// TODO Auto-generated method stub
		System.out.println("�ӷ���");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�Թ���");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("����һֻС��");
	}

}
