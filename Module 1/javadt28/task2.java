//[2 class one is parent one child inherit the first class and access paren's method in from child]
package javadt28;
class parent
{
	void property()
	{
		System.out.println("There is one house.");
	}
}
class child extends parent
{
	void print()
	{
		property();
	}
	
}

public class task2 extends child
{
	public static void main(String[] args) 
	{
		child c =new child();
		c.print();
		
	}

}
