package fullstaack.java.noon.NoonStackBatchJava.handle;

import java.util.Scanner;

public class FuelConsumption 
{
	static int liters, kms;
	static Scanner scan=new Scanner(System.in);
	public static void milage()
	{
		try
		{
			System.out.println("Enter the liters filled: ");
			liters=scan.nextInt();
			System.out.println("Enter kms driven: ");
			kms=scan.nextInt();
			System.out.printf("Milage: %.3f",(double)(liters/kms));
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae+"\nForwarded");
			throw ae;
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			FuelConsumption.milage();
		}
		catch(ArithmeticException a)
		{
			System.out.println(a+"\nHandled in main");
			System.out.println("Enter the liters filled: ");
			liters=scan.nextInt();
			System.out.println("Enter kms driven: ");
			kms=scan.nextInt();
			System.out.printf("Milage: %.3f",(double)(liters/kms));
		}
	}
}
