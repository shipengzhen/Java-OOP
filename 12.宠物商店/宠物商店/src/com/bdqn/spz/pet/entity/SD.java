package com.bdqn.spz.pet.entity;

/**
 * �̵��
 * @author ʩ����
 *
 */
public class SD {
	
	/**
	 * �̵�Id
	 */
	private int sDId;
	
	public int getsId() {
		return sDId;
	}

	public void setsId(int sDId) {
		this.sDId = sDId;
	}
	
	/**
	 * �̵�����
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
	 * ����
	 * @param sDId
	 * @param sDName
	 */
	public SD(int sDId, String sDName) {
		super();
		setsId(sDId);
		setsDName(sDName);
	}
}
