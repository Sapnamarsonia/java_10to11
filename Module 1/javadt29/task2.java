package javadt29;

import java.util.Scanner;

public class task2
{
	public static void main(String[] args) {
		String name ="tops";
		String pass = "1234";
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name1 = sc.next();
		System.out.println("Enter password");
		String pass1 = sc.next();
		
		if(name1.equalsIgnoreCase(name) && pass1.equalsIgnoreCase(pass))
		{
			System.out.println("access granted");
		}
		else if (name1.equalsIgnoreCase(name1))
		{
			System.out.println("name is not proper ");
			
		}
		else if (pass1.equalsIgnoreCase(pass))
		{
			System.out.println("password is not proper ");
		}
		else 
		{
			System.out.println("Enter valid name and password ");
		}
		
		
	}
	
	

}
