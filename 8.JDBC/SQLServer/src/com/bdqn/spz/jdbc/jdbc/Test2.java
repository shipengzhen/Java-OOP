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
	 * ��java��ʽ�������ݿ�
	 */
	private static ResultSet set;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	public static void main(String[] args) {
		//����Connection �����������ݿ��
		//
		Connection conn = null;
		try {
			 new Test2().mr();
			 new Test2().pz();
			// 1����������
			Class.forName(driver);
			// 2����������
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("�������ӳɹ���");
			//��ɾ��
			//SQL���
			String sqlString="INSERT INTO Grade VALUES(?)";
			//����sql��ִ��
			PreparedStatement preparedStatement=conn.prepareStatement(sqlString);
			//��ֵ����
			//�±��1��ʼ
			preparedStatement.setString(1, "�ٺ�");
			int num=preparedStatement.executeUpdate();
			if (num>0) {
				System.out.println("�����ɹ���");
			}
			//��ѯ
			//SQL���
			sqlString="select * from Grade";
			//����sql��ִ��
			preparedStatement=conn.prepareStatement(sqlString);
			set=preparedStatement.executeQuery();
			//������  set next()���ز�������
			while (set.next()) {
				System.out.println(set.getInt("GradeId")+"\t"+set.getString("GradeName"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 3���ر�����
			if (null != conn) {
				try {
					set.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("�ر����ӳɹ���");
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
			String configFile="com/bdqn/spz/jdbc/zl/database.properties";//�����ļ�·��
			//���������ļ���������
			InputStream is=Test2.class.getClassLoader().getResourceAsStream(configFile);
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
