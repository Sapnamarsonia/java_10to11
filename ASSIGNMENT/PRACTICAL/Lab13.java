//o Create a class with static variables and methods to demonstrate their use. 

package CoreJava;


public class Lab13
{
	int number ;   // variable declared 
	String name;
	static String category = "car";  // category is static variable
	
    public Lab13 (int number,String name)   //this is static method 
    {
		this.number= number;
		this.name=name;
		
	}
    void display() //method for display
    {
    	System.out.println(number + " " + name + " " + category );
    }
    static void change() // method for change in static variable
    {
    	category = "Toyota Car";
    }
public static void main(String[] args) 
{
	Lab13 sm1 = new Lab13(111,"Fortuner");
	Lab13 sm2 = new Lab13(999,"Innova");
	
	sm1.display();  // display the category as CAR only 
	
	change(); // change done in static variable 
	
	sm2.display(); // after change display the category car as toyoto car
	
	
	
	
	
}
}
