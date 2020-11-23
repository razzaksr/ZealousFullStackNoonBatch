package fullstaack.java.noon.NoonStackBatchJava.oop;

import java.util.Arrays;

public class OverloadingFun 
{
	double[] yet= {1.3,8.9,4.5,90.5,78.3,12.7,4.56,6.8};
	public void search(double element)// linear through the array
	{
		System.out.println("Linear all");
		for(int index=0;index<yet.length;index++)
		{
			if(element==yet[index])
			{
				System.out.println(element+" matched @ "+(index+1));
			}
		}
	}
	public void search(double element,int start,int end)// linear search between ranges
	{
		System.out.println("Linear between "+start+" and  "+end);
		for(int index=start;index<end;index++)
		{
			if(element==yet[index])
			{
				System.out.println(element+" matched @ "+index);
			}
		}
	}
	public int search(int start,int end,double element)
	{
		int mid=(start+end)/2;
		if(element==yet[mid])
			return mid;
		else if(element>yet[mid])
			return search(mid+1,yet.length-1,element);
		else if(element<yet[mid])
			return search(0,mid,element);
		else
			return -1;
	}
	public static void main(String[] args) 
	{
		OverloadingFun fun=new OverloadingFun();
		fun.search(4.56);
		fun.search(78.3, 1, 8);
		Arrays.sort(fun.yet);
		System.out.println(fun.search(0, fun.yet.length, 12.7));
	}
}