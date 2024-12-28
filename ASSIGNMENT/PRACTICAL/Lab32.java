//o Create a custom exception class and use it in your program. 

package CoreJava;

import java.util.Scanner;

class InsufficientFundException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public InsufficientFundException(String message) {
        super(message);
    }
}

public class Lab32 
{
	double balance;
    double withdrawallimit = 1000;

	public Lab32(double balance, double withdrawallimit)
	{
		this.balance = balance;
		this.withdrawallimit = withdrawallimit;
	}
	
	public void withdrawlimit(double amount) throws InsufficientFundException
	{
		if(amount > balance)
		{
			throw new InsufficientFundException("Insufficient Fund in your account...");
		}
		balance -= amount;
		System.out.println("withdrawal succesfull .. remaining balance " + balance);
	}
	
	
	public static void main(String[] args) throws InsufficientFundException
	{
		Lab32 lb = new Lab32(1000,1000);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount you want to withdraw :  ");
		double withdraw = sc.nextDouble();
		lb.withdrawlimit(withdraw);
		sc.close();
	}
}


