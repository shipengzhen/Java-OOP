package com.mysql.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


import com.mysql.jdbc.Connection;

public class Test {

	/**
	 * ��java��ʽ�������ݿ�
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
			// 1����������
			Class.forName(driver);
			// 2����������
			conn =(Connection)DriverManager.getConnection(url,user,password);
			System.out.println("�������ӳɹ���");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//�ر�����
			try {
				conn.close();
				System.out.println("�ر����ӳɹ�!");
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
			String configFile="com/mysql/zl/database.properties";//�����ļ�·��
			//���������ļ���������
			InputStream is=Test.class.getClassLoader().getResourceAsStream(configFile);
			//���������ж�ȡ�����б�
			parProperties.load(is);
			//����ָ���Ļ�ȡ��Ӧ��ֵ
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
