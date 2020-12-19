package fullstaack.java.noon.NoonStackBatchJava.thread;

public class Life 
{
	public static void main(String[] args) 
	{
		Counter count=new Counter();
		Thread t1=new Thread(count,"Arun");
		Thread t2=new Thread(count,"Balaji");
		Thread t3=new Thread(count,"Charan");
		Thread t4=new Thread(count,"Dinesh");
		t1.run();t2.run();t3.run();t4.run();
	}
}
class Counter implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" "+
	Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
	}
}