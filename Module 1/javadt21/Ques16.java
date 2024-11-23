// check number is positive or negative
package javadt21;

import java.util.Scanner;

public class Ques16
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n>0) // using else if ladder
		{
			System.out.println("The number is positive."); // condition for number to be positive
		}
		else if(n<0)
		{
			System.out.println("The number is negative."); // condition for number to be negative
		}
		else
		{
			System.out.println("The number is equal to zero."); // condition for number which is zero
		}
	}

}
