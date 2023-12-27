package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{

	private static Connection conn = null;
	
	public static Connection getConn()
	{
		try {
			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		//	conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");
//			conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Swapnil/eclipse-workspace/Online Electronic Shopping/mydatabase.db");	
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String jdbcUrl = "jdbc:sqlserver://DESKTOP-683NOEG;databaseName=javatest;encrypt=true;trustServerCertificate=true";
			conn = DriverManager.getConnection(jdbcUrl, "sa", "1234");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return conn;
	}
	
}
