package com.bdqn.spz.car;

/**
 * @author 施鹏振
 *车类
 */
public abstract class Autocar {
	
	/**
	 * 汽车品牌
	 */
	private String brand ;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 汽车牌号
	 */
	private String plateNumber;

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	/**
	 * 租赁单价
	 */
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
