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
		//默认长度 10，扩容int newCapacity=(oldCapacity*3)/2+1；
		List<Dog> dogList=new LinkedList<Dog>();
		Dog d=new Dog("呵呵");
		dogList.add(d);
		dogList.add(new Dog("嘿嘿"));
		//添加第一个
		((LinkedList<Dog>)dogList).addFirst(d);
		//添加最后一个
		((LinkedList<Dog>)dogList).addLast(d);
		//显示第一个
		System.out.println(	((LinkedList<Dog>)dogList).getFirst());
		//显示最后一个
		System.out.println(	((LinkedList<Dog>)dogList).getLast());
		System.out.println(dogList.set(1, d));
		System.out.println(dogList.size());
		//遍历
		//Iterator迭代器 专本遍历集合工具
		Iterator<Dog> iterator=dogList.iterator();
		//光标下面有元素 方法返回true 否则false
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
		//删除
		dogList.remove(0);
		dogList.remove(d);
		//删除第一个
		((LinkedList<Dog>)dogList).removeFirst();
		//删除最后一个
		((LinkedList<Dog>)dogList).removeLast();
		//判断集合中是否包含该信息
		if (dogList.contains(d)) {
			System.out.println("包含");
		}else {
			System.out.println("不包含");
		}
	}

}
