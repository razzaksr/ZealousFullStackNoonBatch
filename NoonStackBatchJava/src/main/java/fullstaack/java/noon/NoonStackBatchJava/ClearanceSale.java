package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class ClearanceSale 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us Cooler name: ");
		String coolerName=scan.nextLine();
		System.out.println("Tell us Cooler Price: ");
		int price=scan.nextInt();
		System.out.println("Tell us Cooler Stock: ");
		int stock=scan.nextInt();
		int items=0, sum=0;
		for(int day=1;day<=4&&stock>0;day++)
		{
			System.out.println("Tell us items Sold in "+day);
			items=scan.nextInt();
			stock-=items;
			sum+=(items*price);
			price-=(price*0.07);
		}
		System.out.println(coolerName+"\n"+price+"\n"+sum);
	}
}
