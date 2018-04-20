package com.bdqn.spz.shangji2;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handset h=new CommonHandset();
		h.show();
		((CommonHandset)h).play();
		
		h=new AptitudeHandset();
		h.show();
		((AptitudeHandset)h).play();
		((AptitudeHandset)h).netPlay();
	}

}
