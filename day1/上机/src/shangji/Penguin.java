/**
 * 
 */
package shangji;

/**
 * @author ʩ����
 *
 */
public class Penguin extends Animal {
	//����
		/**
		 * ͨ���Է����ӽ���ֵ��
		 */
		public void eat() {
			if (getHealth() >= 100) {
				System.out.println("�����Ҫ���˶�ѽ��");
			} else {
				setHealth(getHealth() + 3);	
				System.out.println("���Ա����ˣ�");
			}
		}
		/**
		 * ͨ������Ϸ�������������ܶȣ����ٽ���ֵ��
		 */
		public void play() {
			if (getHealth() < 60) {
				System.out.println("��������ˣ�");
			} else {
				System.out.println("������ں�������ˣ��");
				setHealth(getHealth()-10);
				setLove(getLove() + 5);	
			}
		}
		/**
		 * �����������Ϣ
		 */
		public void print() {
			System.out.println("������԰ף�\n�ҵ����ֽ�" + this.getName() 
					+"�Ա��ǣ�"+this.getSex()+ "������һֻ " + this.getStrain() + "��");
		}
		
		//���췽��5
		public Penguin(){};
		public Penguin(String name,String sex,String strain){
			this.setName(name);
			this.setSex(sex);
			this.setStrain(strain);
		}
}
