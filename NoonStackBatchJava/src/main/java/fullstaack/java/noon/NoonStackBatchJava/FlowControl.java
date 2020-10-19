package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class FlowControl 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);int net=0;
		System.out.println("Tell us number of hours worked in a day: ");
		int hours=scan.nextInt();
		if(hours>0)
		{
			hours*=365;
			System.out.println("Total hours worked in a year: "+hours);
			net=hours*100;
			System.out.println("Total net amount will get in a year: "+net+" for hours of "+hours);
		}
		else {System.out.println("Invalid Hours");}
	}
}
