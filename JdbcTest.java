package com.app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTest 
{
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "system";
		String pass = "12345";
		try
		{
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			System.out.println("connected successfully");
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
	}
}
