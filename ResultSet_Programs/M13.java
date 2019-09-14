package com.lara.ResultSet;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class M13 {

	public static void main(String[] args) {
		try(Connection con = Util.getConnection();
				Statement stmt = con.createStatement())
		{
			String s1 = "INSERT INTO EMPLOYEE(ID, NAME, AGE, EMAIL)" +
		         "VALUES(11, 'RAM', 22, 'R2GMAIL.COM')";
		   String s2 = "INSERT INTO EMPLOYEE(ID, NAME, AGE, EMAIL)" +
		          "VALUES(12, 'GOPI', 22, 'G@GMAIL.COM')";
		   stmt.addBatch(s1);
		   stmt.addBatch(s2);
		   int[] results = stmt.executeBatch();
		   System.out.println(Arrays.toString(results));
					
				}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}

}
