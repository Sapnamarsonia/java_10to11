//create a program which call the method using super keyword
package javadt28;
class stationery
{
	void display()
	{
		System.out.println("There is black pen");
	}
	
}
class school extends stationery 
{
	void display()
	{
		System.out.println("Teacher uses black pen ");
		
	}
	void data()
	{
		display();
		super.display();
	}
}

public class taskEx extends school
{
	public static void main(String[] args) 
	{
		school sc = new school();
		sc.data();
		
	}

}
