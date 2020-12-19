package fullstaack.java.noon.NoonStackBatchJava.thread;

import java.util.Scanner;

public class SingleTask 
{
	public static void main(String[] args) 
	{
		Teller tel=new Teller();
		Thread t1=new Thread(tel,"Arun");
		Thread t2=new Thread(tel,"Baskar");
		Thread t3=new Thread(tel,"Vinoth");
		Thread t4=new Thread(tel,"Chandan");
		Thread t5=new Thread(tel,"Sabari");
		Thread t6=new Thread(tel,"Sheik");
		Thread t7=new Thread(tel,"Senthil");
		System.out.println("First Thread id: "+t1.getId());
		t1.start();t2.start();t3.start();t4.start();t5.start();
		t6.start();t7.start();
	}
}

class Teller extends Thread
{
	Scanner scan=new Scanner(System.in);
	double bankBalance=100.9;
	public void deposit()
	{
		System.out.println("Tell us amount to deposit: ");
		int amt=scan.nextInt();
		bankBalance+=amt;
		System.out.println(amt+" deposited successfully by "+
		Thread.currentThread().getName());
	}
	public void withdraw()
	{
		System.out.println("Tell us amount to withdraw: ");
		int amt=scan.nextInt();
		if(amt<=bankBalance)
		{
			bankBalance-=amt;
			System.out.println(amt+" required has withdrawn successfully "+
					Thread.currentThread().getName());
		}
		else
		{
			System.out.println("Hold some time "+
					Thread.currentThread().getName());
		}
	}
	@Override
	synchronized public void run() 
	{
		System.out.println("Welcome "+Thread.currentThread().getName());
		System.out.println("Tell us what you want to do? ");
		String option=scan.next();
		switch(option)
		{
		case "credit":deposit();break;
		case "debit":withdraw();break;
		}
		System.out.println("Available balance after all: "+bankBalance);
	}
}