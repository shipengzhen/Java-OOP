package com.bdqn.spz.car;

/**
 * @author ʩ����
 *����
 */
public abstract class Autocar {
	
	/**
	 * ����Ʒ��
	 */
	private String brand ;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * �����ƺ�
	 */
	private String plateNumber;

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	/**
	 * ���޵���
	 */
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
