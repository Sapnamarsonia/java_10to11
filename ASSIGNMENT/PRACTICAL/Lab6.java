// Implement a simple menu-driven program using a switch-case. 

package CoreJava;

import java.util.Scanner;

public class Lab6 
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
		
		switch(choice)  // using switch case
		{
		case 1: // for traingle
			int base,height;
			System.out.println("Enter the value of Base : ");
			base = sc.nextInt();
			System.out.println("Enter the value of Height : ");
			height = sc.nextInt();
			double area = (base*height)/2;
			System.out.println("Area of Traingle : "+area);
		break;
		
		case 2: // for rectagle
			int length,breadth;
			System.out.println("Enter the value of Length : ");
			length = sc.nextInt();
			System.out.println("Enter the value of Breadth : ");
			breadth = sc.nextInt();
			double area1 = length*breadth;
			System.out.println("Area of Rectangle : "+area1);
		break;
		
		case 3: // for circle
			int radius;
			System.out.println("Enter the value of Radius: ");
			radius = sc.nextInt();
			double area2 = 3.14*radius*radius;
			System.out.println("Area of Traingle : " +area2);
		break;
		
		}
		sc.close();
}
}