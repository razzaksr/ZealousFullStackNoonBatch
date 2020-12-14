package fullstaack.java.noon.NoonStackBatchJava.handle;

import java.io.IOException;

public class ChecksNew extends Hello
{
	public void pattern(String hai)throws IOException
	{
		System.out.println("Overriden");
	}
	public static void main(String[] args) throws IOException 
	{
		ChecksNew n=new ChecksNew();
		n.pattern("Razak");
		n.pattern("hai");
	}
}

/*
 * 
 * alpha
 * 
 *   a
 *  alp
 * alpha
 */

class Hello
{
	public void pattern(String hai)throws IOException, ArithmeticException// pyramid
	{
		if(hai.length()%2!=0)
		{
			int limit=1;
			for(int rows=0;rows<=(hai.length()/2);rows++)
			{
				for(int space=(hai.length()/2);space>rows;space--)// space
				{
					System.out.print(" ");					
				}
				for(int data=0;data<limit;data++)
				{
					System.out.print(hai.charAt(data));
				}
				limit+=2;System.out.println();
			}
		}
		else {System.out.println("Can't draw pyramid");}
	}
}