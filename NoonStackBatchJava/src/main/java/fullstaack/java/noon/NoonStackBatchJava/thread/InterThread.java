package fullstaack.java.noon.NoonStackBatchJava.thread;

import java.util.Random;
import java.util.Scanner;

public class InterThread 
{
	public static void main(String[] args) 
	{
		Theatres the=new Theatres();
		Shoppings shop=new Shoppings(the);
		Thread t1=new Thread(shop,"Riyaz");
		Thread t2=new Thread(the,"Mohamed");
		t1.start();t2.start();
	}
}
class Shoppings implements Runnable
{
	public Shoppings() {}
	Theatres obj;
	public Shoppings(Theatres temp) 
	{
		obj=temp;
	}
	@Override
	public void run() 
	{
		synchronized (obj.scan) 
		{
			System.out.println(Thread.currentThread().getName()+" is going check for help");
			if(obj.amt<obj.calc)
			{
				int t=obj.calc-obj.amt;
				System.out.println(t+" amount will be given by "+Thread.currentThread().getName()+" as help");
				obj.scan.notify();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Welcome to Grand Opening Sale");
		Random rand=new Random();
		if(rand.nextInt(1000)%2!=0)
			System.out.println(Thread.currentThread().getName()+" eligible for 10 percent discount for the bill");
		else
			System.out.println(Thread.currentThread().getName()+" has to pay full amount for the cloths bill");
	}	
}
class Theatres implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int amt,seats,calc;
	@Override
	public void run() 
	{
		synchronized (scan) 
		{
			System.out.println("Tell us how many tickets needed: "+
					Thread.currentThread().getName());
						seats=scan.nextInt();
						calc=seats*190;
						System.out.println("Tell us amount to pay: ");
						amt=scan.nextInt();
						if(amt<calc)
						{
							System.out.println("Insufficient amount");
							try {
								scan.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println(seats+" are booked by "+
								Thread.currentThread().getName());
		}
	}	
}