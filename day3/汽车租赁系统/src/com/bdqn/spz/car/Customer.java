package com.bdqn.spz.car;

/**
 * @author ʩ����
 *�˿���
 */
public class Customer {
	
	/**
	 * �û�����
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
		System.out.println("�����ƺ�\t\t\t����Ʒ��");
		for (Autocar item : zu) {
			System.out.println(item.getPlateNumber()+"\t\t"+item.getBrand());
			num=num+item.getPrice()*days;
		}
		return num;
	}
	public void show(int days,Autocar[] zu){
		System.out.print("�ͻ�����"+name+",��������"+days+",�����ܷ��ã�"+zong(days, zu)+"Ԫ��");
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
