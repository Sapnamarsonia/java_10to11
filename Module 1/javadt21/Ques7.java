// Write a program to print the number in reverse order.
package javadt21;

import java.util.Scanner;

public class Ques7 
{
	public static void main(String[] args) // main function
	{
		int n; // declare variable 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number");//take input from user 
		n = sc.nextInt();// store input in variable 
		
		for(int i=n ; i>0 ; i--)// for loop to reverse a number 
		{
			System.out.println(i); // print the value
			
		}
		
	}

}
