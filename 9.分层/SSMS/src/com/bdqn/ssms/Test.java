package com.bdqn.ssms;

import java.util.List;

import com.bdqn.ssms.dao.IGradeDao;
import com.bdqn.ssms.dao.impl.GradeDaoImpl;
import com.bdqn.ssms.entity.Grade;


public class Test {

	public static void main(String[] args) {
		IGradeDao iGrade=new GradeDaoImpl();
		//����
		if (iGrade.save(new Grade("�ٺ�"))>0) {
			System.out.println("�����ɹ�");
		}else {
			System.out.println("����ʧ��");
		}
		//ɾ��
		if (iGrade.del(new Grade(4))>0) {
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("ɾ��ʧ��");
		}
		//�޸�
		if (iGrade.update(new Grade(1,"S1"))>0) {
			System.out.println("�޸ĳɹ�");
		}else {
			System.out.println("�޸�ʧ��");
		}
		List<Grade> grades=iGrade.findAll();
		for (Grade grade : grades) {
			System.out.println(grade.getGradeName());
		}
		Grade grade=iGrade.findAll(1);
		System.out.println(grade.getGradeName());
	}
}
