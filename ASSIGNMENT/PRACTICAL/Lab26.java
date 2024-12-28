//o Write a program that implements multiple interfaces in a single class. 
package CoreJava;

interface A // first interface 
{
	void Id();
}
interface B // secxond interface 
{
	void Name();
	
}
class C implements A,B  // clas  c is implemented toninterface A and B
{
	public void Id() 
	{
		System.out.println("Id = 101");
	}
	public void Name()
	{
		System.out.println("Name = Sachin Tendulkar");
	}
}
public class Lab26 
{
	public static void main(String[] args) 
	{
		C c = new C(); // objecvt craeted of class 
		c.Id();
		c.Name();
		
	}

}
