package com.bdqn.spz.pet.dao;

import java.util.List;

import com.bdqn.spz.pet.entity.SD;

public interface ISDDao {
	/**
	 * 查询全部商店
	 * @return
	 */
	List<SD> selectAllSD();
}
