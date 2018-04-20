package com.bdqn.spz.car;


/**
 * @author 施鹏振
 *卡车类
 */
public class Truck extends Autocar {
	
	/**
	 * 卡车载重
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
