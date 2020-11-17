package fullstaack.java.noon.NoonStackBatchJava.oop;

public class Controller 
{
	public static void main(String[] args) 
	{
		Product pro=new Product();
		pro.id=9879;pro.price=250;pro.name="Bata";pro.quantity=10;
		pro.info();
		Product pro1=new Product();
		pro1.id=45678;pro1.price=980;pro1.name="VKC";pro1.quantity=4;
		pro1.info();
	}
}
