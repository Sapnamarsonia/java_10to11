package CoreJava;

import java.util.Scanner;

public class Labb3 
{
	public static void main(String[] args) 
	{
		double num1;  // variable declared
		double num2;
		System.out.println("Enter number 1 : "); // user input for numbers
		System.out.println("Enter number 2 : ");
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();    //store value in varaiable
		num2 = sc.nextDouble();
		
		System.out.println("Choose the Operation");
        System.out.println("1: > (greater than)");
        System.out.println("2: < (less than)");
        System.out.println("3: >= (greater than or equal to)");
        System.out.println("4: <= (less than or equal to)");
        System.out.println("5: == (equal to)");
        System.out.println("6: != (not equal to)");
        
        int choice = sc.nextInt();
        
        switch (choice) 
        {
            case 1:
                System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
                break;
            case 2:
                System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
                break;
            case 3:
                System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
                break;
            case 4:
                System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
                break;
            case 5:
                System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
                break;
            case 6:
                System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        sc.close();
    }
		
		
}
