//o Implement multiple catch blocks for different types of exceptions. 

package CoreJava;

public class Lab31 
{
	public static void validage(int age )
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is not valid.");
		}
		else
		{
			System.out.println("You can vote.");
		}

	}
	public static void main(String[] args) 
	{
		try
		{
			validage(16);
			
		}
		catch(ArithmeticException e) // catch to hANDLE arthematic exeption
		{
			System.out.println("Error: Age is less than 18. Cannot vote.");
			
		}
		catch(Exception e) // handle to except any other exeption
		{
			e.printStackTrace();

		}
		
	}
}

