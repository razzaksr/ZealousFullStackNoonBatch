package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Swapping 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us laptop cost of Riyaz: ");
		int riyaz=scan.nextInt();
		System.out.println("Tell us laptop cost of Arunachalam: ");
		int arun=scan.nextInt();
		System.out.println("price of Riyaz: "+riyaz+" Price of Arun: "+arun);
		riyaz=riyaz+arun;// riyaz*=arun;
		arun=riyaz-arun;// arun=riyaz/arun;
		riyaz-=arun;// riyaz/=arun
		System.out.println("price of Riyaz: "+riyaz+" Price of Arun: "+arun);
		
		
	}
}
