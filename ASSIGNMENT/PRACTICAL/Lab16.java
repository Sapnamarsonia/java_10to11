//o Implement method overriding to show polymorphism in action. 

package CoreJava;

class grandfather // super class 
{
	public int property() //  method created for overriding concept
	{
		System.out.println("Grandfather's property");
		return 0;
	}
}
class father extends grandfather // sub class is extends to super class 
{
	public int property()  // same method name 
	{
		System.out.println("father's  property");
		return 1;
	}
}
class child extends grandfather // sub class is extends to super class 
{
	public int property() // same method name
	{
		System.out.println("Child's property");
		return 2;
	}
}

public class Lab16 
{
	public static void main(String[] args)
	{
		grandfather gd;
		gd = new father();
		System.out.println(gd.property());
		gd = new child();
		System.out.println(gd.property());
		
	}
}

