package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class M28 {
	public static void main(String[] args) 
	{
		StringBuffer sql = new StringBuffer("INSERT INTO STUDENT VALUES(6, ");
				sql.append("TO_TIMESTAMP('05-25-99 10:20:30:200', 'MM-DD-YY HH:MI:SS:FF'),");
		sql.append("TO_DATE('05-25-99 11:40:50', 'MM-DD-YY HH:MI:SS'))");
		try(Connection con = Util.getConnection();
				Statement stmt = con.createStatement())
		{
			int status = stmt.executeUpdate(sql.toString());
			System.out.println(status);
		}
       catch(SQLException ex)
       {
    	   ex.printStackTrace();
       }
	}

}
//USE FF REPRESENT MILISEC IN TIMESTAMP