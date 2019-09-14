package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M10 {
	public static void main(String[] args)
	{
	
	String sql = "select id, name, age from person123321";
	int CU = ResultSet.CONCUR_UPDATABLE;
	int TS = ResultSet.TYPE_SCROLL_INSENSITIVE;
	try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement(TS, CU);
			ResultSet rs = stmt.executeQuery(sql))
		{
		if(rs.absolute(5))
		{
			rs.updateInt(2, 40);
			rs.updateString(1, "hello");//4 IS COLOUMN NO
			rs.updateRow();
		}
		System.out.println("done");
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
	}
}
