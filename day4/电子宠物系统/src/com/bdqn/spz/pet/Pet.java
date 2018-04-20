package com.bdqn.spz.pet;

/**
 * @author 施鹏振
 *宠物
 */
/**
 * @author 施鹏振
 *
 */
public abstract class Pet {
	
	/**
	 * 宠物名称
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 健康值
	 */
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	/**
	 * 亲密度
	 */
	private int love;

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}
	
	/**
	 * 输出宠物信息
	 */
	public abstract void print();
}
