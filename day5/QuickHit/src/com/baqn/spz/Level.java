package com.baqn.spz;

/**
 * @author ʩ����
 *����
 */
public interface Level {
	
	/**����
	 * @return ����
	 */
	public abstract int getLevelNo();
	
	/**����ַ�������
	 * @return ����
	 */
	public abstract int getStrLength();
	
	/**����ַ�������
	 * @return ����
	 */
	public abstract int getStrTime();
	
	/**ʱ������
	 * @return ʱ��
	 */
	public abstract int getTimeLimit();
	
	/**��ȷ����һ�εĵ÷�
	 * @return �÷�
	 */
	public abstract int getPerScore();
}
