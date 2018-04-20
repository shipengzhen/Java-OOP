package com.bdqn.spz.jdbc.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Test2 {

	/**
	 * @param args
	 * 纯java方式连接数据库
	 */
	private static ResultSet set;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	public static void main(String[] args) {
		//创建Connection 负责连接数据库的
		//
		Connection conn = null;
		try {
			 new Test2().mr();
			 new Test2().pz();
			// 1、加载驱动
			Class.forName(driver);
			// 2、建立连接
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("建立连接成功！");
			//增删改
			//SQL语句
			String sqlString="INSERT INTO Grade VALUES(?)";
			//发送sql并执行
			PreparedStatement preparedStatement=conn.prepareStatement(sqlString);
			//赋值操作
			//下标从1开始
			preparedStatement.setString(1, "嘿嘿");
			int num=preparedStatement.executeUpdate();
			if (num>0) {
				System.out.println("新增成功！");
			}
			//查询
			//SQL语句
			sqlString="select * from Grade";
			//发送sql并执行
			preparedStatement=conn.prepareStatement(sqlString);
			set=preparedStatement.executeQuery();
			//处理结果  set next()返回布尔类型
			while (set.next()) {
				System.out.println(set.getInt("GradeId")+"\t"+set.getString("GradeName"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 3、关闭连接
			if (null != conn) {
				try {
					set.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("关闭连接成功！");
			}
		}
	}
	
	
	public void mr(){
		driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		url = "jdbc:sqlserver://localhost:1433;DatabaseName=shop";
		user = "spz";
		password = "shipengzhen1997";
	}
	public void pz(){
		try {
			Properties parProperties=new Properties();
			String configFile="com/bdqn/spz/jdbc/zl/database.properties";//配置文件路径
			//加载配置文件到输入流
			InputStream is=Test2.class.getClassLoader().getResourceAsStream(configFile);
			//从输入流中读取属性列表
			parProperties.load(is);
			//根据指定的获取对应的值
			driver=parProperties.getProperty("driver");
			url=parProperties.getProperty("url");
			user=parProperties.getProperty("user");
			password=parProperties.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
