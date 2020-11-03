package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Scanner;

public class Group 
{
	public static void main(String[] args) 
	{
		int[] exp= {1200,7800,4000,500};
		System.out.println(exp.length);
		for(int pos=0;pos<exp.length;pos++)
		{
			System.out.println(exp[pos]);
		}
		
		Scanner scan=new Scanner(System.in);
		
		String[] who=new String[3];
		for(int index=0;index<10;index++)
		{
			who[index]=scan.nextLine();
			System.out.println("Welcome "+who[index]+" to our team");
		}
	}
}
