package javadt28;
interface v
{
	void vovel();
}
interface c
{
	void consonant();
}

public class multipleinheritanceEX implements v,c
{

	@Override
	public void consonant() {
		System.out.println("All consonant");
	}

	@Override
	public void vovel() {
		System.out.println("All vovel");
		
	}
	public static void main(String[] args) 
	{
		multipleinheritanceEX m= new multipleinheritanceEX();
		m.consonant();
		m.vovel();
		
	}

}
