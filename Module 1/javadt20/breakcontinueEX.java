package javadt20;

public class breakcontinueEX 
{
	public static void main(String[] args)
	{
		for(int i=1 ; i<=10 ; i++)  // using for loop print the value of i
		{
			if(i==7) // if condition is applied here
			{
				break; // loop will break at i=7
				// continue;  // loop will continue if we use continue but it will skip the value of i==7
			}
			
			System.out.println(i); // print the value of i
		}
	}

}
