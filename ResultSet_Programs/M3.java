package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M3 {
public static void main(String[] args) {
		
		String sql = "select id, name, age from person123321";
		int CU = ResultSet.CONCUR_UPDATABLE;
		int TS = ResultSet.TYPE_SCROLL_INSENSITIVE;
		try(Connection con = Util.getConnection();
				Statement stmt = con.createStatement(TS, CU);
				ResultSet rs = stmt.executeQuery(sql))
		{
			System.out.println("reading int the forward direction");
			while(rs.next())
			{
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.println(rs.getInt("age") + "\t");
			
			}
            System.out.println(".............");
			System.out.println("reading int the reverse direction");
			while(rs.previous())
			{
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.println(rs.getInt("age") + "\t");
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}				
	}
}

/*
reading int the forward direction
1	RAMU	22	R@GMAIL.COM	
2	MANU	24	M@GMAIL.COM	
3	NAVEEN	25	N@GMAIL.COM	
11	RAM	22	R2GMAIL.COM	
5	RAMANA	40	TEST@GMAIL.COM	
6	MUNALI	21	M@GMAIL.COM	
7	RUPA	26	RU@GMAIL.COM	
10	manu	33	M@M.COM	
12	GOPI	22	G@GMAIL.COM	
.............
reading int the reverse direction
12	GOPI	22	G@GMAIL.COM	
10	manu	33	M@M.COM	
7	RUPA	26	RU@GMAIL.COM	
6	MUNALI	21	M@GMAIL.COM	
5	RAMANA	40	TEST@GMAIL.COM	
11	RAM	22	R2GMAIL.COM	
3	NAVEEN	25	N@GMAIL.COM	
2	MANU	24	M@GMAIL.COM	
1	RAMU	22	R@GMAIL.COM	
*/