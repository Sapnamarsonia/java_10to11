//Write a program to read and write content to a file using FileReader and FileWriter. 
package CoreJava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab37 
{
	 public static void main(String[] args) 
	 
	 {
	        try
	        {
	            // Create a FileReader object to read from a file
	            FileReader reader = new FileReader("input.txt");

	            // Create a FileWriter object to write to a file
	            FileWriter writer = new FileWriter("output.txt");

	            int ch;
	            // Read each character from the input file and write it to the output file
	            while ((ch = reader.read()) != -1) 
	            {
	                writer.write(ch);
	            }

	            // Close the input and output files
	            reader.close();
	            writer.close();

	            System.out.println("File has been copied successfully!");
	        }
	        
	        catch (IOException e) 
	        
	        {
	            System.out.println("An error occurred: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }


}
