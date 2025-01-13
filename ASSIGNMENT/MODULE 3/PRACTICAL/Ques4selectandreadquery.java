package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ques4selectandreadquery 
{
	public static void select()
	{
		int id = 1;
		
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
	        String query = "select * from products where id = '" + id+"'";
	        ResultSet rs = stmt.executeQuery(query);
	        if (rs.next())
	        {
	            System.out.println("id :" + rs.getString(1));
	            System.out.println("pname :" + rs.getString(2));
	            System.out.println("pquantity :" + rs.getString(3));
	        }

	        else           
	            System.out.println("no data found");
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
		select();
		
	}

}
