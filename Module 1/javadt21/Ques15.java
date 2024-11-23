// check number is prime or not prime
package javadt21;

import java.util.Scanner;

public class Ques15 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // 
		System.out.println("Enter number :"); // user input for number of term
		int num= sc.nextInt();
		
		if(num == 0 && num == 1)
		{
			System.out.println("The number is not a prime number.");
			
		}
		else
		{
			if(num %2 == 0)
			{
				System.out.println("The number is not a prime number.");
				
			}
			else
			{
				System.out.println("The number is a prime number.");
				
			}
		}
	}

}
