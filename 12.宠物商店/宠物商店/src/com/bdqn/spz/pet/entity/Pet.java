package com.bdqn.spz.pet.entity;

/**
 * 宠物类
 * @author 施鹏振
 *
 */
public class Pet {
	
	/**
	 * 宠物Id
	 */
	private int petId;
	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	/**
	 * 宠物名称
	 */
	private String petName;

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	/**
	 * 构造
	 * @param petId
	 * @param petName
	 */
	public Pet(int petId, String petName) {
		super();
		setPetId(petId);
		setPetName(petName);
	}

	public Pet() {
		super();
	}
	
}
