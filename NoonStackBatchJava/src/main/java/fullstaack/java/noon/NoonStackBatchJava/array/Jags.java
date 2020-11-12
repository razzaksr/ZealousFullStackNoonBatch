package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Scanner;

public class Jags 
{
	static Scanner scan=new Scanner(System.in);
	public static void adding(int[][] yet)
	{
		for(int days=0;days<yet.length;days++)
		{
			System.out.println("Tell us how many applicants info of the day: "+(days+1));
			int count=scan.nextInt();// 10
			yet[days]=new int[count];
			for(int each=0;each<yet[days].length;each++)
			{
				System.out.println("Tell us monthly income of the person: "+(each+1));
				yet[days][each]=scan.nextInt();
			}
		}
	}
	public static void traverse(int[][] get)
	{
		for(int[] day:get)
		{
			for(int salary:day)
			{
				System.out.print(salary+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int[][] ctc=new int[3][];
		Jags.adding(ctc);
		Jags.traverse(ctc);
	}
}
