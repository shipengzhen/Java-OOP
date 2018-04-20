package com.bdqn.shipengzhen.Text;

import javax.swing.*;
import java.awt.*;

public class Text extends JFrame {
	public Text()
	{
		this.setTitle("一个窗体");
//		this.setBounds(200,200,200,200);
		this.setSize(400,200);
		this.setVisible(true);
		this.add(new Label("11"));
		Button button=new Button("按钮");
//		button.setBounds(1, 2, 2, 3);
		button.setPreferredSize(new Dimension(20,30));
		this.add(button);
		Button bt1 = new Button("上"); 
		Button bt2 = new Button("下"); 
		Button bt3 = new Button("左"); 
		Button bt4 = new Button("右"); 
		Button bt5 = new Button("中"); 

		BorderLayout lay = new BorderLayout(6, 6); 
		this.setLayout(lay);// 布局设置应该在添加按钮之前定义，如果在之后就会显示不了按钮； 
		bt1.setPreferredSize(new Dimension(20, 50));// 按钮大小默认是根据窗口自动调整的，使用这句可以强制（优先）设置按钮大小 

		this.add(bt1, BorderLayout.NORTH); 
		this.add(bt2, BorderLayout.SOUTH); 
		this.add(bt3, BorderLayout.WEST); 
		this.add(bt4, BorderLayout.EAST); 
		this.add(bt5, BorderLayout.CENTER); 
		this.setResizable(true); 
		// fr.pack(); // 紧凑排列，其作用相当于setSize()，即让窗口尽量小，小到刚刚能够包容住b1、b2两个按钮 
	}
	public static void main(String[] args) {
		Text t=new Text();
	}
}
