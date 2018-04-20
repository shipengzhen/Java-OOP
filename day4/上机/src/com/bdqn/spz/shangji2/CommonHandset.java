package com.bdqn.spz.shangji2;

/**
 * @author 施鹏振
 *普通手机类
 */
public class CommonHandset extends Handset implements PlayWiring {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("播放");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("我是普通手机");
	}

}
