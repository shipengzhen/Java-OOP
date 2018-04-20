package com.baqn.spz;

/**
 * @author ʩ����
 *
 */
public class Player {
	
	private Level level;
	/**
	 * ��ҵ�ǰ����
	 */

	public int getLevel() {
		return level.getLevelNo();
	}
	
	/**
	 * ��ǰ�������
	 */
	private int currScore;

	public int getCurrScore() {
		return currScore;
	}

	public void setCurrScore(int currScore) {
		this.currScore = currScore;
	}
	
	/**
	 * ��ǰ����ʼʱ��
	 */
	private int startTime;

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * ��ǰ��������ʱ��
	 */
	private long elapsedTime;

	public long getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	
	
	public void game() {
		try {
			Game game=new Game(level, this);
			game.play();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Player(Level level) {
		super();
		this.level = level;
	}
}
