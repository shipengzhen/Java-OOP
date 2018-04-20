package com.bdqn.spz.pet.util;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class BaseDao {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=Pet";
	private static final String USER = "sa";
	private static final String PASSWORD = "shipengzhen1997";

	protected Connection connection;
	protected PreparedStatement preparedStatement;
	protected ResultSet resultSet;

	/**
	 * 创建连接
	 * @return
	 */
	protected Connection getConnection() {
		try {
			Class.forName(DRIVER);
			connection =DriverManager.getConnection(URL, USER,PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

	/**增删改
	 * @param sql
	 * @param param
	 * @return
	 */
	protected int executeUpdate(String sql, Object[] param) {
		int num = 0;
		try {
			connection = getConnection();
			preparedStatement=connection.prepareStatement(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					preparedStatement.setObject(i+1,param[i]);
				}
			}
			num=preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return num;
	}
	
	
	/**
	 * 释放资源
	 * @param resultSet
	 * @param preparedStatement
	 * @param connection
	 */
	protected void closeAll() {
		if (resultSet!=null) {
			try {
				resultSet.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if (preparedStatement!=null) {
			try {
				preparedStatement.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if (connection!=null) {
			try {
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
