package com.bdqn.spz.pet.entity;

/**
 * ���˱�
 * @author ʩ����
 *
 */
public class ZR {
	/**
	 * ����Id
	 */
	private int zRId;

	public int getzRId() {
		return zRId;
	}

	public void setzRId(int zRId) {
		this.zRId = zRId;
	}
	
	
	/**
	 * ��������
	 */
	private String zRName;

	public String getzRName() {
		return zRName;
	}

	public void setzRName(String zRName) {
		this.zRName = zRName;
	}

	/**
	 * ����
	 * @param zRId
	 * @param zRName
	 */
	public ZR(int zRId, String zRName) {
		super();
		this.zRId = zRId;
		this.zRName = zRName;
	}

	public ZR() {
		super();
		// TODO Auto-generated constructor stub
	}
}
