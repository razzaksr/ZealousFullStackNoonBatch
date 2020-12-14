package fullstaack.java.noon.NoonStackBatchJava.handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int fuel=0,kms=0;
		try
		{
			System.out.println("Tell us Fuel Filled: ");
			fuel=scan.nextInt();
			System.out.println("Tell us kms travelled: ");
			kms=scan.nextInt();
			System.out.printf("Milage: %.3f",(double)(fuel/kms));
		}
		catch(InputMismatchException ins)
		{
			Scanner scans=new Scanner(System.in);
			System.out.println(ins+"\nEnter only numeric format");
			System.out.println("Tell us Fuel Filled: ");
			fuel=scans.nextInt();
			try
			{
				System.out.println("Tell us kms travelled: ");
				kms=scans.nextInt();
				System.out.printf("Milage: %.3f",(double)(fuel/kms));
			}
			catch(ArithmeticException a)
			{
				System.out.println(a+"\nKMS shouldn't be 0");
				System.out.println("Tell us Fuel Filled: ");
				fuel=scans.nextInt();
				System.out.println("Enter kms driven: ");
				kms=scans.nextInt();
				System.out.printf("Milage: %.3f",(double)fuel/kms);
			}
		}
		catch(ArithmeticException a)
		{
			System.out.println(a+"\nHandled in main");
			System.out.println("Tell us Fuel Filled: ");
			fuel=scan.nextInt();
			System.out.println("Enter kms driven: ");
			kms=scan.nextInt();
			System.out.printf("Milage: %.3f",(double)fuel/kms);
		}
		catch(Exception exe)
		{
			System.out.println(exe);
		}
		finally
		{
			System.out.println("\n"+fuel+" "+kms);
		}
	}
}
