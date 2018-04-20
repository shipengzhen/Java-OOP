/**
 * 
 */
package shangji;

/**
 * @author 施鹏振
 *
 */
public abstract class Animal {
	//字段属性
	private String name = "无名氏"; // 昵称
	/**
	 * 读取狗狗昵称
	 * @return 昵称
	 */
	public String getName() {
		return name;
	}	
	/**
	 * 设置狗狗昵称
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	private int health = 0; // 健康值
	/**
	 * 读取狗狗健康值
	 * @return 健康值
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * 设置狗狗健康值
	 */
	public void setHealth(int health) {
		if(health<0||health>100){
			System.out.println("健康值应该在0至100之间，默认值为60。");
			this.health=60;
			return;
		}
		this.health = health;
	}
	
	private int love = 0; // 亲密度
	/**
	 * 读取狗狗亲密度
	 * @return 亲密度
	 */
	public int getLove() {
		return love;
	}
	/**
	 * 设置狗狗亲密度
	 */
	public void setLove(int love) {
		if(love<0||love>100){
			System.out.println("亲密度应该在0至100之间，默认值为0。");
			this.love=0;
		}
		this.love = love;
	}

	private String strain = "聪明的拉布拉多犬"; // 品种
	/**
	 * 读取狗狗品种
	 * @return 品种
	 */
	public String getStrain() {
		return strain;
	}
	/**
	 * 设置狗狗品种
	 */
	public void setStrain(String strain) {
		this.strain = strain;
	}
	protected static final String SEX_MALE="雄";
	protected static final String SEX_FEMALE="雌";
	private String sex=SEX_MALE;
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	//方法
	/**
	 * 通过吃饭增加健康值。
	 */
	public abstract void eat();
	/**
	 * 通过玩游戏增加与主人亲密度，减少健康值。
	 */
	public abstract void play();
	/**
	 * 输出宠物的信息
	 */
	public abstract void print();
}
