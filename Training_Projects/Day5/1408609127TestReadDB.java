package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class TestReadDB 
{
	
	String myQuery;
	Connection myCon = null;
	Statement mySt;

	ResultSet rs;
	
	@Test
	public void ReadDB() throws Exception
	{
		
			
			myCon = DriverManager.getConnection("jdbc:odbc:QT_Flight32", "", "");
			mySt = myCon.createStatement();
			myQuery = "Select * from orders where Tickets_Ordered>1";
			rs = mySt.executeQuery(myQuery); 
			if (rs == null) 
			{
			System.out.print("Empty result set");
			}
			
			//Going through all the records
			while (rs.next()) 
			{
			System.out.print(rs.getString("Customer_Name"));
			System.out.println();
			}

		
	}

	

}
