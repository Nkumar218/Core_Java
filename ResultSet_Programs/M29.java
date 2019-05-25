package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M29 {
	public static void main(String[] args) {
		String sql = "SELECT * FROM STUDENT";
		try(Connection con = Util.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql))
		{
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.print("," + rs.getString(2));
				System.out.println("," + rs.getString(3));
				
				
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
			
		
	}

}
