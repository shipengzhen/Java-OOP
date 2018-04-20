package com.bdqn.spz.pet.entity;

/**
 * ������
 * @author ʩ����
 *
 */
public class Pet {
	
	/**
	 * ����Id
	 */
	private int petId;
	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	/**
	 * ��������
	 */
	private String petName;

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	/**
	 * ����
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
