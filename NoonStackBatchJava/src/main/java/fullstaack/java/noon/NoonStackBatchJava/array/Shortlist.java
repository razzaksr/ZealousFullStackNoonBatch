package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Scanner;

public class Shortlist 
{
	public static void main(String[] args) 
	{
		int[] points= {760,432,412,390,620,110,40,700};
		int position=-1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us your point wish to get position(s) of it: ");
		int data=scan.nextInt();
		/*for(int index=0;index<points.length;index++)
		{
			if(data==points[index])
			{
				position=index+1;break;
			}
		}
		if(position!=-1)
			System.out.println("User given data "+data+" is located in "+position);
		else
			System.out.println("User given data "+data+" not present");*/
		System.out.println("Following are the positions matched with user given: "+data);
		for(int index=0;index<points.length;index++)
		{
			if(data<=points[index])
			{
				position=index+1;
				System.out.println(points[index]+" found @ "+position);
			}
		}
		
	}
}
