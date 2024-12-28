//o Write a program to display the Fibonacci series using a loop. 

package CoreJava;

import java.util.Scanner;

public class Lab7
{
	public static void main(String[] args) 
	{
		int term1 = 0;   // fibonacci series start with 0 then 1 so inital value are declared 
		int term2 = 1;
		
		int i;
		Scanner sc = new Scanner(System.in); // 
		System.out.println("Enter number of terms :"); // user input for number of term
		int num= sc.nextInt();
		
		for(i=0 ; i<num ; i++)
		{
			System.out.println(term1);
			
			int term3 = term1 + term2; //term3 will be add of term1 and term2 
			term1 = term2; //swapping of number
			term2 = term3;
		}
		
		sc.close();

	}	
	
}
