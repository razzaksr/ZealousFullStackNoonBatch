package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class NestedSeries 
{
	public static void main(String[] args) 
	{
		Scanner sca=new Scanner(System.in);
		System.out.println("Tell us FROM number: ");
		int start=sca.nextInt();
		System.out.println("Tell us END number: ");
		int end=sca.nextInt();
		for(;start<=end;start++)
		{
			for(int times=1;times<=10;times++)
			{
				System.out.println(start+"*"+times+"="+(start*times));
			}
			System.out.println("\n");
		}
	}
}
