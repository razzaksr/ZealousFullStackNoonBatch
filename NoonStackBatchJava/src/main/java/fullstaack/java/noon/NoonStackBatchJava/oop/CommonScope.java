package fullstaack.java.noon.NoonStackBatchJava.oop;

public class CommonScope 
{
	public static void main(String[] args) 
	{
		Fibo fb=new Fibo();
		fb.list();
		Fibo.Insert ins=new Fibo.Insert();
		ins.range(3, 11);
		Fibo.Insert.addOn(3);
		fb.list();
	}
}

class Fibo
{
	static int[] hai= {12,34,56,78,3,1,78,9,4,3,10,98,43,11,55,67,32,11};
	static class Insert
	{
		public void range(int origin,int end)
		{
			System.out.println("Listing all between "+origin+" and "+end);
			for(;origin<=end;origin++)
			{
				System.out.println(hai[origin]);
			}
		}
		public static void addOn(int single)
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