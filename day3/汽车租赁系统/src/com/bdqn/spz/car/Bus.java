package com.bdqn.spz.car;

/**
 * @author 施鹏振
 *教练车类
 */
public class Bus extends Autocar {
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus( String plateNumber, String brand,int price) {
		super();
		this.setBrand(brand);
		this.setPlateNumber(plateNumber);
		this.setPrice(price);
	}
}
