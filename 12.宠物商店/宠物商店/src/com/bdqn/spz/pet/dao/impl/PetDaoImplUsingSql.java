package com.bdqn.spz.pet.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.spz.pet.dao.IPetDao;
import com.bdqn.spz.pet.entity.Pet;
import com.bdqn.spz.pet.entity.SD;
import com.bdqn.spz.pet.entity.ZR;
import com.bdqn.spz.pet.util.BaseDao;

public class PetDaoImplUsingSql extends BaseDao implements IPetDao {

	@Override
	public List<Pet> selectAllPet() {
		List<Pet> list=new ArrayList<>();
		try {
			connection=getConnection();
			String sql="select PetId,PetName from Pet";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				Pet pet=new  Pet(resultSet.getInt("PetId"),resultSet.getString(2));
				list.add(pet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			closeAll();
		}
		return list;
	}
}
