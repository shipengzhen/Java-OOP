package com.bdqn.spz.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		map.put("icbc", "����");
		map.put("abc", "ũ��");
		map.put("cbc", "����");
		//��ȡ��ֵ���е�����--key
		System.out.println("icbc:"+map.get("icbc"));
		//���������ݸ���
		System.out.println(map.size());
		//�жϰ���������
		System.out.println("�����а���ũ����");
		if (map.containsKey("abc")) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		//��ȡkey�ļ���
		System.out.println(map.keySet());
		//��ȡvalues�ļ���
		System.out.println(map.values());
		//����
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
//			String str =iterator.next();
//			System.out.println(str);
		}
	}

}
