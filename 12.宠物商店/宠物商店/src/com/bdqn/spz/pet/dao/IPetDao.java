package com.bdqn.spz.pet.dao;

import java.util.List;
import com.bdqn.spz.pet.entity.*;

/**
 * �ӿ�
 * @author ʩ����
 *
 */
public interface IPetDao {
	/**
	 * ��ѯȫ������
	 * @return
	 */
	List<Pet> selectAllPet();
}
