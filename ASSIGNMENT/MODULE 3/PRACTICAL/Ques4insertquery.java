/*Write a Java program that performs the following CRUD operations: 
Insert a new record. 
Update an existing record. 
Select and display records. 
Delete a record from the database. */


package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ques4insertquery 
{
	
	public static void insert()
	{
		int id = 2;
		String pname = "mouse";
		String pquantity = "25";
		
		
		// connection to database 
				String db = "Ques4"; // database name 
				String host = "jdbc:mysql://localhost:3306/"; // host 
				String url = host + db; 
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "root");	
			System.out.println("Connection to MySQL database established successfully...");
            Statement stmt = con.createStatement();

			 // Inserting data in database
	        String query = "insert into products values ('"+id+"', '"+pname+"', '" +pquantity+ "')";
	        
	        int x = stmt.executeUpdate(query);
	        if (x > 0)            
	            System.out.println("Successfully Inserted");            
	        else           
	            System.out.println("Insert Failed");
		} 
		catch 
		(Exception e) 
		{
		// TODO Auto-generated catch block
		System.out.println("Failed to connect...");
        e.printStackTrace();
		}		
		
	}
	
	public static void main(String[] args) 
	{
	 insert();
	
	}
}
