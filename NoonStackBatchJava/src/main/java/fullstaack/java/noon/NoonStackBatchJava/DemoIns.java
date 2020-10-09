package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class DemoIns 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String packName="";short packValue=0;
		long cusId=0L;int duration=0;
		
		System.out.println("Tell us Package name: ");
		packName=scan.nextLine();
		System.out.println("Tell us customer id: ");
		cusId=scan.nextLong();
		System.out.println("TEll us pack value: ");
		packValue=scan.nextShort();
		System.out.println("Tell us pack duration: ");
		duration=scan.nextInt();
		
		System.out.println("Congrats your package "
		+packName+" for the Customer id "+cusId
		+" has recharged with "+packValue+" for days of "+duration);
	}
}
