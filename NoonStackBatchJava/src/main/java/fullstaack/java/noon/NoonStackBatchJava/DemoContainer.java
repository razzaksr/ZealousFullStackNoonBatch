package fullstaack.java.noon.NoonStackBatchJava;

import fullstaack.java.noon.NoonStackBatchJava.oop.Container;

public class DemoContainer extends Container
{
	public static void main(String[] args) 
	{
		DemoContainer con=new DemoContainer();
		con.list();
		System.out.println(con.linear(35));
		con.hello();
		//con.update(2, 999);
	}
}
