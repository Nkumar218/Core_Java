package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M33 {
	public static void main(String[] args) {
		String sql = "SELECT SNO, " +
	               "TO_CHAR(DOB, 'DD-MM-YY') DATE_BIRTH, " +
				"TO_CHAR(DOJ, 'DD-MM-YY') DATE_JOIN " +
	               "FROM STUDENT";
		try(Connection con = Util.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql))
		{
			while(rs.next())
			{
				System.out.print(rs.getString("SNO"));
				System.out.print("," + rs.getString("DATE_BIRTH"));	
				System.out.println("," + rs.getString("DATE_JOIN"));	
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
			
		
	}


}
