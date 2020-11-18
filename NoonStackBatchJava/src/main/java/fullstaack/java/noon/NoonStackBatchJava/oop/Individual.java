package fullstaack.java.noon.NoonStackBatchJava.oop;

import fullstaack.java.noon.NoonStackBatchJava.oop.Fibos.Inserts;

public class Individual 
{
	public static void main(String[] args)
	{
		Fibos fib=new Fibos();fib.list();
		Inserts ins=fib.new Inserts();
		ins.range(0, 5);
		ins.addOn(10);
		fib.list();
	}
}
class Fibos
{
	static int[] hai= {12,34,56,78,3,1,78,9,4,3,10,98,43,11,55,67,32,11};
	class Inserts
	{
		public void range(int origin,int end)
		{
			System.out.println("Listing all between "+origin+" and "+end);
			for(;origin<=end;origin++)
			{
				System.out.println(hai[origin]);
			}
		}
		public void addOn(int single)
		{
			for(int origin=0;origin<hai.length;origin++)
			{
				hai[origin]+=single;
			}
		}
	}
	public void list()
	{
		System.out.println("Listing all");
		for(int tmp:hai)
		{
			System.out.println(tmp);
		}
	}
}