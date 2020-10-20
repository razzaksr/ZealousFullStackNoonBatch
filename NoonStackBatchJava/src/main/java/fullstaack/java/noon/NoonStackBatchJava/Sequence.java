package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Sequence 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us the number which you want tables: ");
		int num=scan.nextInt();//5 
		System.out.println("Tell us the start range: ");
		int start=scan.nextInt();//1
		System.out.println("Tell us the end range: ");
		int end=scan.nextInt();//30
		do
		{
			System.out.println(start+"*"+num+"="+(start*num));
			start++;
		}while(start<=end);
	}
}
