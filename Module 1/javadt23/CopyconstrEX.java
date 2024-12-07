package javadt23;

public class CopyconstrEX 
{
	String name;
	
	CopyconstrEX(String name)
	{
		this.name=name;
		
	}
	CopyconstrEX(CopyconstrEX c)
	{
		System.out.println("Sapna");
	}
	public static void main(String[] args)
	{
		CopyconstrEX c1 = new CopyconstrEX("Sapna");
		CopyconstrEX c2 = new CopyconstrEX(c1);
	}

}
