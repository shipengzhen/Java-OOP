package com.bdqn.spz.shangji2;

/**
 * @author ʩ����
 *�ֻ���
 */
public abstract class Handset {
	/**
	 * Ʒ��
	 */
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * �ͺ�
	 */
	private String modelNumber;

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	/**
	 * ��ʾ�ֻ���Ϣ
	 */
	public abstract void show();
}
