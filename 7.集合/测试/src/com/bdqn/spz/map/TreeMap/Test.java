package com.bdqn.spz.map.TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new TreeMap<String, String>();
		map.put("icbc", "工行");
		map.put("abc", "农行");
		map.put("cbc", "建行");
		//获取键值对中的数据--key
		System.out.println("icbc:"+map.get("icbc"));
		//集合中数据个数
		System.out.println(map.size());
		//判断包含不包含
		System.out.println("集合中包含农行吗？");
		if (map.containsKey("abc")) {
			System.out.println("包含");
		} else {
			System.out.println("不包含");
		}
		//获取key的集合
		System.out.println(map.keySet());
		//获取values的集合
		System.out.println(map.values());
		//遍历
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
//			String str =iterator.next();
//			System.out.println(str);
		}
	}

}
