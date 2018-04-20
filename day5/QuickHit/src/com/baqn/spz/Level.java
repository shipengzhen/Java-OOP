package com.baqn.spz;

/**
 * @author 施鹏振
 *级别
 */
public interface Level {
	
	/**级别
	 * @return 级别
	 */
	public abstract int getLevelNo();
	
	/**输出字符串长度
	 * @return 长度
	 */
	public abstract int getStrLength();
	
	/**输出字符串次数
	 * @return 次数
	 */
	public abstract int getStrTime();
	
	/**时间限制
	 * @return 时间
	 */
	public abstract int getTimeLimit();
	
	/**正确输入一次的得分
	 * @return 得分
	 */
	public abstract int getPerScore();
}
