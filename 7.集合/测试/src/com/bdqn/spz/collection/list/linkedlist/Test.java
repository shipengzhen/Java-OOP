package com.bdqn.spz.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ĭ�ϳ��� 10������int newCapacity=(oldCapacity*3)/2+1��
		List<Dog> dogList=new LinkedList<Dog>();
		Dog d=new Dog("�Ǻ�");
		dogList.add(d);
		dogList.add(new Dog("�ٺ�"));
		//��ӵ�һ��
		((LinkedList<Dog>)dogList).addFirst(d);
		//������һ��
		((LinkedList<Dog>)dogList).addLast(d);
		//��ʾ��һ��
		System.out.println(	((LinkedList<Dog>)dogList).getFirst());
		//��ʾ���һ��
		System.out.println(	((LinkedList<Dog>)dogList).getLast());
		System.out.println(dogList.set(1, d));
		System.out.println(dogList.size());
		//����
		//Iterator������ ר���������Ϲ���
		Iterator<Dog> iterator=dogList.iterator();
		//���������Ԫ�� ��������true ����false
		while (iterator.hasNext()) {
			Dog dog=iterator.next();
			System.out.println(dog.getName());
		}
		//foreach
		for (Dog dog : dogList) {
			System.out.println(dog.getName());
		}
		//for
		for (int i = 0; i <dogList.size(); i++) {
			System.out.println(dogList.get(i).getName());
		}
		//ɾ��
		dogList.remove(0);
		dogList.remove(d);
		//ɾ����һ��
		((LinkedList<Dog>)dogList).removeFirst();
		//ɾ�����һ��
		((LinkedList<Dog>)dogList).removeLast();
		//�жϼ������Ƿ��������Ϣ
		if (dogList.contains(d)) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}

}
