package fullstaack.java.noon.NoonStackBatchJava.oop;

public class MemTypes 
{
	public static void main(String[] args) 
	{
		Hell india=new Hell();
		Hell.ruler="Negativity";//india.ruler="Negativity";
		india.years=7;
		Hell us=new Hell();us.years=5;Hell.ruler="Donald";//us.ruler="Donald";
		india.status();
		us.status();
		Hell russia=new Hell();
		russia.years=10;
		russia.status();
		Hell.ruler="Dom Torento";//russia.ruler="Dom Torento";
		Hell.punish(india);
	}
}
class Hell
{
	static String ruler;
	int years;
	public void status()
	{
		System.out.println(ruler+" "+years);
	}
	public static void punish(Hell obj)
	{
		System.out.println(ruler+" will punish for a "+obj.years);
	}
}