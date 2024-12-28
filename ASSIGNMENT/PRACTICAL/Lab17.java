//o Write a program to create and initialize an object using a parameterized constructor. 

package CoreJava;

public class Lab17 
{
	int id; // varaiable declared 
	String name;
	
	Lab17(int id,String name) // parameterized constructor created  
	{
		this.id= id;      // this keyword for refrence is used 
		this.name = name;
	}
	
	public static void main(String[] args)
	{
		Lab17 lb1 = new Lab17(101,"Sapna");
		Lab17 lb2 = new Lab17(102,"SAPNA");
		
		System.out.println("ID :"+ lb1.id + " NAME :" + lb1.name);
		System.out.println("ID :"+ lb2.id + " NAME :" + lb2.name);

	}

}
