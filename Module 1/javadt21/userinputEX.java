package javadt21;

import java.util.Scanner;

public class userinputEX 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter character : "); // input taken
		String input = sc.next(); // input stored  
		
		if(input.length()==1)// length is checked
		{
			char ch = input.toLowerCase().charAt(0); // converted to lowercase
			if(ch >='a' && ch<='z') 	// character is checked whether is alphabet or not 
			{
			
				if(ch == 'a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u') // if it is alphabet then check vowel 
				{
					System.out.println("the chracter is vovel");
				}
				else // if not vowel then consonant 
				{
					System.out.println("the chracter is consonant");
				}
			}else
			{
				System.out.println("input is not a character"); // if input is not chracter 
			}
			}else
			{
				System.out.println("Enter a valid input..."); 
			}
		
		
		
	}

	

}
