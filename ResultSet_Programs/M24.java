package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class M24 {
	public static void main(String[] args) 
	{
		String sql = "INSERT INTO STUDENT VALUES(3,'23-JAN-1999 17:50:25', '23-DEC-2016 15:20:45')";
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
