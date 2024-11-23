//Write a program you have to make a summation of first and last Digit.
//(E.g. 1234 ans:-5)
package javadt21;

import java.util.Scanner;

public class Ques10 
{
	public static void main(String[] args) 
	{
		int num; // variable declared 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number "); // input taken
		num = sc.nextInt();
		
		int firstdigit=0; // taking two variable first and last digit initializing with 0
		int lastdigit=0;
		lastdigit = num%10; // last digit will be modulus of num
		
		while(num != 0)  // condition will checked till num does not become 0 to get the first digit 
		{
			int remainder=num%10; // remainder we get by dividing the number by 10 will the first digit 
			firstdigit = remainder;
			num=num/10; // new number will be num/10
			
		}
		
		int sum = firstdigit + lastdigit; // sum of last and first 
		System.out.println("Summation of the last and first digit is : " +sum);
		
			
		}
		
		
		

}
