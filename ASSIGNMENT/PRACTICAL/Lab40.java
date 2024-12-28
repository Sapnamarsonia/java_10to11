//o Write a program to read input from the console using Scanner. 

package CoreJava;

import java.util.Scanner;

public class Lab40
{
	public static void main(String[] args)
	{
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name = sc.next()
;
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		
		// display the input
		System.out.println("My name is " + name );
		System.out.println("I am "+ age + " years old.");
		sc.close();
	}

}
