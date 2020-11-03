package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Scanner;

public class Reading 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);int user=0, start=0,end=0;
		int[] points= {760,432,412,390,620,110,40,700};
		/*System.out.println("Tell us position you wish to read: ");
		user=scan.nextInt();
		System.out.println(points[user-1]+" is data available by user given "+user);*/
		System.out.println("Tell us start and end range: ");
		start=scan.nextInt();
		end=scan.nextInt();
		System.out.println("Points within range of "+start+" and  "+end);
		for(;start<end;start++)
		{
			System.out.println(points[start]);
		}
	}
}
