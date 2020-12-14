package fullstaack.java.noon.NoonStackBatchJava.handle;

import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;
import fullstaack.java.noon.NoonStackBatchJava.oop.Poorvika;

public class DemoCustom 
{
	Mobile[] stock=new Mobile[15];// 0 14>> null
	
	public int enquiry(int ram) throws AravindException 
	{
		System.out.println("Filter based on RAM: "+ram);
		for(int data=0;data<stock.length;data++)
		{
			if(stock[data]!=null&&stock[data].getRam()>=ram)
			{
				return data;
			}
		}
		try
		{throw new AravindException();}
		catch(AravindException a)
		{throw a;}
	}
	public void addToStock(Mobile obj) 
	{
		for(int index=0;index<stock.length;index++)
		{
			if(stock[index]==null)
			{
				stock[index]=obj;
				System.out.println(obj.getModel()+" added to stock");
				break;
			}
		}
	}
	public static void main(String[] args) throws AravindException 
	{
		DemoCustom p=new DemoCustom();
		Mobile mob1=new Mobile("6.1Plus", "Nokia", "FullHd,Snapdragon620G", 4, 64, 15600, 20, 5.5F);
		Mobile mob2=new Mobile("V20", "Vivo", "Hd,Snapdragon580G", 4, 128, 24600, 200, 5.5F);
		Mobile mob3=new Mobile("9Lite", "Nokia", "20MBCamera,HD", 3, 32, 9600, 10, 5.5F);
		Mobile mob7=new Mobile("5S", "Realme", "FullHd,Snapdragon620G,128MBCamera", 4, 128, 21600, 10, 6.5F);
		p.addToStock(mob1);p.addToStock(mob7);p.addToStock(mob2);p.addToStock(mob3);
		try
		{
			p.enquiry(5);
			throw new AravindException();
		}
		catch(AravindException ar)
		{
			System.out.println(ar);
			System.out.println(p.enquiry(4));
		}
	}
}
