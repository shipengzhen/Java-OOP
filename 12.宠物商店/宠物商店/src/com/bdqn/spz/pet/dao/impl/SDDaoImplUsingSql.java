package com.bdqn.spz.pet.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.spz.pet.dao.ISDDao;
import com.bdqn.spz.pet.entity.SD;
import com.bdqn.spz.pet.util.BaseDao;

public class SDDaoImplUsingSql extends BaseDao implements ISDDao {

	@Override
	public List<SD> selectAllSD() {
		List<SD> list=new ArrayList<>();
		try {
			connection=getConnection();
			String sql="select SDId,SDName from Pet";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				SD sd=new  SD(resultSet.getInt("SDId"),resultSet.getString(2));
				list.add(sd);
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
