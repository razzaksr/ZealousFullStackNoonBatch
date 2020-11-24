package fullstaack.java.noon.NoonStackBatchJava.oop;

public class DemoLevel 
{
	public static void main(String[] args) 
	{
		Find f=new Find();
		f.travel();
		f.dup();
	}
}
class source
{
	int[] re= {5,65,3,45,34,98,89,78,2,2,45,65};
}
class Traverse extends source// single
{
	public void travel()
	{
		for(int y:re)
		{
			System.out.println(y);
		}
	}
}
class Find extends Traverse// multi level
{
	public void dup()
	{
		System.out.println("Duplicates gonna listsed");
		for(int hold=0;hold<re.length;hold++)
		{
			for(int com=hold+1;com<re.length;com++)
			{
				if(re[hold]==re[com])
				{
					System.out.println(re[hold]);
				}
			}
		}
	}
}