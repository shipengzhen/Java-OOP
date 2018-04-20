package com.bdqn.ssms;

import java.util.List;

import com.bdqn.ssms.dao.IGradeDao;
import com.bdqn.ssms.dao.impl.GradeDaoImpl;
import com.bdqn.ssms.entity.Grade;


public class Test {

	public static void main(String[] args) {
		IGradeDao iGrade=new GradeDaoImpl();
		//新增
		if (iGrade.save(new Grade("嘿嘿"))>0) {
			System.out.println("新增成功");
		}else {
			System.out.println("新增失败");
		}
		//删除
		if (iGrade.del(new Grade(4))>0) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
		//修改
		if (iGrade.update(new Grade(1,"S1"))>0) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
		List<Grade> grades=iGrade.findAll();
		for (Grade grade : grades) {
			System.out.println(grade.getGradeName());
		}
		Grade grade=iGrade.findAll(1);
		System.out.println(grade.getGradeName());
	}
}
