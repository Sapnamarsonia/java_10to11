/*Write a program that retrieves and displays metadata information about your 
database using DatabaseMetaData. 
o Display database name, version, list of tables, and supported SQL features.*/


package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ques7 
{
	 public static void main(String[] args) 
	    {

	    	String db = "Ques6"; // database name 
			String host = "jdbc:mysql://localhost:3306/"; // host 
			String url = host + db; 
		
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, "root", "root");	
				System.out.println("Connection to MySQL database established successfully...");
	            Statement stmt = con.createStatement();
	            
	            // Retrieving the DatabaseMetaData object
	            DatabaseMetaData metaData = con.getMetaData();
	            
	            // Displaying metadata information
	            System.out.println("Database product Name: " + metaData.getDatabaseProductName());
	            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());

	       
	            // Get list of tables
	            System.out.println("\nList of Tables:");
	            ResultSet tables = metaData.getTables(null, null, "%", new String[] {"TABLE"});
	            while (tables.next()) {
	                System.out.println("Table Name: " + tables.getString("TABLE_NAME"));
	            }
	            tables.close();
	            con.close();
	            stmt.close();
			} 
			catch ( Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

}
