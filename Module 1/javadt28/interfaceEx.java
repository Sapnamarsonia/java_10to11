package javadt28;

class MyColor
{
	String color="black";
	
}
class MyColor2 extends MyColor{

	String color="white";	
	void getdisplay()
	{
		
		System.out.println(color);
		System.out.println(super.color);
	}
	
}

public class interfaceEx extends MyColor2 
{
	public static void main(String[] args) 
	{
		MyColor2 c = new MyColor2();
		c.getdisplay();
		
		
		
	}

}
