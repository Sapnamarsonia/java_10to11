//Write Program use switch-case statement. Display Monday to Sunday
package javadt21;

import java.util.Scanner;

public class Ques11 
{
	public static void main(String[] args)
	{
		int day=4;  //variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for day "); // input taken
		day = sc.nextInt();
		
		switch(day)// using switch case method 
		{
		
			case 1: System.out.println("Monday");
			break;
			
			case 2: System.out.println("Tuesday");
			break;
			
			case 3: System.out.println("Wednesday");
			break;
			
			case 4: System.out.println("Thursday");
			break;
			
			case 5: System.out.println("Friday");
			break;
			
			case 6: System.out.println("Saturday");
			break;
			
			case 7: System.out.println("Sunday");
			break;
			
			default: System.out.println("number is not valid...");
			break;
			
		}
	}

}
