package com.bdqn.spz.pet.entity;

/**
 * 商店表
 * @author 施鹏振
 *
 */
public class SD {
	
	/**
	 * 商店Id
	 */
	private int sDId;
	
	public int getsId() {
		return sDId;
	}

	public void setsId(int sDId) {
		this.sDId = sDId;
	}
	
	/**
	 * 商店名称
	 */
	private String sDName;

	public String getsDName() {
		return sDName;
	}

	public void setsDName(String sDName) {
		this.sDName = sDName;
	}

	public SD() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 构造
	 * @param sDId
	 * @param sDName
	 */
	public SD(int sDId, String sDName) {
		super();
		setsId(sDId);
		setsDName(sDName);
	}
}
