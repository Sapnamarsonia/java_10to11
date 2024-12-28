//o Create a program that reads from one file and writes the content to another file. 

package CoreJava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Lab42
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader fr = new FileReader("input.txt"); // file to read data 
			FileWriter fw = new FileWriter("output.txt");  // file to write or paste data 
			 
			String str = " ";
			int i;
			while((i = fr.read()) != -1)    
			{
				str += (char)i;     // reading by character 
			}
			System.out.println(str);
			fw.write(str);
			
			fr.close();
			fw.close();
			
			System.out.println(
	                "File reading and writing both done");
			
		}
		catch(IOException e)
		{
			System.out.println("error..");
		}
	}

}
