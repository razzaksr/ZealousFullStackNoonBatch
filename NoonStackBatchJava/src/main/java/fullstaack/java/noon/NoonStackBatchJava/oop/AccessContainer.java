package fullstaack.java.noon.NoonStackBatchJava.oop;

public class AccessContainer //extends Container
{
	//public void hello() {System.out.println("Welcome to demonstration");}
	public static void main(String[] args) 
	{
		Container con=new Container();
		con.list();
		System.out.println(con.linear(12));
		con.hello();
		con.update(2, 999);
	}
}
