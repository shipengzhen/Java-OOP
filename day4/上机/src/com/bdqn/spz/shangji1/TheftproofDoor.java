package com.bdqn.spz.shangji1;



public class TheftproofDoor extends Door implements Lock {

	@Override
	//上锁
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("上锁");
	}

	@Override
	//开锁
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("开锁");
	}
	
	@Override
	//开
	public void open(){
		System.out.println("开门");
	}
	
	@Override
	//关
	public void close(){
		System.out.println("关门");
	}

}
