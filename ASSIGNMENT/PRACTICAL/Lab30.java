//o Write a program to demonstrate exception handling using try-catch-finally. 

package CoreJava;

import java.util.Scanner;

public class Lab30 
{ 
	public static void main(String[] args) 
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number 1 : ");
		double numb1 = sc.nextDouble();
		
		System.out.println("Enter a number 2 : ");
		double numb2 = sc.nextDouble();
		
        // Code that might throw an exception

		double result = numb1 / numb2;
		System.out.println("Division of num1 and num2 is : " + result);
		sc.close();
		}
		
		catch( ArithmeticException e)            // Code to handle the exception

		{
	        System.out.println("Exception found ArithmeticException:/ by zero");

		}
		finally       // Code that will always execute
		{
	        System.out.println("This is the finally block.");
		}
		
	}

}
