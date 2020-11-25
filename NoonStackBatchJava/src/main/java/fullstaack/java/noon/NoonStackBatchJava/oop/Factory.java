package fullstaack.java.noon.NoonStackBatchJava.oop;

import java.util.Arrays;

public class Factory 
{
	public static void main(String[] args) 
	{
		Warehouse ware=new Warehouse();
		ware.sort();
		ware=new Micro();
		ware.sort();//ware.welcome();
		ware=new Wide();
		ware.sort();
	}
}

class Warehouse
{
	int[] some= {32,47,52,12,59,45,91,124,145,49,206,51,512};
	public void sort()
	{
		System.out.println("Will be sorted by Inbuilt one");
		Arrays.sort(some);
		System.out.println(Arrays.toString(some));
	}
}
class Micro extends Warehouse
{
	public void welcome() {System.out.println("Welcome to micro");}
	public void sort()
	{
		System.out.println("Sort based on selection algorithm");
		for(int hold=0;hold<some.length;hold++)
		{
			for(int com=hold+1;com<some.length;com++)
			{
				if(some[hold]>some[com])
				{
					some[hold]^=some[com];
					some[com]^=some[hold];
					some[hold]^=some[com];
				}
			}
		}
		System.out.println(Arrays.toString(some));
	}
}
class Wide extends Warehouse
{
	public void receive() {System.out.println("Welcome to reception");}
	public void sort()
	{
		System.out.println("Sort based on bubble algorithm");
		for(int hold=0;hold<some.length-1;hold++)
		{
			for(int com=0;com<some.length-hold-1;com++)
			{
				if(some[com]>some[com+1])
				{
					some[com]^=some[com+1];
					some[com+1]^=some[com];
					some[com]^=some[com+1];
				}
			}
		}
		System.out.println(Arrays.toString(some));
	}
}