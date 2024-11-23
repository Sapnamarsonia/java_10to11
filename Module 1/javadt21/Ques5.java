//e. Write a program you have to print the Fibonacci series up to user given number
package javadt21;

import java.util.Scanner;

public class Ques5 
{
	public static void main(String[] args) 
	{
		int term1 = 0; // num1 is 0 in this series
		int term2 = 1; // num 2 is 1 in this series 
		int i; // variable i is taken
		
		Scanner sc = new Scanner(System.in); // 
		System.out.println("Enter number of terms :"); // user input for number of term
		int num= sc.nextInt();
		
		for(i=0 ; i<=num ; i++ ) // using for loop 
		{
			System.out.println(term1); // print the first number
			
			int term3 = term1+term2; // term3 will be addition of term1 and term2
			term1=term2; // swapping of number
			term2=term3;
	
		}
	}
}
