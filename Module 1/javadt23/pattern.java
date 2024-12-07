package javadt23;

public class pattern 
{
	public static void main(String[] args)
	{
		int i,j,r=5;
		char alpha='A';
		
		 for ( i = 1; i <= r; i++)
		 {
	            for (j = 1; j <= i; j++) 
	            {
	                System.out.print(alpha + " ");
	                alpha++;
	            }
	            System.out.println();
		 }
	
		
	}	

}
