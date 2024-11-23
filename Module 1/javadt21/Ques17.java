// year is leap year or not
package javadt21;

import java.util.Scanner;

public class Ques17 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // scanner as class and sc is object
		
		System.out.println("Enter year ");// user input
		int year = sc.nextInt(); // storing value
		
		if((year%400==0) || (year%100!=0) && (year%4==0)) // if year divided by 400 or 100 is equal to zero and 
			                                                 //is divided by 4 completely 
			                                                //then is a leap year
		{
			System.out.println("the year is leap year");
		}
		else
		{
			System.out.println("the year is not leap year");
		}
		
	}

}
