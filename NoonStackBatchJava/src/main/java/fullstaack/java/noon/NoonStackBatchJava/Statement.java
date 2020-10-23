package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Statement 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double balance=0.0;int debCount=0,creCount=0;
		for(int state=1;state<=10;state++)
		{
			System.out.println("Tell us Balance now: ");
			double temp=scan.nextDouble();
			if(temp>balance)
			{
				creCount++;
			}
			if(temp<balance)
			{
				debCount++;
			}
			balance=temp;
		}
		System.out.println("No of credits: "+creCount);
		System.out.println("No of debits: "+debCount);
		int charges=0;
		if(debCount>5)
		{
			charges=debCount-5;
			charges*=20;
		}
		System.out.println("Charges for additional debits: "+charges);
		balance-=charges;
		System.out.println("Your current balance: "+balance);
	}
}
