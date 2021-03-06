package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M9 {
	public static void main(String[] args)
	{
	
	String sql = "select id, name, age from person123321";
	int CU = ResultSet.CONCUR_UPDATABLE;
	int TS = ResultSet.TYPE_SCROLL_INSENSITIVE;
	try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement(TS, CU);
			ResultSet rs = stmt.executeQuery(sql))
	{
		System.out.println("reading 5th record");
		if(rs.absolute(5))
		{
		System.out.print(rs.getInt("id") + "\t");
		System.out.print(rs.getString("name") + "\t");
		System.out.println(rs.getInt("age") + "\t");
		//System.out.println(rs.getString("email") + "\t");
		
}
		
			System.out.println("reading 2nd record");
			if(rs.relative(-3))
			{
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.println(rs.getInt("age") + "\t");
			//System.out.println(rs.getString("email") + "\t");
			}
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
	}
}/*reading 5th record
5	RAMANA	28	RA@GMAIL.COM	
reading 2nd record
2	MANU	24	M@GMAIL.COM	
*/
