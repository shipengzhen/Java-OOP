package com.bdqn.shipengzhen.Text;

import javax.swing.*;
import java.awt.*;

public class Text extends JFrame {
	public Text()
	{
		this.setTitle("һ������");
//		this.setBounds(200,200,200,200);
		this.setSize(400,200);
		this.setVisible(true);
		this.add(new Label("11"));
		Button button=new Button("��ť");
//		button.setBounds(1, 2, 2, 3);
		button.setPreferredSize(new Dimension(20,30));
		this.add(button);
		Button bt1 = new Button("��"); 
		Button bt2 = new Button("��"); 
		Button bt3 = new Button("��"); 
		Button bt4 = new Button("��"); 
		Button bt5 = new Button("��"); 

		BorderLayout lay = new BorderLayout(6, 6); 
		this.setLayout(lay);// ��������Ӧ������Ӱ�ť֮ǰ���壬�����֮��ͻ���ʾ���˰�ť�� 
		bt1.setPreferredSize(new Dimension(20, 50));// ��ť��СĬ���Ǹ��ݴ����Զ������ģ�ʹ��������ǿ�ƣ����ȣ����ð�ť��С 

		this.add(bt1, BorderLayout.NORTH); 
		this.add(bt2, BorderLayout.SOUTH); 
		this.add(bt3, BorderLayout.WEST); 
		this.add(bt4, BorderLayout.EAST); 
		this.add(bt5, BorderLayout.CENTER); 
		this.setResizable(true); 
		// fr.pack(); // �������У��������൱��setSize()�����ô��ھ���С��С���ո��ܹ�����סb1��b2������ť 
	}
	public static void main(String[] args) {
		Text t=new Text();
	}
}
