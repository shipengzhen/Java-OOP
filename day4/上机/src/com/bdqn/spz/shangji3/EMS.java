package com.bdqn.spz.shangji3;

/**
 * @author 施鹏振
 *内存
 */
public interface EMS {
	/**
	 * 获取内存类型
	 * @return 类型
	 */
	String getEMSType();
	
	/**
	 * 获取内存容量大小
	 * @return 容量大小
	 */
	int getSize();
}
