/**
 * 
 */
package shangji;

/**
 * @author ʩ����
 *
 */
public abstract class Animal {
	//�ֶ�����
	private String name = "������"; // �ǳ�
	/**
	 * ��ȡ�����ǳ�
	 * @return �ǳ�
	 */
	public String getName() {
		return name;
	}	
	/**
	 * ���ù����ǳ�
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	private int health = 0; // ����ֵ
	/**
	 * ��ȡ��������ֵ
	 * @return ����ֵ
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * ���ù�������ֵ
	 */
	public void setHealth(int health) {
		if(health<0||health>100){
			System.out.println("����ֵӦ����0��100֮�䣬Ĭ��ֵΪ60��");
			this.health=60;
			return;
		}
		this.health = health;
	}
	
	private int love = 0; // ���ܶ�
	/**
	 * ��ȡ�������ܶ�
	 * @return ���ܶ�
	 */
	public int getLove() {
		return love;
	}
	/**
	 * ���ù������ܶ�
	 */
	public void setLove(int love) {
		if(love<0||love>100){
			System.out.println("���ܶ�Ӧ����0��100֮�䣬Ĭ��ֵΪ0��");
			this.love=0;
		}
		this.love = love;
	}

	private String strain = "��������������Ȯ"; // Ʒ��
	/**
	 * ��ȡ����Ʒ��
	 * @return Ʒ��
	 */
	public String getStrain() {
		return strain;
	}
	/**
	 * ���ù���Ʒ��
	 */
	public void setStrain(String strain) {
		this.strain = strain;
	}
	protected static final String SEX_MALE="��";
	protected static final String SEX_FEMALE="��";
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
	//����
	/**
	 * ͨ���Է����ӽ���ֵ��
	 */
	public abstract void eat();
	/**
	 * ͨ������Ϸ�������������ܶȣ����ٽ���ֵ��
	 */
	public abstract void play();
	/**
	 * ����������Ϣ
	 */
	public abstract void print();
}
