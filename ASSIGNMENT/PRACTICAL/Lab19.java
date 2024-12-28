//o Write a program to perform matrix addition and subtraction using 2D arrays. 

package CoreJava;

import java.util.Scanner;

public class Lab19 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// input user for number of rows and column
		System.out.println("Enter number of column");
		int column = sc.nextInt();
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		
		// array for matrix 
		int[][] Matrix1 = new int [rows][column];
		int[][] Matrix2 = new int [rows][column];
		int[][] SumMatrix = new int [rows][column];

		
		//for matrix1 get values
        System.out.println("Enter the elements of the Matrix1: ");

		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
				Matrix1[i][j] = sc.nextInt();
				
			}
			System.out.println();
		}
		
		//for matrix2 get values
        System.out.println("Enter the elements of the Matrix2: ");

		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
				Matrix2[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		// Addition of matrix 
		 System.out.println("Sum of matrix is : ");
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < column; j++) 
	            {
	                System.out.print((SumMatrix[i][j]= Matrix1[i][j]+ Matrix2[i][j])+" ");
	            }
	            System.out.println();
	        }
	        
	        //subtraction of matrix
			 System.out.println("Subtraction of matrix is : ");
		        for (int i = 0; i < rows; i++)
		        {
		            for (int j = 0; j < column; j++) 
		            {
		                System.out.print((SumMatrix[i][j]= Matrix1[i][j]- Matrix2[i][j])+" ");
		            }
		            System.out.println();
		        }
		sc.close();
	}

}
