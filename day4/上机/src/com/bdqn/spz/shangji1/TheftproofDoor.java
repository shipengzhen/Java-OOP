package com.bdqn.spz.shangji1;



public class TheftproofDoor extends Door implements Lock {

	@Override
	//����
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	//����
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	
	@Override
	//��
	public void open(){
		System.out.println("����");
	}
	
	@Override
	//��
	public void close(){
		System.out.println("����");
	}

}
