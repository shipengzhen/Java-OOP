package com.mysql.odbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ʩ����
 *ʹ��JDBC-ODBC�ŷ�ʽ�������ݿ����Ӳ��ر�
 *Connection�ӿ�
 */
public class Test {
	public static void main(String[] args) {
		Connection conn = null;
		// 1����������
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2����������
		try {
			conn=DriverManager.getConnection("jdbc:odbc:MySQL","spz","shipengzhen1997");
			System.out.println("�������ӳɹ���");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 3���ر�����
			try {
				if (null != conn) {
					conn.close();
					System.out.println("�ر����ӳɹ���");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
