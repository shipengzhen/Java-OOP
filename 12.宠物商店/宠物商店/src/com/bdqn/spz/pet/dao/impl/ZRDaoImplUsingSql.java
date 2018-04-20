package com.bdqn.spz.pet.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.spz.pet.dao.IZRDao;
import com.bdqn.spz.pet.entity.SD;
import com.bdqn.spz.pet.entity.ZR;
import com.bdqn.spz.pet.util.BaseDao;

public class ZRDaoImplUsingSql extends BaseDao implements IZRDao {

	@Override
	public List<ZR> selectAllZR() {
		List<ZR> list=new ArrayList<>();
		try {
			connection=getConnection();
			String sql="select ZRId,ZRName from Pet";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				ZR zr=new  ZR(resultSet.getInt("ZRId"),resultSet.getString(2));
				list.add(zr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll();
		}
		return list;
	}

}
