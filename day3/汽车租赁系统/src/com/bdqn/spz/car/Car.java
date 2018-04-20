package com.bdqn.spz.car;

/**
 * @author 施鹏振
 *小汽车类
 */
public class Car extends Autocar {
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String plateNumber,String brand, int price) {
		super();
		this.setPlateNumber(plateNumber);
		this.setBrand(brand);
		this.setPrice(price);
	}
}
