//o Write a program to find the maximum of three numbers using a method. 

package CoreJava;

public class Lab11 
{
	static int findmax(int a, int b, int c)
	{
		int max = a; // assume a is largest
		
		if(b > max) // if b is greater than max , then b is largest
		{
			max =b ;
		}
		if(c > max) //if c is greater than max , then c is largest
		{
			max = c;
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int n1 = 5, n2=10 , n3=8; // assign values for numbers 
		int max = findmax(n1,n2,n3);
		
		System.out.println("Maximum number is :" +max);
		
	}

}
