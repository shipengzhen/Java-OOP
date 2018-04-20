package com.bdqn.spz.shangji2;

/**
 * @author 施鹏振
 *智能手机类
 */
public class AptitudeHandset extends Handset implements Network, PlayWiring {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("播放");
	}

	@Override
	public void netPlay() {
		// TODO Auto-generated method stub
		System.out.println("上网");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("我是智能手机");
	}

}
