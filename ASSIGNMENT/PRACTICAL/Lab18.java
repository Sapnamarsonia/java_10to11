//o Demonstrate constructor overloading by passing different types of parameters. 

package CoreJava;

public class Lab18 
{
	int id,Dob;
	String name,course,college;    /// varaibale declared
	
	Lab18(int id, String name )   // constructor 1 with two parameter
	{
		this.id= id;
		this.name= name;
	}
	Lab18(int dob,String course , String college) //constructor 2 with three parameter
	{
		this.Dob = dob;
		this.course = course ;
		this.college = college;
		
	}
	public static void main(String[] args)
	{
		Lab18 lb = new Lab18(101, " Sapna");   //object created for constructor
		Lab18 lb1 = new Lab18(05/01, "Java", "Tops");

		
		System.out.println("ID :"+ lb.id + "\nName : "+lb.name + "\nDob : "+lb1.Dob + "\nCourse :"+lb1.course+"\nCollege :"+lb1.college);
		
	}

}
