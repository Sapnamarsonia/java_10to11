// Write a program to find out the max from given number
//(E.g. No: -1562 Max number is 6 )
package javadt21;

import java.util.Scanner;

public class Ques8 
{
	public static void main(String[] args) 
	{
		int num; // variable declared 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number "); // input taken
		num = sc.nextInt();
		
		int maxdigit = 0; // maximum digit is taken as 0
		while(num > 0) // using while loop 
		{
			int digit= num%10; // digit will be modulus of number 
			if(digit>maxdigit) // if digit is greater then maxdigit 
			{
				maxdigit=digit; // then digit will be replaced by maxdigit
			}
			num=num/10; // to get the number again we divide by 10 
		}
		System.out.println(maxdigit);
	}

}
