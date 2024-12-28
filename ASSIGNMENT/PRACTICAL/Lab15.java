//o Create a class hierarchy and demonstrate multilevel inheritance. 
package CoreJava;

class Alphabets // parent class 
{
	void Alpha()
	{
		System.out.println("There are 26 Alphabets in English.");
	}
}
class consonants extends Alphabets // child class 1
{
	void conso()
	{
		System.out.println("There are 21 Consonant in English.");
	}
}
class vowels extends consonants // child classs 2 
{
	void vow()
	{
		System.out.println("There are 5 Vowel in English.");
	}
}
public class Lab15 
{
	public static void main(String[] args) 
	{
		vowels v = new vowels(); // object created of sub class 2
		v.Alpha();
		v.conso();
		v.vow();

		
	}

}
