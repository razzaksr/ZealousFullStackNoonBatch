package fullstaack.java.noon.NoonStackBatchJava.thread;

import java.util.Random;
import java.util.Scanner;

public class MultipleResource 
{
	public static void main(String[] args) 
	{
		Shopping shop=new Shopping();
		Theatre the=new Theatre();
		Thread t1=new Thread(shop,"Riyaz");
		Thread t2=new Thread(the,"Mohamed");
		Thread t3=new Thread(the,"Sabari");
		Thread t4=new Thread(shop,"Aravind");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Shopping implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" Welcome to Grand Opening Sale");
		Random rand=new Random();
		if(rand.nextInt(1000)%2!=0)
			System.out.println(Thread.currentThread().getName()+" eligible for 10 percent discount for the bill");
		else
			System.out.println(Thread.currentThread().getName()+" has to pay full amount for the cloths bill");
	}	
}
class Theatre implements Runnable
{
	Scanner scan=new Scanner(System.in);
	public int amt,seats,calc;
	@Override
	public void run() 
	{
		System.out.println("Welcome to ARRS Multplex "+Thread.currentThread().getName());
		synchronized (scan) 
		{
			System.out.println("Tell us how many tickets needed: "+
					Thread.currentThread().getName());
						seats=scan.nextInt();
						int calc=seats*190;
						System.out.println("Tell us amount to pay: ");
						amt=scan.nextInt();
						if(amt>=calc)
							System.out.println(seats+" are booked by "+
						Thread.currentThread().getName());
						else
							System.out.println("Insufficient amount");
		}
	}	
}