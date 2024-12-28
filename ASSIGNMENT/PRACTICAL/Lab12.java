//o Implement method overloading by creating methods for different data types. 

package CoreJava;

public class Lab12 
{ 
	// two method with same name and same number of paramter but diffrent type of datatype is called method overloading
	static int calculation(int a,int b) // method with int datatype
	{
		return a+b;
	}
	static double calculation(double a, double b)// method with double datatype
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(calculation(10,4));       
		System.out.println(calculation(10.10,4.4));
		
		
	}

}
