/**
 * 
 */
package shangji;

/**
 * @author ʩ����
 *
 */
public  class Dog extends Animal {
	//����
	/**
	 * ͨ���Է����ӽ���ֵ��
	 */
	public void eat() {
		if (getHealth() >= 100) {
			System.out.println("������Ҫ���˶�ѽ��");
		} else {
			setHealth(getHealth() + 3);	
			System.out.println("�����Ա����ˣ�");
		}
	}
	/**
	 * ͨ������Ϸ�������������ܶȣ����ٽ���ֵ��
	 */
	public void play() {
		if (getHealth() < 60) {
			System.out.println("���������ˣ�");
		} else {
			System.out.println("�������ں�������ˣ��");
			setHealth(getHealth()-10);
			setLove(getLove() + 5);	
		}
	}
	/**
	 * �����������Ϣ
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.getName() 
				+ "������ֵ��" + this.getHealth()	+ "�������˵����ܶ���" 
				+ this.getLove() + "������һֻ " + this.getStrain() + "��");
	}
	
	/**
	 * ���췽��
	 */
	public Dog(){};
	public Dog(String name,int health,String strain){
		this.setName(name);
		this.setHealth(health);
		this.setStrain(strain);
	}
}
