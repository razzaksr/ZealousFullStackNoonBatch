package fullstaack.java.noon.NoonStackBatchJava.oop;

public class DemoDerive 
{
	public static void main(String[] args) 
	{
		Operating opr=new Operating();
		opr.greet();
		//System.out.println(opr.keyPeople[0]);
		opr.iterate();
	}
}
class Deal
{
	String[] keyPeople= {"Ruffallo","Jhonson","Downey","Lee","Evens"};
}
class Operating extends Deal
{
	public void greet() {System.out.println("Greetings from Operating");}
	public void iterate()
	{
		for(String temp:keyPeople) {System.out.println(temp);}
	}
}