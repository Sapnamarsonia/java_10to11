//write a program you have to print the table of given number.
package javadt21;

import java.util.Scanner;

public class Ques6 
{
	public static void main(String[] args)  
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number for table : "); //input the value
		int n = sc.nextInt(); // store input in object sc
		
		for(int i=1; i<=10 ; i++)// for loop to print the table of a given number
		{
			System.out.println(n+"*" +i+ " = "+i*n); // print the answer
		}
		
	}

}
