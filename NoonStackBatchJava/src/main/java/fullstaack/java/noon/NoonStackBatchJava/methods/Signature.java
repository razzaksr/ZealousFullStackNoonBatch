package fullstaack.java.noon.NoonStackBatchJava.methods;

import java.util.Scanner;

/*
 * Paramater: data's pass to the method
 * return: data's get from the method after calling
 * 
 * data types, Objects, array, ...
 * 
 * parameter but no return
 * parameter with return
 * no parameter no return
 * no parameter with return 
 * 
 */

public class Signature 
{
	String holder;double balance=1000.0;
	public void credit(int amt)
	{
		this.balance+=amt;
		System.out.println(amt+" deposited in the account of "+this.holder);
	}
	public void checkMin()
	{
		if(this.balance<1000)
		{
			System.out.println("Charges for not maintaining minimum balance");
			balance-=(balance*0.10);
		}
		System.out.println("Available balance is: "+balance);
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Signature sign1=new Signature();
		sign1.holder="Arunachalam";
		sign1.credit(5000000);
		Signature sign2=new Signature();sign2.balance=600.9;
		sign2.holder="Riyaz";sign2.credit(45000);
	}
}
