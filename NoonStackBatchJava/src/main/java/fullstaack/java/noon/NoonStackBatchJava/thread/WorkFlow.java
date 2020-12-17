package fullstaack.java.noon.NoonStackBatchJava.thread;

import java.util.Arrays;
import java.util.Scanner;

public class WorkFlow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Reach rec=new Reach();
		Thread t1=new Thread(rec,"Aravind");
		Thread t2=new Thread(rec,"Bala");
		Thread t3=new Thread(rec,"Cosmo");
		Thread t4=new Thread(rec,"Dinesh");
		Thread t5=new Thread(rec,"Elango");
		Thread t6=new Thread(rec,"Froyo");
		Thread t7=new Thread(rec,"Ganga");
		//t7.setPriority(1);t1.setPriority(10);
		t1.start();t1.join();t2.start();t2.join();t3.start();t3.join();
		t4.start();t4.join();t5.start();t5.join();
		t6.start();t6.join();t7.start();t7.join();
	}
}

class Alpha
{
	int[] term;
	public String toString()
	{
		return Arrays.toString(term);
	}
}

class Reach extends Alpha implements Runnable
{
	public Reach() {term= new int[]{12,45,9,8,17,34,90,10,55,9,10,34};}
	//public Reach(int size) {term=new int[size];}
	public void updateToTerm(int index,int element)
	{
		if(index<term.length)
			{
				term[index]=element;
				System.out.println(element+" updated to term @ "+index+" by "+Thread.currentThread().getName());
			}
	}
	public int search(int element)
	{
		for(int index=0;index<term.length;index++)
		{
			if(term[index]==element)
			{
				System.out.println(element+" found by "+Thread.currentThread().getName());
				return index;
			}
		}
		return -1;
	}
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" "+
	Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index and value to update: ");
		updateToTerm(scan.nextInt(), scan.nextInt());
		System.out.println("Enter the lement to search its position: ");
		System.out.println(search(scan.nextInt()));
		System.out.println(Thread.currentThread().getName()+" listing elements \n"+this);
	}
}