//Create a class Student with attributes (name, age) and a method to display the details. 
package CoreJava;

class student
{
	String name;  // variable declared
	int age;
	student(String name,int age) // constructor of class 
	{
		this.name= name; // this keyword for refrence 
		this.age= age;
	}
	void display() // display method 
	{
		System.out.println("Name:" +name );
		System.out.println("Age:" + age);
	}
	 
}
public class Lab8 
{
	public static void main(String[] args) 
	{
		student st = new student("sapna",29); //object of class

		st.display(); // method called
		
		
	}

}
