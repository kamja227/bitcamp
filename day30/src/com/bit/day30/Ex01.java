package com.bit.day30;

import java.sql.SQLException;
import java.util.Properties;

public class Ex01 {
	
	public static void main(String[] args) {
		// dept (insert)

//		jdbc:oracle:<drivertype>:<user>/<password>@<database>
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // listener port 1521
		String sql = "insert into dept values (50, '������', '����')";
//		String sql = "update dept set dname = '������' where deptno = 50"; // ����
//		String sql = "delete from dept where deptno = 50"; // ����
		
		oracle.jdbc.driver.OracleDriver driver = null;
		driver = new oracle.jdbc.driver.OracleDriver();
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		java.util.Properties prop = null;
		
		prop = new Properties();
		
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		
		try {
			conn = java.sql.DriverManager.getConnection(url, prop);
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
//			System.out.println("���Ӽ��� : " + (conn!=null));
			System.out.println("�������� ����" + result);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
}
