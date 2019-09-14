package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M12 {
	public static void main(String[] args)
	{
	
	String sql = "select id, name, age from person123321";
	int CU = ResultSet.CONCUR_UPDATABLE;
	int TS = ResultSet.TYPE_SCROLL_INSENSITIVE;
	try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement(TS, CU);
			ResultSet rs = stmt.executeQuery(sql))
		{
	
			rs.moveToInsertRow();
			rs.updateInt(1, 10);
			rs.updateString(2, "manu");
			rs.updateInt(3, 33);
//			rs.updateString(4, "M@M.COM");
//			rs.insertRow();
			System.out.println("done");
		}
		
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
