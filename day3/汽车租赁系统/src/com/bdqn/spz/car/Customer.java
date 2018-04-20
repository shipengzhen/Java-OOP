package com.bdqn.spz.car;

/**
 * @author 施鹏振
 *顾客类
 */
public class Customer {
	
	/**
	 * 用户姓名
	 */
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int zong(int days,Autocar[] zu){
		int num=0;
		System.out.println("汽车牌号\t\t\t汽车品牌");
		for (Autocar item : zu) {
			System.out.println(item.getPlateNumber()+"\t\t"+item.getBrand());
			num=num+item.getPrice()*days;
		}
		return num;
	}
	public void show(int days,Autocar[] zu){
		System.out.print("客户名："+name+",租赁天数"+days+",租赁总费用："+zong(days, zu)+"元。");
	}
	
	
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name) {
		super();
		this.name = name;
	}
	
}
