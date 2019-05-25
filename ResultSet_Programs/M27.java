package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class M27 {
	

		public static void main(String[] args) 
		{
			StringBuffer sql = new StringBuffer("INSERT INTO STUDENT VALUES(6, ");
					sql.append("TO_DATE('05-25-99 10:20:30', 'MM-DD-YY HH:MI:SS'),");
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
//time is allowed into  mili sec in date col bt nt in time col
//S
