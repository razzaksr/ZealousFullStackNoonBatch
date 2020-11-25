package fullstaack.java.noon.NoonStackBatchJava.oop;

public class DemoAbstract extends Brunch 
{
	public static void main(String[] args) 
	{
		Brunch b=new DemoAbstract();
		b.add("Welcome to Bangalore");
		b.list();
	}

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		dishes+=""+obj;
	}
}
abstract class Brunch
{
	String dishes="";
	public void list() {System.out.println(dishes);}
	public abstract void add(Object obj);
}