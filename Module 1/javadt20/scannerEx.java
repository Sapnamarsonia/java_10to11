package javadt20;

import java.util.Scanner;

public class scannerEx 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id ");
		int id = sc.nextInt();
		
		System.out.println("Enter your Name ");
		String Name = sc.next();
		
		System.out.println("Enter your salary ");
		double salary = sc.nextDouble();
		
		System.out.println(id);
		System.out.println(Name);
		System.out.println(salary);
		
		
		
	}

}
