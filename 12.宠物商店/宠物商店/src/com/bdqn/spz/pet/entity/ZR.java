package com.bdqn.spz.pet.entity;

/**
 * 主人表
 * @author 施鹏振
 *
 */
public class ZR {
	/**
	 * 主人Id
	 */
	private int zRId;

	public int getzRId() {
		return zRId;
	}

	public void setzRId(int zRId) {
		this.zRId = zRId;
	}
	
	
	/**
	 * 主人名称
	 */
	private String zRName;

	public String getzRName() {
		return zRName;
	}

	public void setzRName(String zRName) {
		this.zRName = zRName;
	}

	/**
	 * 构造
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
