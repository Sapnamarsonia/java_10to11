//o Create an abstract class and implement its methods in a subclass. 

package CoreJava;


abstract class language
{
	public abstract void java();
	
}
class javalanguage extends language
{
	public void java()
	{
		System.out.println("Java is a programing language.");
		
	}
}

public class Lab24
{
	public static void main(String[] args)
	{
		javalanguage jv = new javalanguage();
		jv.java();
		
	}

}
