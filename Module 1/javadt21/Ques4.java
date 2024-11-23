//d .write a program you have to find the factorial of given number.5!=5*4*3*2*1
package javadt21;

import java.util.Scanner;

public class Ques4 
{
	public static void main(String[] args) // main method
	{
		int i=1,fact=1; // declaring i as 1 and fact as 1
		
		Scanner sc = new Scanner(System.in); // scanner as class and sc is object
		
		System.out.println("Enter your number ");// user input
		int number = sc.nextInt(); // storing value
		
		for(i=1;i<=number ; i++) // for loop to get factorial 
		{
			fact*=i;  // fact=fact*i // fact=new fact*i
		}
		System.out.println("factorial of "+number+" is "+fact);
		
	}

}
