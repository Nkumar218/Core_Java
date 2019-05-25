package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class M22 
{
	public static void main(String[] args)
	{
		String sql = "INSERT INTO PERSON123321 VALUES(1, SYSDATE, SYSDATE)";
		try(Connection con = Util.getConnection();
		 Statement stmt = con.createStatement())
		{
			int status = stmt.executeUpdate(sql);
			System.out.println(status);
		}
       catch(SQLException ex)
       {
    	   ex.printStackTrace();
       }
	}
}
