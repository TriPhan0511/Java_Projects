package com.triphan.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.triphan.databasehandler.DatabaseHandler;

public class Tester_2 
{
	public static void main(String[] args)
	{
		DatabaseHandler dbHandler = new DatabaseHandler();
		
		try (Connection conn = dbHandler.getConnection())
		{
			String query = "SELECT * FROM Employee";
			try 
			(
				Statement stat = conn.createStatement();
				ResultSet result = stat.executeQuery(query);
			)
			{
				while (result.next())
				{
					System.out.println("\nID: " + result.getString("ID"));
					System.out.println(
										"Full name: " 
										+ result.getString("FirstName").trim() 
										+ " "
										+ result.getString("LastName").trim()
									);
				}
			}
		}
		catch (SQLException e)
		{
			for (Throwable t: e)
			{
				t.printStackTrace();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
