package com.bdqn.spz.car;


/**
 * @author ʩ����
 *������
 */
public class Truck extends Autocar {
	
	/**
	 * ��������
	 */
	private int load;
	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck( String plateNumber, String brand,int load) {
		super();
		this.setBrand(brand);
		this.setPlateNumber(plateNumber);
		this.setLoad(load);
		this.setPrice(load*50);
	}
	
}
