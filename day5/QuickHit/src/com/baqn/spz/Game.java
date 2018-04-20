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
			//ͨ��ѭ������Ҫ������ַ���
			for (int i = 0; i <level.getStrLength(); i++) {
				int rand=random.nextInt(level.getStrLength());
				//���������ƴ���ַ���
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
//				System.out.println("��̫���ˣ���ʱ���˳�!");
//				return;
//			}
			System.out.println("�������ַ���");
			Scanner scanner=new Scanner(System.in);
			String str=scanner.next();
			for (int i = 0; i <level.getStrTime()-1; i++) {
				System.out.println(buffer);
				if (str.equals(buffer.toString())) {
					player.setCurrScore(player.getCurrScore()+level.getPerScore());
					System.out.println("������ȷ�����ļ���"+player.getLevel()+",���Ļ���"+player.getCurrScore()+",��ʱ"+player.getElapsedTime());
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
						System.out.println("��ϲ���Ѿ�ͨ��");
						return;
					}
				}else {
					if (i==2) {
						break;
					}
					System.out.println("�����������������:");
					str=scanner.next();
				}
			}
			if (str!=buffer.toString()) {
				System.out.println("��������˳���");
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