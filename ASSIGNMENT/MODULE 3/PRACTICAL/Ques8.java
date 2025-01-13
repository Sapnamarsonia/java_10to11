/*Write a program that retrieves and displays column names, types, and count of a 
ResultSet using ResultSetMetaData. 
Use a SELECT query to display this metadata for a specific table*/


package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Ques8 
{
	 public static void main(String[] args) 
	    {

	    	String db = "Ques6"; // database name 
			String host = "jdbc:mysql://localhost:3306/"; // host 
			String url = host + db; 
		
	        String query = "SELECT * FROM studentdetails LIMIT 1";  // Use a limit to avoid fetching too much data

			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, "root", "root");	
				System.out.println("Connection to MySQL database established successfully...");
	            Statement stmt = con.createStatement();
	            ResultSet resultSet = stmt.executeQuery(query);

	            // Retrieving the ResultSetMetaData
	            ResultSetMetaData metaData = resultSet.getMetaData();

	            // Get the number of columns in the ResultSet
	            int columnCount = metaData.getColumnCount();
	            System.out.println("Column Count: " + columnCount);
	            
	            // Loop through each column and display its name and type
	            System.out.println("\nColumn Name | Column Type");
	            for (int i = 1; i <= columnCount ; i++) {
	                String columnName = metaData.getColumnName(i);
	                String columnType = metaData.getColumnTypeName(i);
	                System.out.println(columnName + " | " + columnType);
	            }
	            
	            
			} 
			catch ( Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

}