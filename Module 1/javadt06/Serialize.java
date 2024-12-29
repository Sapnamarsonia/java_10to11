package javadt06;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize 
{
	public static void main(String[] args) 
	{
		try
		{
			SerializeEx i = new SerializeEx();
			FileOutputStream fout = new FileOutputStream("D://hp.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(i);
			
		}
		catch ( Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Success");
		
	}

}
