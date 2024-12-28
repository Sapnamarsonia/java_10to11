//o Write a program demonstrating single inheritance. 

package CoreJava;
class car // parent class
{
	String brand;
	void method1() // method 1 
	{
		System.out.println("This is TOYOTO Car.");
	}
	
}
class color extends car //child class extends to parents class
{
	String color;
	void method2() // method 2 
	{
		System.out.println("Car is of black color.");
	}
}
public class Lab14 
{
	public static void main(String[] args) 
	{
		color c = new color(); // object is of child class
		c.method1();             // method called 
		c.method2();
		
	}

}
