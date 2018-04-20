/**
 * 
 */
package shangji;

/**
 * @author 施鹏振
 *
 */
public class Penguin extends Animal {
	//方法
		/**
		 * 通过吃饭增加健康值。
		 */
		public void eat() {
			if (getHealth() >= 100) {
				System.out.println("企鹅需要多运动呀！");
			} else {
				setHealth(getHealth() + 3);	
				System.out.println("企鹅吃饱饭了！");
			}
		}
		/**
		 * 通过玩游戏增加与主人亲密度，减少健康值。
		 */
		public void play() {
			if (getHealth() < 60) {
				System.out.println("企鹅生病了！");
			} else {
				System.out.println("企鹅正在和主人玩耍。");
				setHealth(getHealth()-10);
				setLove(getLove() + 5);	
			}
		}
		/**
		 * 输出狗狗的信息
		 */
		public void print() {
			System.out.println("宠物的自白：\n我的名字叫" + this.getName() 
					+"性别是："+this.getSex()+ "，我是一只 " + this.getStrain() + "。");
		}
		
		//构造方法5
		public Penguin(){};
		public Penguin(String name,String sex,String strain){
			this.setName(name);
			this.setSex(sex);
			this.setStrain(strain);
		}
}
