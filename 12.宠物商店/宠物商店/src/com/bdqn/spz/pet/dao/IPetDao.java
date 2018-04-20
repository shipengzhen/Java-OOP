package com.bdqn.spz.pet.dao;

import java.util.List;
import com.bdqn.spz.pet.entity.*;

/**
 * 接口
 * @author 施鹏振
 *
 */
public interface IPetDao {
	/**
	 * 查询全部宠物
	 * @return
	 */
	List<Pet> selectAllPet();
}
