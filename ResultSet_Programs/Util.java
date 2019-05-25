package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util 
{
	public static Connection getConnection() throws SQLException
	{
		String url="jdbc:oracle:thin:@localhost:1521";
		String username = "system";
		String password = "12345";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
