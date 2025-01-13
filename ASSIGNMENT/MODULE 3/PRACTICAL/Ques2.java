//o Create a program that inserts, updates, selects, and deletes data using Statement. 

package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ques2 
{
		public static void main(String[] args) 
		{
		
		String db = "Ques2"; // database name 
		String host = "jdbc:mysql://localhost:3306/"; // host 
		String url = host + db; 
		
			try 
			{
				//connection made to database 
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, "root", "root");
				Statement stmt = con.createStatement();
				System.out.println("Connection to MySQL database established successfully...");
				
				// Insert data
		        String insertSQL = "INSERT INTO info (id,name) VALUES (null,'Aishwarya')";
		        stmt.executeUpdate(insertSQL);
		        System.out.println("Data inserted successfully.");
		
		        // Update data
		        String updateSQL = "UPDATE info SET name = 'Brinda' WHERE id = '1'";
		        stmt.executeUpdate(updateSQL);
		        System.out.println("Data updated successfully.");
		
		        // Select data
		        String selectSQL = "SELECT * FROM info";
		        ResultSet rs = stmt.executeQuery(selectSQL);
		        while (rs.next()) 
		        {
		            System.out.println("id" + rs.getString("id") + "name " + rs.getString("name"));
		        }
		
		        // Delete data
		        String deleteSQL = "DELETE FROM info WHERE id = '1'";
		        stmt.executeUpdate(deleteSQL);
		        System.out.println("Data deleted successfully.");
		
				
			} 
			catch 
			(Exception e) 
			{
			// TODO Auto-generated catch block
			System.out.println("Failed to connect to MySQL database.");
            e.printStackTrace();
			}		
		
		}
		
}
