//oCreate multiple constructors in a class and demonstrate constructor overloading. 

package CoreJava;

class Studentinfo
{
	int id;
	String name;
	int age;
	
	Studentinfo() // this is default constructor
	{
	System.out.println("\nThis is default constructor"); ;
	}
	
	Studentinfo(int id,String name, int age) // this is parameterized constructor
	{
		this.id= id;
		this.name= name;
		this.age= age;
		
	}
}

public class Lab9 
{
	public static void main(String[] args) 
	{
		Studentinfo st = new Studentinfo(); // object of default constructor
		System.out.println("\nid = "+ st.id + " name = " + st.name + " age = "+st.age); 
		
	    Studentinfo studinfo = new Studentinfo(101,"virat",35);
	    System.out.println("\nThis is parameterized construcor");
	    System.out.println("\nid = " + studinfo.id + " name = " + studinfo.name + " age = " + studinfo.age);
	    
		
	}

}
