package fullstaack.java.noon.NoonStackBatchJava.oop;

public class Local 
{
	public static void main(String[] args) 
	{
		Maxim max=new Maxim();
		max.shinko();
		max.hayato();
	}
}
class Maxim
{
	public void shinko()
	{
		int hello=20;
		System.out.println(hello);
	}
	public void hayato()
	{
		int[] hai= {12,34,56,78,3,1,78,9,4,3,10,98,43,11,55,67,32,11};
		class Yet
		{
			public void traverse()
			{
				for(int nice:hai)
				{
					System.out.println(nice);
				}
			}
		}
		Yet y=new Yet();y.traverse();
	}
}