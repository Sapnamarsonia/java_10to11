package javadt13dec;

enum student
{
	sapna(29), hasti(26), sweta(25), rashmi(27);
	private  int age;
	int getage() {
		return age;
	}
	private student(int age) {
		this.age = age; 
	}
	
}

public class enumEX 
{
	public static void main(String[] args) 
	{
		System.out.println("Age of Sapna is "+student.sapna.getage()+ " years");
		System.out.println("Age of Hasti is "+student.hasti.getage()+ " years");
		System.out.println("Age of Sweta is "+student.sweta.getage()+ " years");
		System.out.println("Age of Rashmi is "+student.rashmi.getage()+ " years");
		
	}

}
