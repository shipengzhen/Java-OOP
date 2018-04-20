package com.bdqn.spz.shangji2;

/**
 * @author 施鹏振
 *手机类
 */
public abstract class Handset {
	/**
	 * 品牌
	 */
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * 型号
	 */
	private String modelNumber;

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	/**
	 * 显示手机信息
	 */
	public abstract void show();
}
