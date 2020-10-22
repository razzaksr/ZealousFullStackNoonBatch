package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Sums 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);int sum=0;
		System.out.println("Tell us NUMBER which you want sum of its series: ");
		int number=scan.nextInt();//5
		for(int times=1;times<=10;times++)
		{
			sum+=number*times;
		}
		System.out.println(sum+" is the sum of the series of "+number);
	}
}