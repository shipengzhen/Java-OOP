package com.bdqn.spz.car;

public class TestRent {
	public static void main(String[] args) {
		Autocar[] zu=new Autocar[]{
				new Car("京NY28588","宝马",600),
				new Car("京NNN3284","宝马",600),
				new Car("京NT43765","别克",500),
				new Bus("京5634765","金龙",100)
		};
		Customer customer=new Customer("张三");
		customer.show(5, zu);
		Autocar[] zu1=new Autocar[]{
				new Car("京NY28588","宝马",600),
				new Car("京NNN3284","宝马",600),
				new Truck("京111111111","嘿嘿",50),
				new Bus("京5634765","金龙",100)
		};
		customer.show(5, zu1);
	}
}
