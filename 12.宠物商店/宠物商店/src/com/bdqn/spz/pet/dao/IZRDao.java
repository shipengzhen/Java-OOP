package com.bdqn.spz.pet.dao;

import java.util.List;

import com.bdqn.spz.pet.entity.ZR;

public interface IZRDao {
	/**
	 * 查询全部主人
	 * @return
	 */
	List<ZR> selectAllZR();
}
