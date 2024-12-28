//o Write a program to create and run multiple threads using the Thread class. 

package CoreJava;

class A1 extends Thread  // class 1 extended to thread 
{
	public void run()  //
	{
		super.run();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A1: "+i);
		}
		
	}
}
class A2 extends Thread
{
	public void run()
	{
		super.run();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A2: "+i);
		}
	}
}
public class Lab34 
{
	public static void main(String[] args) 
	{
		A1 a = new A1();
		a.start();
		
		A2 b = new A2();
		b.start();
		
	}

}
