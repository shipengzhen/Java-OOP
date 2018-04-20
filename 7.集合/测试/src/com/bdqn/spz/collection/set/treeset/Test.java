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
		Dog d = new Dog("呵呵");
		dogList.add(d);
		System.out.println(dogList.size());
		// 遍历
		// Iterator迭代器 专本遍历集合工具
		Iterator<Dog> iterator = dogList.iterator();
		// 光标下面有元素 方法返回true 否则false
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
