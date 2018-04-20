package com.baqn.spz;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private Level level;
	private Player player;
	public void play(){
		try {
			StringBuffer buffer=new StringBuffer();
			Random random=new Random();
			//通过循环生成要输出的字符串
			for (int i = 0; i <level.getStrLength(); i++) {
				int rand=random.nextInt(level.getStrLength());
				//根据随机数拼接字符串
				switch (rand) {
					case 0:
						buffer.append(">");
						break;
					case 1:
						buffer.append("<");
						break;
					case 2:
						buffer.append("*");
						break;
				}
			}
//			player.setElapsedTime(System.currentTimeMillis()-player.getStartTime()); 
//			if (player.getElapsedTime()>level.getTimeLimit()) {
//				System.out.println("您太慢了，超时，退出!");
//				return;
//			}
			System.out.println("请输入字符：");
			Scanner scanner=new Scanner(System.in);
			String str=scanner.next();
			for (int i = 0; i <level.getStrTime()-1; i++) {
				System.out.println(buffer);
				if (str.equals(buffer.toString())) {
					player.setCurrScore(player.getCurrScore()+level.getPerScore());
					System.out.println("输入正确，您的级别"+player.getLevel()+",您的积分"+player.getCurrScore()+",用时"+player.getElapsedTime());
					if (level instanceof Level0) {
						Player player=new Player(new Level1());
						player.game();
					}else if (level instanceof Level1) {
						Player player=new Player(new Level2());
						player.game();
					}else if (level instanceof Level2) {
						Player player=new Player(new Level3());
						player.game();
					}else if (level instanceof Level3) {
						System.out.println("恭喜你已经通关");
						return;
					}
				}else {
					if (i==2) {
						break;
					}
					System.out.println("输入错误，请重新输入:");
					str=scanner.next();
				}
			}
			if (str!=buffer.toString()) {
				System.out.println("输入错误，退出！");
				return;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Game(Level level, Player player) {
		super();
		this.level = level;
		this.player = player;
	}
}