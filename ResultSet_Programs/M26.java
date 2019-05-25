package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class M26 {
	public static void main(String[] args) 
	{
		String sql = "INSERT INTO STUDENT VALUES(5, TO_DATE('05-25-99', 'MM-DD-YY') , TO_DATE('10-20-10', 'MM-DD-YY'))";
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
