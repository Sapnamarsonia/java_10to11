//o Use the super keyword to call the parent class constructor and methods. 

package CoreJava;

//parent class
class shape
{
	void property() // create method
	{
		System.out.println("Traingle is a shape.");
	}
}

// child class
class traingle extends shape
{
	void property() // create method
	{
		System.out.println("Traingle has 3 sides.");
	}
	void display() // create method  for display data using super keyword 
	{
		super.property();
		property();

	}
}
public class Lab25 
{
	public static void main(String[] args) 
	{
		traingle tr = new traingle(); // objewct create for child class 
		tr.display();
	}
}
