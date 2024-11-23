// check number is odd or even
package javadt21;

import java.util.Scanner;

public class Ques14
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n%2 == 0)
		{
			System.out.println("The number is even.");
		}
		else 
		{
			System.out.println("The number is odd.");
		}
	}

}
