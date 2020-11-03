package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Scanner;

/*
 * for(type temp:source)
 * {
 * temp
 * }
 * 
 * cheap
 * MAX: 100000000>> 500
 * 
 * 0    1    2    3   4     5
 * 1000 5000 4000 2000 3000 500 
 */

public class Minimum 
{
	public static void main(String[] args) 
	{
		double[] realme=new double[10];// 0 ..... 9
		double cheap=Double.MAX_VALUE;
		double costly=Double.MIN_VALUE;
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell the realme mobile prices: ");
		for(int index=0;index<realme.length;index++)
		{
			realme[index]=scan.nextDouble();
			if(realme[index]<cheap)
			{
				cheap=realme[index];
			}
		}
		System.out.println("Listing all prices:");
		for(double temp:realme)
		{
			System.out.println(temp);
			if(temp>costly)
			{costly=temp;}
		}
		System.out.println("Cheapest cost is: "+cheap);
		System.out.println("Costliest mobile is: "+costly);
	}
}