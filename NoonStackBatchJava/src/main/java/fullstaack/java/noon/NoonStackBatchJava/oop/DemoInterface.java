package fullstaack.java.noon.NoonStackBatchJava.oop;

public class DemoInterface extends Alpha implements Min
{
	public void greet()// overriden method
	{
		System.out.println("Greetings from Razak Mohamed");
		super.greet();
	}
	public static void main(String[] args) 
	{
		DemoInterface a=new DemoInterface();
		a.beta="Karthi";
		//System.out.println(a.cosmo);
		a.greet();
		a.appritiate();
	}
	@Override
	public void appritiate() 
	{
		System.out.println("Appritiate all sanitize employees");
	}
}

interface Min
{
	String cosmo="Riyaz";
	public void appritiate();// abstract method
}

class Alpha
{
	String beta;
	public void greet()// defined method/ non abstract method
	{
		System.out.println("Greetings from Zealous");
	}
}