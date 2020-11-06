package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Arrays;

public class Travel 
{
	public void mirror(int yet)
	{
		System.out.println("What Mirror Received: "+yet);
		yet+=(yet*0.05);
		System.out.println("What Mirror Changed: "+yet);
	}
	public void reflects(int[] get)
	{
		System.out.println("Received array:\n"+Arrays.toString(get));
		get[0]-=(get[0]*0.010);
		System.out.println("Impacted array:\n"+Arrays.toString(get));
	}
	public static void main(String[] args) 
	{
		int[] match= {12,45,67,89,91,01,10};
		Travel travel=new Travel();
		/*travel.mirror(match[3]);
		System.out.println("In Main observe the changes: "+match[3]);*/
		travel.reflects(match);
		System.out.println("In Main observe the changes after reflects\n"+
		Arrays.toString(match));
	}
}
