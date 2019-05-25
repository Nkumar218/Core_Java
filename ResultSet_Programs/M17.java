package com.lara.ResultSet;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class M17 
{
	public static void main(String[] args) 
	{
		String sql ="INSERT INTO EMPLOYEE(ID, NAME, AGE) VALUES(?,?,?)";
		try(Connection con = Util.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql))
		{
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			pmd.getParameterCount();
			pstmt.setInt(1, 1011);
			pstmt.setString(2, "muskaan");
			pstmt.setInt(3, 54);
			int status = pstmt.executeUpdate();
			System.out.println(status);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
