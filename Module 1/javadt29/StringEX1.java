package javadt29;

public class StringEX1 
{
	public static void main(String[] args)
	{
		String s1 = "java"; // literal string
		
		String s2 = new String("java"); // object string
		
		char ch[]= {'j','a','v','a'}; // char array string
		String s3=new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
