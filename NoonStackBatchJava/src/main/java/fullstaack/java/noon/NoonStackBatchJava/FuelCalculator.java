package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class FuelCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us Fuel in liters: ");
		double liter=scan.nextDouble();
		System.out.println("KMS you have driven: ");
		double kms=scan.nextDouble();
		System.out.printf("Fuel used in 100KMS is: %.2f",((liter/kms)*100));
		System.out.printf("\nFuel used in 50KMS is: %.2f",((liter/kms)*50));
		System.out.printf("\nFuel used in 1KMS is: %.2f",(liter/kms));
	}
}
