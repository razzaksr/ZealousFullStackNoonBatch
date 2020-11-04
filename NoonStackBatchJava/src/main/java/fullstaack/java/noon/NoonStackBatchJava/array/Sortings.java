package fullstaack.java.noon.NoonStackBatchJava.array;

/*
 * Sortings:
 * Bubble, selection, insertion
 * Merge,heap,quick
 */

public class Sortings 
{
	public static void main(String[] args) 
	{
		int[] points= {760,432,412,390,620,110,40,700};
		// bubble sort
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
		}
		System.out.println("Listing all after bubble sort: ");
		for(int tmp:points)
		{
			System.out.print(tmp+" ");
		}
	}
}
