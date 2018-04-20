package com.baqn.spz;

/**
 * @author 施鹏振
 *
 */
public class Player {
	
	private Level level;
	/**
	 * 玩家当前级别
	 */

	public int getLevel() {
		return level.getLevelNo();
	}
	
	/**
	 * 当前级别积分
	 */
	private int currScore;

	public int getCurrScore() {
		return currScore;
	}

	public void setCurrScore(int currScore) {
		this.currScore = currScore;
	}
	
	/**
	 * 当前级别开始时间
	 */
	private int startTime;

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * 当前级别已用时间
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
