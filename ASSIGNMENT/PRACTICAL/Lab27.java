//o Create a user-defined package and import it into another program. 

package CoreJava;
import calculator.calculation; // imported class from user define pckage 

public class Lab27 
{
	public static void main(String[] args) 
	{  
	        calculation  cal = new calculation();   // object of claculation class is made from diffrent package
	        
	        //Addition
	        int result = cal.add(5, 3);  
	        System.out.println("Addition: " + result);  
	        
	        //Subtraction
	        result = cal.subtract(5, 3);  
	        System.out.println("Subtraction: " + result); 
	        
	        //Multiplication
	        result = cal.multiply(5, 3);  
	        System.out.println("Multiplication: " + result); 
	        
	        //Division
	        result = cal.divide(10, 2);  
	        System.out.println("Division: " + result);  
	  }  
		
}
