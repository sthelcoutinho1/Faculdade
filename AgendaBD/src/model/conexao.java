package model;

import java.sql.*;
public class conexao 
{
	public static void main (String[] args) 
	{
		Connection conn = null;
		try
		{
			String userName = "estacionecar";
			String password = "carestaci@8";
			String url = "jdbc:mysql://estacionecar.mysql.uhserver.com";
			//Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("Conectou nessa merda");
		}
		catch (Exception e)
		{
			System.err.println("Não conectou nessa merda");
			 System.out.println("SQLException: " + e.getMessage());

		}
		finally
		{
			if(conn != null)
			{
				try
				{
					conn.close();
					System.out.println("fechou essa merda");
				}
				catch (Exception e) {}
			}

		}
	}
}
	
