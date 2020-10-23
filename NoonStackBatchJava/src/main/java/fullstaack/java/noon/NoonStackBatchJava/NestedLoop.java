package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class NestedLoop 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		for(int bus=1;bus<=3;bus++)
		{
			System.out.println("Bus "+bus+" has arrived in the platform");
			for(int seat=1;seat<=5;)
			{
				System.out.println("Pay the ticket fare: ");
				int fare=scan.nextInt();
				if(fare>=500)
				{
					System.out.println("Your seat booked @ "+seat+" in the bus "+bus);
					seat++;
				}
				else
				{
					System.out.println("Can't travel in this bus");
				}
			}
		}
	}
}
