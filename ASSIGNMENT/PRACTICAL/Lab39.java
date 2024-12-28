//o Create a program that demonstrates object serialization

package CoreJava;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Studinfo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Studinfo(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}
public class Lab39 
{
	public static void main(String[] args) 
	{
		try
		{
		Studinfo s = new Studinfo(101, " abc ");
		FileOutputStream fout = new FileOutputStream("D:\sapna.txt");
		try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
			out.writeObject(s);
		}
		}
	
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
	}
		
	}