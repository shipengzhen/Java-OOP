package com.bdqn.spz.collection.set.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.bdqn.spz.collection.set.hashset.Dog;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Dog> dogList = new TreeSet<Dog>();
		Dog d = new Dog("�Ǻ�");
		dogList.add(d);
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
	}
}
