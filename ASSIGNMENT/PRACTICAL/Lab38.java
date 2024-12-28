//o Implement a program that reads a file line by line using BufferedReader. 

package CoreJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab38
{
	public static void main(String[] args) 
	{
		String path = "C:\\Users\\Lenovo\\Desktop\\A TO Z.txt";// file path
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) 
		{
            String line;
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
    }
		
}
