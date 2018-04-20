/**
 * 
 */
package shangji;

/**
 * @author 施鹏振
 *
 */
public  class Dog extends Animal {
	//方法
	/**
	 * 通过吃饭增加健康值。
	 */
	public void eat() {
		if (getHealth() >= 100) {
			System.out.println("狗狗需要多运动呀！");
		} else {
			setHealth(getHealth() + 3);	
			System.out.println("狗狗吃饱饭了！");
		}
	}
	/**
	 * 通过玩游戏增加与主人亲密度，减少健康值。
	 */
	public void play() {
		if (getHealth() < 60) {
			System.out.println("狗狗生病了！");
		} else {
			System.out.println("狗狗正在和主人玩耍。");
			setHealth(getHealth()-10);
			setLove(getLove() + 5);	
		}
	}
	/**
	 * 输出狗狗的信息
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.getName() 
				+ "，健康值是" + this.getHealth()	+ "，和主人的亲密度是" 
				+ this.getLove() + "，我是一只 " + this.getStrain() + "。");
	}
	
	/**
	 * 构造方法
	 */
	public Dog(){};
	public Dog(String name,int health,String strain){
		this.setName(name);
		this.setHealth(health);
		this.setStrain(strain);
	}
}
