package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Series 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Readymade shop recruitment");
		int persons=1,age;
		while(persons<=5)
		{
			System.out.println("Tell us age: ");
			age=scan.nextInt();
			if(age>=14)
			{
				System.out.println("You are recruited @ "+persons);
				persons++;
			}
			else
			{
				System.out.println("Get education");
			}
			//persons++;
		}
	}
}
