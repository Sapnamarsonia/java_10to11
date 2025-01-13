//o Modify the program to use PreparedStatement for parameterized queries. 

package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ques3
{
	public static void main(String[] args) 
	{
		// connection to database 
		String db = "Ques3"; // database name 
		String host = "jdbc:mysql://localhost:3306/"; // host 
		String url = host + db; 
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection to MySQL database established successfully...");
			
			// using prepared statement to insert the values 
			PreparedStatement pstmt=con.prepareStatement("insert into studinfo values(?,?,?)");  
			pstmt.setInt(1,101);
			pstmt.setString(2,"Priya");  
			pstmt.setString(3,"Sharma");
			
			// execute the query 
			int i = pstmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
		} 
		catch ( Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Failed to connect to MySQL database.");
			e.printStackTrace();
		}
		
	}

}
