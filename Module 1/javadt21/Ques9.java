//  Write a program make a summation of given number(E.g. 1523 ans :-11)
package javadt21;

import java.util.Scanner;

public class Ques9
{
	public static void main(String[] args) 
	{
		int num; // variable declared 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number "); // input taken
		num = sc.nextInt();
		
		int sum=0; // initially sum is taken as 0
		while(num>0) // condition if number greater then 0
		{
			sum=sum+(num%10); // then using shorthand operater  sum+=num%10
			num=num/10; // new number till it become less then 0
		}
		System.out.println("The sum of given number is " + sum);
	}
	

}
