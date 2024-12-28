//o Implement runtime polymorphism by overriding methods in the child class. 

package CoreJava;
//parent class 
class fruit
{
	void property()
	{
		System.out.println("Mango is a king of fruit.");
	}
}
//child class 
class mango extends fruit
{
	void property()
	{
		System.out.println("Mango is a yellow in colour.");
	}
	
}
public class Lab23 
{
	public static void main(String[] args) 
	{
		fruit myfruit = new fruit();  //fruit refrence and obj
		fruit mymango = new mango();   // fruit ref and mango obj
		
		myfruit.property();    
		mymango.property();
		
		
	}

}
