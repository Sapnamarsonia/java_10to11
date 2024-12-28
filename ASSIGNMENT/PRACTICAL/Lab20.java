//o Create a program to reverse a string and check for palindromes. 

package CoreJava;

import java.util.Scanner;

public class Lab20 
{
	
	public static void main(String[] args) 
	{
		
		String s, reverse = "" ; // take variable s and rev as null

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : ");  // get user input
		
		s = sc.nextLine(); // store user input 
		
		for(int i = s.length()-1 ; i >= 0; i-- ) // using for loop to get the character reverse 
		{
			reverse += s.charAt(i); // reverser = reverse + string
		} 
		
		if(		s.toLowerCase().equals(reverse.toLowerCase()))  // using if else to check the condition 
		{
			System.out.println( s +" is palindrome");
		}
		else
		{
			System.out.println(s + " is not palindrome");
		}
		
		sc.close();
		
		
		
	}
	

}
