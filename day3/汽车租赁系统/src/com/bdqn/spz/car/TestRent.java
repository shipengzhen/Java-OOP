package com.bdqn.spz.car;

public class TestRent {
	public static void main(String[] args) {
		Autocar[] zu=new Autocar[]{
				new Car("��NY28588","����",600),
				new Car("��NNN3284","����",600),
				new Car("��NT43765","���",500),
				new Bus("��5634765","����",100)
		};
		Customer customer=new Customer("����");
		customer.show(5, zu);
		Autocar[] zu1=new Autocar[]{
				new Car("��NY28588","����",600),
				new Car("��NNN3284","����",600),
				new Truck("��111111111","�ٺ�",50),
				new Bus("��5634765","����",100)
		};
		customer.show(5, zu1);
	}
}
