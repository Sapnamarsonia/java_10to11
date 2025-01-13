//o Write a simple Java program to connect to a MySQL database using JDBC. 

package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ques1 
{
	public static void main(String[] args)
	{
		// creating connection 
		String db = "Ques1"; // database name 
		String host = "jdbc:mysql://localhost:3306/"; // host 
		String url = host + db; 
		
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, "root", "root");	
				System.out.println("Connection to MySQL database established successfully...");
				con.close();
			} 
			catch 
			(Exception e) 
			{
			System.out.println("Failed to connect to MySQL database.");
            e.printStackTrace();
			}		
	}

}
