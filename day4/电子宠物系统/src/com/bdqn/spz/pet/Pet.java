package com.bdqn.spz.pet;

/**
 * @author ʩ����
 *����
 */
/**
 * @author ʩ����
 *
 */
public abstract class Pet {
	
	/**
	 * ��������
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ����ֵ
	 */
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	/**
	 * ���ܶ�
	 */
	private int love;

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}
	
	/**
	 * ���������Ϣ
	 */
	public abstract void print();
}
