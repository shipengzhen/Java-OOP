package com.bdqn.spz.shangji3;

public class ComputerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer=new Computer(new CPU1(),new EMS1(),new HardDisk1());
		computer.showInfo();
	}
}
