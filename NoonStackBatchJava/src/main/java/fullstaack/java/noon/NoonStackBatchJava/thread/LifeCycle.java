package fullstaack.java.noon.NoonStackBatchJava.thread;

import java.util.Scanner;

public class LifeCycle
{
	public static void main(String[] args) 
	{
		BusBooking bus=new BusBooking();
		Thread t1=new Thread(bus,"Mohamed");
		Thread t2=new Thread(bus,"Victor");
		Thread t3=new Thread(bus,"Maxim");
		Thread t4=new Thread(bus,"Andrews");
		t1.start();t2.start();
		t3.start();t4.start();
	}
}
class BusBooking implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int required, noOfSeats=30, collection=0, amount;
	@Override
	synchronized public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" Tell us How many tickets wants book: ");
		required=scan.nextInt();
		if(required<=noOfSeats)
		{
			int calc=required*250;
			System.out.println("Please pay amount of: "+calc);
			if(calc%100!=0)
			{
				System.out.println("Amount "+calc+" not payable as its not 100 multiples");
				Thread.currentThread().stop();
			}
			amount=scan.nextInt();
			if(amount>=calc)
			{
				int balance=amount-calc;
				if(balance>0)
					try {
						System.out.println("Please get your balance amount: "+balance);
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(required+" seats are booked");
				noOfSeats-=required;
			}
			else {System.out.println("Insufficient amount");}
		}
		else {System.out.println("Seats are full");}
	}
}