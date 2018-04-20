package com.mysql.odbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 施鹏振
 *使用JDBC-ODBC桥方式建立数据库连接并关闭
 *Connection接口
 */
public class Test {
	public static void main(String[] args) {
		Connection conn = null;
		// 1、加载驱动
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2、建立连接
		try {
			conn=DriverManager.getConnection("jdbc:odbc:MySQL","spz","shipengzhen1997");
			System.out.println("建立连接成功！");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 3、关闭连接
			try {
				if (null != conn) {
					conn.close();
					System.out.println("关闭连接成功！");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
