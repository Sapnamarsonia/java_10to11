//Write a program to find if a number is even or odd using an if-else statement. 

package CoreJava;

import java.util.Scanner;

public class Lab5 
{
	public static void main(String[] args) 
	{
		int number; //variable declared 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :"); //user input
		number = sc.nextInt();
		
		
		//using if else statment to check
		
		if(number % 2 == 0) // condition for number to be even if modulus is 0 then it is even 
		{
			System.out.println("The number is Even.");
		}
		else
		{
			System.out.println("The number is Odd.");

		}
		sc.close();
	}

}
