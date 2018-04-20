package com.mysql.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


import com.mysql.jdbc.Connection;

public class Test {

	/**
	 * 纯java方式连接数据库
	 * @param args
	 */
	private static Connection conn;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	public static void main(String[] args){
		try {
			 new Test().mr();
			 new Test().pz();
			// 1、加载驱动
			Class.forName(driver);
			// 2、建立连接
			conn =(Connection)DriverManager.getConnection(url,user,password);
			System.out.println("建立连接成功！");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//关闭连接
			try {
				conn.close();
				System.out.println("关闭连接成功!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void mr(){
		driver="com.mysql.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/MySchool";
		user="spz";
		password="shipengzhen1997";
	}
	public void pz(){
		try {
			Properties parProperties=new Properties();
			String configFile="com/mysql/zl/database.properties";//配置文件路径
			//加载配置文件到输入流
			InputStream is=Test.class.getClassLoader().getResourceAsStream(configFile);
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
