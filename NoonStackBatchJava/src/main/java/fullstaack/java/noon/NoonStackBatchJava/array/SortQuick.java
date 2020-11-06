package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Arrays;

/*
 * pivotal point:beginning,end,middle,random
 * 
 * partition: start,end-1
 * piData=end
 * initial=start-1
 * loop: start length
 * initial>piData: swap start and end
 * END LOOP
 * swap: piData and initial+1
 * 
 * pi=initial+1
 * 
 * recursive: a. start,pi-1
 * 				b. pi+1,end
 * 
 * 
 * 
 * 
 */

public class SortQuick 
{
	public static int separate(int[] yet,int beg,int last)
	{
		int pivotal=yet[last];
		int initial=beg-1;
		for(int cur=beg;cur<last;cur++)
		{
			if(yet[cur]>pivotal)
			{
				initial++;
				int temp=yet[initial];
				yet[initial]=yet[cur];
				yet[cur]=temp;
			}
		}
		int temp=yet[initial+1];
		yet[initial+1]=yet[last];
		yet[last]=temp;
		
		return initial+1;
	}
	public static void order(int[] get,int start,int end)
	{
		if(start<end)
		{
			int pyPoint=separate(get, start, end);
			System.out.println(pyPoint);
			order(get, start, pyPoint-1);
			order(get, pyPoint+1, end);
		}
	}
	public static void main(String[] args) 
	{
		int[] points= {432,412,390,620};//760,110,40,700};
		order(points,0,points.length-1);
		System.out.println(Arrays.toString(points));
	}
}
