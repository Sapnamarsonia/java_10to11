//o Write a program that demonstrates inheritance using extends keyword. 

package CoreJava;

class country   // class country is taken 
{
	void a()
	{
		System.out.println("India is my country.");
	}
}
class state extends country // class is extends to another class 
{
	void b()
	{
		System.out.println("I live in Gujarat state.");
		
	}
}
class city extends state //class is extends to another class 
{
	void c()
	{
		System.out.println("Rajkot is known as Rangilu city");
	}
}

public class Lab22 
{
	public static void main(String[] args) 
	{
	  city c = new city(); // object of class c is taken 
	  // method called 
	  c.a();
	  c.b();
	  c.c();
		
	}

}
