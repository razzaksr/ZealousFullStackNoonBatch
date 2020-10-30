package fullstaack.java.noon.NoonStackBatchJava.methods;

public class Recursive 
{
	public int reverse(int rev,int original)
	{
		if(original<=0)
			return rev;
		else
		{
			rev=(rev*10)+(original%10);
			original/=10;// iteration
			return reverse(rev, original);
		}
	}
	public void hello(int stage)
	{
		if(stage<=50)
			System.out.println("Zealous @ "+stage);
		else
			return;
		stage++;hello(stage);
	}
	public static void main(String[] args) 
	{
		Recursive recur=new Recursive();recur.hello(12);
		System.out.println(recur.reverse(0, 712));
		/*
		// Endless/infinte loop
		for(int hai=1;;hai++)
		{
			System.out.println("Zealous "+hai);
		}
		while(true)
		{
		}
		*/
	}
}
