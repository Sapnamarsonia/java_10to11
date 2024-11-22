package javadt20;

public class conditionEX2 
{ 	public static void main(String[] args)
	{
		int marks = 68; // variable declaration
		
		if(marks >= 70)    // 1st condition 
		{
			System.out.println("A Grade");
		}
		else if(marks >= 60)   // 2nd condition
		{
			System.out.println("B Grade");
		}
		else if(marks >= 50)   // 3rd condition
		{
			System.out.println("C Grade");
		}
		else if(marks >= 40)   // 4th condition 
		{
			System.out.println("D Grade");
		}
		else    // if all condition are false then the result will fail
		{
			System.out.println("FAIL");
		}
	}

}
