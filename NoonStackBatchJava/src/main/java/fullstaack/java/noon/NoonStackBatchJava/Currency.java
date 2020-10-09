package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Currency 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us money in Doller you wish to invest in India: ");
		int doller=scan.nextInt();
		double rupees=doller*73.14;
		System.out.println("Ivestment in Ruppedd: "+rupees);
	}
}
