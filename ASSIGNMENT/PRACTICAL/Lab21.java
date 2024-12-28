//o Implement string comparison using equals() and compareTo() methods. 

package CoreJava;

public class Lab21
{
	public static void main(String[] args)
	{
		// varaible declared  , taking diffrent string
		String s1 = "tops";   
		String s2 = "TOPS";
		String s3 = "technologies";
		String s4 = "technologies";
		
		System.out.println(s1.equalsIgnoreCase(s2));  //  comparision of s1 and s2 ignoring case
		
		System.out.println(s1.equalsIgnoreCase(s3));   
		
		System.out.println(s1.equals(s2)); // comparing s1 and s2 with case sensitive


		System.out.println(s2.compareTo(s4));  

		System.out.println(s3.compareTo(s4));
	}

}
