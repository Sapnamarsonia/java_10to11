package javadt25;

public class staticmethod 
{
	int id;
	String name;
	static String college = "Atmiya";
	
	public staticmethod(int id,String name)
	{
		this.id=id; // 'this' is a keyword used here 
		this.name=name;
	}

	
	void display()
	{
		System.out.println(id +" "+name+" "+college);
	}
	static void change()
	{
		college ="Marvadi";
	}
	
	public static void main(String[] args) 
	{
		staticmethod s1 = new staticmethod(101,"a");
		staticmethod s2 = new staticmethod(102,"b");
		
		change(); // here it will change the college
		
		s1.display();
		s2.display();
		
		//change(); // after display it will not change
	}
}
