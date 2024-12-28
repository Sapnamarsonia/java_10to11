//o Implement a simple class with getters and setters for encapsulation. 

package CoreJava;
class info // create a simple class gor getter setter 
{
	String name,surname; // variable declared
	public String getname() //getter method for name
	{
		return name;
	}
	public void setname(String name) //setter method for name
	{
		this.name= name;
	}
	public String getsurname()    ////getter method for surname
	{
		return surname;
	}
	public void setsurname(String surname) //setter method for surname
	{
		this.surname = surname;
	}
}

public class Lab10 
{
	public static void main(String[] args)
	{
		info i = new info(); // use of class and its object to get the values 
		i.setname("sapna");
		i.setsurname("marsonia");
		
		System.out.println("Name: " + i.getname() + " \nSurname : " + i.getsurname());
	}

}
