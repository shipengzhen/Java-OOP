package com.bdqn.spz.car;

/**
 * @author ʩ����
 *��������
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
