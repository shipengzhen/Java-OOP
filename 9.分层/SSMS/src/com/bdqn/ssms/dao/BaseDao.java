package com.bdqn.ssms.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class BaseDao {
	
	protected Connection connection;
	protected PreparedStatement preparedStatement;
	protected ResultSet resultSet;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	public void pz(){
		try {
			Properties parProperties=new Properties();
			String configFile="database.properties";//配置文件路径
			//加载配置文件到输入流
			InputStream is=BaseDao.class.getClassLoader().getResourceAsStream(configFile);
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
	protected Connection getConnection(){
		try {
			pz();
			// 1、加载驱动
			Class.forName(driver);
			// 2、建立连接
			connection=DriverManager.getConnection(url,user,password);
//			Context context=new InitialContext();
//			DataSource dataSource=(DataSource)context.lookup("java:comp/myschool/NewsManagerSystem");
//			connection=dataSource.getConnection();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	protected int exceUpdate(String sql, Object[] pats) {
		int ret = 0;
		connection =getConnection();
		try {
			preparedStatement =(PreparedStatement)connection.prepareStatement(sql);
			if (pats!=null) {
				for (int i = 0; i < pats.length; i++) {
					preparedStatement.setObject(i+1,pats[i]);
				}
			}
			ret=preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll();
		}
		return ret;
	}
	protected void closeAll() {
		if (resultSet!=null) {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (preparedStatement!=null) {
			try {
				preparedStatement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (connection!=null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
