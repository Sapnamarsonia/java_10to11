package javadt23;

public class ParametrizedConstEX 
{
	int id;
	String name;
	
	ParametrizedConstEX(int id,String name)
	{
		this.id = id;
		this.name = name;
		
	}
	public static void main(String[] args)
	{
		ParametrizedConstEX pr1 = new ParametrizedConstEX(101,"Abc");
		ParametrizedConstEX pr2 = new ParametrizedConstEX(102,"Xyz");
		
		System.out.println(pr1.id+" "+pr1.name);
		System.out.println(pr2.id+" "+pr2.name);
	}

}
