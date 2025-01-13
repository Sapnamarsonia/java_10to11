package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ques4updatequery 
{
	public static void update()
	{
		int id = 2;
		String pquantity = "25";
		String newpquantity = "15";
		
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
	        String query = "update products set pquantity = '"+ newpquantity +"' where id = '" +id+"' and pquantity = '"+pquantity+"'";
	        
	        int x = stmt.executeUpdate(query);
	        if (x > 0)            
	            System.out.println("Successfully updated");            
	        else           
	            System.out.println("update Failed");
		} 
		
		catch (Exception e) 
		{
		// TODO Auto-generated catch block
		System.out.println("Failed to connect...");
        e.printStackTrace();
		}		
	}
	public static void main(String[] args) 
	{
		update();
	
	}
}
