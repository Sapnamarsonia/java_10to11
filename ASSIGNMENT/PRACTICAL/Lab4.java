//Demonstrate type casting (explicit and implicit). 

package CoreJava;

public class Lab4 
{
	public static void main(String[] args) {
		
		//explicit typecasting ( narrowing)
		double double1 = 7.89;
		int int1 = (int)double1; // manually typecasting will be done from double to int 
		System.out.println(double1);
		System.out.println(int1);
		
		
		
		
		//implicit typecasting ( widening)
		int int2 = 9;
		double double2 = int2; // automatic casting to int to double 
		 System.out.println(int2);
		System.out.println(double2);
		
	}

}
