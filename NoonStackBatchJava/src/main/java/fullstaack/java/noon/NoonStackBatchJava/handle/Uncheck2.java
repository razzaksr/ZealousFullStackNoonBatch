package fullstaack.java.noon.NoonStackBatchJava.handle;

import java.util.Scanner;

public class Uncheck2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double amt=0.0;float in=0.0F;int years=0;
		try
		{
			amt=Double.parseDouble(args[0]);//80000
			in=Float.parseFloat(args[1]);// 10
			years=Integer.parseInt(args[2]);//3
			double total=0.0, emi=0.0;
			total=(amt*in)/100;
			total*=years;
			total+=amt;
			emi=total/(years*12);
			System.out.printf("%f\t%.2f\t%.2f",amt,emi,total);
		}
		catch(NumberFormatException num)
		{
			System.out.println(num+"\nExpect only numbers");
			amt=scan.nextDouble();
			in=scan.nextFloat();
			years=scan.nextInt();
			double total=0.0, emi=0.0;
			total=(amt*in)/100;
			total*=years;
			total+=amt;
			emi=total/(years*12);
			System.out.printf("%f\t%.2f\t%.2f",amt,emi,total);
		}
	}
}
