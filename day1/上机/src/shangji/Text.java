/**
 * ������
 */
package shangji;

/**
 *����
 */
import java.util.Scanner;

/**
 * @author ʩ����
 * 
 */
public class Text {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		// 1�� �����������
		System.out.print("������Ҫ������������֣�");
		String name = input.next();
		// 2�� ѡ���������
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����죩");
		switch (input.nextInt()) {
		case 1:
			// ����ǹ���,ѡ�񹷹�Ʒ��
			System.out.print("��ѡ�񹷹���Ʒ��:(1����������������Ȯ" + " 2������ѩ����)");
			String strain = null;
			if (input.nextInt() == 1) {
				strain = "��������������Ȯ";
			} else {
				strain = "����ѩ����";
			}
			System.out.print("�����빷���Ľ���ֵ��1~100֮�䣩��");
			int health = input.nextInt();
			// �����������󲢸�ֵ
			Dog dog = new Dog(name, health, strain);
			// Dog dog = new Dog();
			// dog.setName(name);
			// dog.setStrain(strain);
			// dog.setHealth(health);
			// ���������Ϣ
			dog.print();
			break;
		case 2:
			System.out.print("��ѡ�������Ա𣺣�1��Q�� 2��Q�ã�");
			int sex = input.nextInt();
			Penguin penguin = null;
			if (sex == 1) {
				penguin = new Penguin(name, Penguin.SEX_MALE, "���");
			} else {
				penguin = new Penguin(name, Penguin.SEX_FEMALE, "���");
			}
			penguin.print();
		}
	}
}
