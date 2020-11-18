package fullstaack.java.noon.NoonStackBatchJava.oop;

public class Outer 
{
	public static void main(String[] args) 
	{
		Kelly k=new Kelly();k.china();k.ten();k.list();
		new Kelly().list();// anonymous way
	}
}
class Kelly
{
	static int[] hai= {12,34,56,78,3,1,78,9,4,3,10,98,43,11,55,67,32,11};
	public void list()
	{
		System.out.println("Listing all");
		for(int tmp:hai)
		{
			System.out.println(tmp);
		}
	}
	public void ten()
	{
		System.out.println("Ten percent hike");
		for(int index=0;index<hai.length;index++)
		{hai[index]+=(hai[index]*0.10);}
	}
	public void china()
	{
		System.out.println("18 percent threat ");
		for(int index=0;index<hai.length;index++)
		{hai[index]-=(hai[index]*0.18);}
	}
}