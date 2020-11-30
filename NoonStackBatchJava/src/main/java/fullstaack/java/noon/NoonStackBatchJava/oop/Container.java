package fullstaack.java.noon.NoonStackBatchJava.oop;

import java.util.Arrays;

public class Container 
{
	private int[] check= {12,45,78,19,35,25,98};
	public void list() {System.out.println(Arrays.toString(check));}
	void update(int index,int value)
	{
		if(index<check.length)
		{
			check[index]=value;
			System.out.println(value+" Update @ "+index);
		}
		else {System.out.println("Can't update due to boundry limit");}
	}
	protected int linear(int data)
	{
		for(int index=0;index<check.length;index++)
		{
			if(data==check[index])
				return index;
		}
		return -1;
	}
	public final void hello()
	{
		System.out.println("Welcome to Container access");
	}
}
