//Write a program of to find out the Area of Triangle, Rectangle and Circle
//using If Condition.(Must Be Menu Driven)
package javadt21;

import java.util.Scanner;

public class Ques13 
{
	public static void main(String[] args) 
	{
		int choice; // variable declared for choice 
		System.out.println("Enter your choice..."); // enter your choice 
		System.out.println("1) Area of Traingle"); 
		System.out.println("2) Area of Rectangle ");
		System.out.println("3) Area of circle");
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		if(choice == 1)
		{
			int base,height;
			System.out.println("Enter the value of Base : ");
			base = sc.nextInt();
			System.out.println("Enter the value of Height : ");
			height = sc.nextInt();
			double area= (base*height)/2;
			System.out.println("Area of Traingle : "+area);
		}
		else if(choice == 2)
		{
			int length,breadth;
			System.out.println("Enter the value of Length : ");
			length = sc.nextInt();
			System.out.println("Enter the value of Breadth : ");
			breadth = sc.nextInt();
			double area= length*breadth;
			System.out.println("Area of Rectangle : "+area);
		}
		else
		{
			int radius;
			System.out.println("Enter the value of Radius: ");
			radius = sc.nextInt();
			double area= 3.14*radius*radius;
			System.out.println("Area of Traingle : " +area);
		}
	}

}
