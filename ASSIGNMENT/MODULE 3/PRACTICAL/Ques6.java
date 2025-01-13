//Demonstrate how to navigate through the ResultSet using methods like next(), previous(), etc.
package DatabaseAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ques6 
{
	    public static void main(String[] args) 
	    {

	    	String db = "Ques6"; // database name 
			String host = "jdbc:mysql://localhost:3306/"; // host 
			String url = host + db; 
			
	        String query = "SELECT id, name, surname FROM studentdetails";

			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, "root", "root");	
				System.out.println("Connection to MySQL database established successfully...");
	            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		        ResultSet rs = stmt.executeQuery(query);

	            // First, move to the first row
	            if (rs.first()) 
	            {
	                System.out.println("\nFirst Row: ID = " + rs.getInt("id") + ", Name = " + rs.getString("name")+ ",surname = " + rs.getString("surname"));
	            }

	            // Move to the next row
	            if (rs.next()) 
	            {
	                System.out.println("\nNext Row: ID = " + rs.getInt("id") + ", Name = " + rs.getString("name")+",surname = " + rs.getString("surname"));
	            }

	            // Move to the previous row (if you're not at the first row)
	            if (rs.previous()) 
	            {
	                System.out.println("\nPrevious Row: ID = " + rs.getInt("id") + ", Name = " + rs.getString("name")+",surname = " + rs.getString("surname"));
	            }

	            // Move to the last row
	            if (rs.last()) 
	            {
	                System.out.println("\nLast Row: ID = " + rs.getInt("id") + ", Name = " + rs.getString("name")+",surname = " + rs.getString("surname"));
	            }

	            // Move to a specific row (e.g., 2nd row)
	            if (rs.absolute(2)) 
	            {
	                System.out.println("\nAbsolute Row 2: ID = " + rs.getInt("id") + ", Name = " + rs.getString("name")+",surname = " + rs.getString("surname"));
	            }

	            // Check if there's a next row and navigate
	            if (!rs.isLast() && rs.next()) 
	            {
	                System.out.println("\nNext Row After Last: ID = " + rs.getInt("id") + ", Name = " + rs.getString("name")+",surname = " + rs.getString("surname"));
	            }

			} 
			catch ( Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			


	    }
}

