package com.bdqn.spz.pet;

import com.bdqn.spz.pet.dao.IPetDao;
import com.bdqn.spz.pet.dao.impl.PetDaoImplUsingSql;
import com.bdqn.spz.pet.entity.Pet;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPetDao iPetDao=new PetDaoImplUsingSql();
		System.out.println("所有宠物醒来");
		for (Pet pet : iPetDao.selectAllPet()) {
			System.out.println(pet.getPetName());
		}
	}

}
