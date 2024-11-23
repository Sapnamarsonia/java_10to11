//Write a Program of Addition, Subtraction ,Multiplication and Division using
//switch-case(Must Be Menu Driven)

package javadt21;

import java.util.Scanner;

public class Ques12 
{
	public static void main(String[] args) 
	{
		int num1,num2,choice; // variable declared 

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number num1 : "); // input taken for num1 
		num1 = sc.nextInt();
		System.out.println("Enter a number num2 : "); // input taken for num2 
		num2 = sc.nextInt();
		
		System.out.println("Enter a choice for operation to be performed: "); // choice is taken for operation 
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		choice = sc.nextInt(); // choice is stored 
		
		switch(choice) // switch case is used to performed the operation
		{
		case 1:System.out.println("Addition : " + (num1+num2));
		break;
		
		case 2:System.out.println("Subtraction : " + (num1-num2));
		break;
		
		case 3:System.out.println("Multiplication : " + (num1*num2));
		break;
		
		case 4:System.out.println("Division : " + (num1/num2));
		break;
		
		default: System.out.println("please Enter valid choice...");
		
		}
		
		
		
	}

}
