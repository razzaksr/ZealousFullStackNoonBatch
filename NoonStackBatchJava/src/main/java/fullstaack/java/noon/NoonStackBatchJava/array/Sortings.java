package fullstaack.java.noon.NoonStackBatchJava.array;

/*
 * Sortings:
 * Bubble, selection::
 * 
 * 0 >> 1,2,3,4,5,6,7
 * 1 >> 2,3,4,5,6,7
 * 2 >> 3,4,5,6,7
 * 3 >> 4,5,6,7
 * 4 >> 5,6,7
 * 5 >> 6,7
 * 6 >> 7
 *  insertion
 * Merge,heap,quick
 */

public class Sortings 
{
	public static void main(String[] args) 
	{
		int[] points= {432,412,390,620,760,110,40,700};
		/*// selection sort
		int third=0;
		for(int selInd=0;selInd<points.length;selInd++)
		{
			//System.out.println("Selected index: "+points[seltInd]);
			for(int comInd=selInd+1;comInd<points.length;comInd++)
			{
				if(points[selInd]<points[comInd])
				{
					third=points[selInd];points[selInd]=points[comInd];
					points[comInd]=third;
				}
				//System.out.println("comparison "+points[comInd]);
			
		}*/
		// insertion sort
		for(int hold=1;hold<points.length;hold++)
		{
			for(int com=hold;com>0&&points[com-1]<points[com];com--)
			{
				/*if(points[com-1]>points[com])
				{
					*/
				points[com-1]*=points[com];
				points[com]=points[com-1]/points[com];
				points[com-1]/=points[com];
				//}
			}
		}
		System.out.println("Listing all after bubble sort: ");
		for(int tmp:points)
		{
			System.out.print(tmp+" ");
		}
		/*// bubble sort
		for(int freq=0;freq<points.length-1;freq++)
		{
			for(int cur=0;cur<points.length-freq-1;cur++)
			{
				if(points[cur]<points[cur+1])
				{
					points[cur]^=points[cur+1];
					points[cur+1]^=points[cur];
					points[cur]^=points[cur+1];
				}
			}
		}*/
	}
}
