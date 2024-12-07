package javadt23;


public class counterEX 
{
static int count = 1;
	
	
	public counterEX()
	{
		// count++;    // increase the number before printing
		System.out.println(count);
		
		count++;   // increase the number after printing 
	}
	public static void main(String[] args) 
	{
		counterEX c1 =new counterEX();
		counterEX c2 = new counterEX();
		counterEX c3 = new counterEX();
	}

}
