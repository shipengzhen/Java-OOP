package com.bdqn.spz.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Dog> dogList = new HashSet<Dog>();
		Dog d = new Dog("�Ǻ�");
		dogList.add(d);
		dogList.add(new Dog("�ٺ�"));
		System.out.println(dogList.size());
		// ����
		// Iterator������ ר���������Ϲ���
		Iterator<Dog> iterator = dogList.iterator();
		// ���������Ԫ�� ��������true ����false
		while (iterator.hasNext()) {
			Dog dog = iterator.next();
			System.out.println(dog.getName());
		}
		// foreach
		for (Dog dog : dogList) {
			System.out.println(dog.getName());
		}
		// ɾ��
		dogList.remove(0);
		dogList.remove(d);
		// �жϼ������Ƿ��������Ϣ
		if (dogList.contains(d)) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
	}

}
