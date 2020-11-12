package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Arrays;

public class JagSearch 
{
	public static void match(double[][] yet,double desired)
	{
		for(int ind=0;ind<yet.length;ind++)
		{
			for(int col=0;col<yet[ind].length;col++)
			{
				if(yet[ind][col]==desired)
				{
					System.out.println("Matched @row"+ ind +" @column"+col);
				}
			}
		}
	}
	public static void traverse(double[][] get)
	{
		for(double[] day:get)
		{
			for(double salary:day)
			{
				System.out.print(salary+" ");
			}
			System.out.println();
		}
	}
	public static String binSearch(double[][] get, int row, int start,int end,double element)
	{
		if(Arrays.toString(get[row]).contains(""+element))
		{
		int mid=(start+end)/2;
		if(element==get[row][mid])
			return element+" found row of "+row+", column of "+mid;
		else if(element>get[row][mid])
			return binSearch(get, row, mid+1, end, element);
		else if(element<get[row][mid])
			return binSearch(get, row, start, mid, element);
		return "";
		}
		else
			return element+" not found anywhere in "+row;
	}
	public static void main(String[] args) 
	{
		double[][] ctc=new double[3][];
		ctc[0]=new double[] {4.5,2.8,1.9,2.2};
		ctc[1]=new double[] {1.9,4.5,3.5,7.8,2.9,4.7,3.2,0.50};
		ctc[2]=new double[] {3.4,2.8};
		JagSearch.traverse(ctc);
		JagSearch.match(ctc, 1.9);
		for(int day=0;day<ctc.length;day++)
		{
			System.out.println(JagSearch.binSearch(ctc, day, 0, ctc[day].length-1, 2.8));
		}
	}
}
