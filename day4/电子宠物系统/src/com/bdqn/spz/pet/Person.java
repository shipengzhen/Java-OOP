package com.bdqn.spz.pet;


/**
 * @author ʩ����
 *����
 */
public class Person {
	Pet pet;

	public Person(Pet pet) {
		super();
		this.pet = pet;
	}
	public void show(){
		if (pet instanceof Dog) {
			pet.print();
			((Dog) pet).catchingFlyDisc();
			((Dog) pet).eat();
		}
		if (pet instanceof Penguin) {
			pet.print();
			((Penguin) pet).swim();
			((Penguin) pet).eat();
		}
	}
}
