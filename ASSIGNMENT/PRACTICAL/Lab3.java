// Create a calculator using arithmetic and relational operators. 
package CoreJava;

import java.util.Scanner;

public class Lab3 
{
	public static void main(String[] args) 
	{
		double num1;  // variable declared
		double num2;
		char ch;
		
		System.out.println("Enter number 1 : "); // user input for numbers
		System.out.println("Enter number 2 : ");
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();    //store value in varaiable
		num2 = sc.nextDouble();
		
		System.out.println("Choose the Operation");
		System.out.println(" + , - , * , / ,% ,== , !=, >, <, >=, <=");
		ch = sc.next().charAt(0);
		
		double result = 0;
       // boolean isRelational = false;
        boolean camparisonResult = false; ;
		
      
        if(ch == '+')
        {
        	 result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if(ch == '-') 
        {
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if(ch == '*')
        {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if(ch == '/')
        {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
        }
        else if(ch == '%')
        {
            result = num1 % num2;
            System.out.println("Result: " + result);
        }
        else if(ch == '>')
        {
        	camparisonResult = num1 > num2;
            System.out.println("Result: " + camparisonResult);
        }
        else if (ch == '<')
        {
            camparisonResult = num1 < num2;
            System.out.println("Result: " + camparisonResult);
        }
        
        else 
        {
        	System.out.println("Invalid operator!");
        }
             
	sc.close();	}  

}
