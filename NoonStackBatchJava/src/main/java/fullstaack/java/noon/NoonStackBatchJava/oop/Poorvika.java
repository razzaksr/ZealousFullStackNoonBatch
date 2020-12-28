package fullstaack.java.noon.NoonStackBatchJava.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;

//command Line interface application

public class Poorvika implements Retail
{
	Mobile[] stock=new Mobile[15];// 0 14>> null
	File pros=new File("D:\\jpgms\\stocks.doc");
	File log=new File("D:\\jpgms\\log"+LocalDate.now()+".doc");
	FileOutputStream fos;
	ObjectOutputStream oos;
	
	
	public static void main(String[] args) throws IOException 
	{
		Poorvika p=new Poorvika();
		p.fos=new FileOutputStream(p.pros);
		p.oos =new ObjectOutputStream(p.fos);
		Mobile mob1=new Mobile("6.1Plus", "Nokia", "FullHd,Snapdragon620G", 4, 64, 15600, 20, 5.5F);
		Mobile mob2=new Mobile("V20", "Vivo", "Hd,Snapdragon580G", 4, 128, 24600, 200, 5.5F);
		Mobile mob3=new Mobile("9Lite", "Nokia", "20MBCamera,HD", 3, 32, 9600, 10, 5.5F);
		Mobile mob7=new Mobile("5S", "Realme", "FullHd,Snapdragon620G,128MBCamera", 4, 128, 21600, 10, 6.5F);
		p.addToStock(mob1);p.addToStock(mob7);p.addToStock(mob2);p.addToStock(mob3);
		p.list();p.enquiry("FullHd", 16000);
		p.enquiry("Nokia");
		p.enquiry(3);
		p.discount(15000);
		p.sortByBrand();
		p.list();
	}

	@Override
	public void addToStock(Mobile obj) 
	{
		for(int index=0;index<stock.length;index++)
		{
			if(stock[index]==null)
			{
				stock[index]=obj;
				//System.out.println(obj.getModel()+" added to stock");
				try {
					oos.writeObject(obj);
					FileUtils.writeStringToFile(log, "\n"+obj.getModel()+" added to stock\n",true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	}

	@Override
	public void enquiry(int ram) 
	{
		System.out.println("Filter based on RAM: "+ram);
		for(Mobile temp:stock)
		{
			if(temp!=null&&temp.getRam()>=ram)
			{
				System.out.println(temp);
			}
		}
	}

	@Override
	public void enquiry(String brand) {
		// TODO Auto-generated method stub
		System.out.println("Filter based on Brand: "+brand);
		for(Mobile temp:stock)
		{
			if(temp!=null&&temp.getBrand().equalsIgnoreCase(brand))
			{
				System.out.println(temp);
			}
		}
	}

	@Override
	public void enquiry(String features, int budget) {
		// TODO Auto-generated method stub
		System.out.println("Filter based on Features: "+features+" and budget "+budget);
		for(Mobile temp:stock)
		{
			if(temp!=null&&temp.getFeatures().contains(features)&&temp.getPrice()<=budget)
			{
				System.out.println(temp);
			}
		}
	}

	@Override
	public void enquiry(double budget) {
		// TODO Auto-generated method stub
		System.out.println("Filter based on Budget: "+budget);
		for(Mobile temp:stock)
		{
			if(temp!=null&&temp.getPrice()<=budget)
			{
				System.out.println(temp);
			}
		}
	}

	@Override
	public void discount(int range) 
	{
		// TODO Auto-generated method stub
		for(int index=0;index<stock.length;index++)
		{
			if(stock[index]!=null&&stock[index].getPrice()>=range)
			{
				int old=stock[index].getPrice();
				old-=(old*0.05);
				stock[index].setPrice(old);
				System.out.println(stock[index].getModel()+" applied discount");
				try {
					FileUtils.writeStringToFile(log, "\n"+stock[index].getModel()+" applied discount",true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Mobile remove(int pos) {
		// TODO Auto-generated method stub
		Mobile temp=null;
		if(pos<stock.length)
		{
			temp=stock[pos];
			stock[pos]=null;
			//System.out.println("Mobile removed");
			try {
				FileUtils.writeStringToFile(log, "\n"+stock[pos].getModel()+" removed successfully",true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return temp;
	}

	@Override
	public void list() 
	{
		System.out.println("Listing all the stocks");
		for(Mobile temp:stock)
		{
			if(temp!=null)
				System.out.println(temp);
		}
	}

	@Override
	public void sortByBrand() {
		Mobile tmp=null;
		// TODO Auto-generated method stub
		for(int times=0;times<stock.length-1;times++)
		{
			for(int com=0;com<stock.length-times-1;com++)
			{
				if(stock[com]!=null&&stock[com+1]!=null) {
				if(stock[com].getPrice()>stock[com+1].getPrice())
				{
					tmp=stock[com];
					stock[com]=stock[com+1];
					stock[com+1]=tmp;
				}
				}
			}
		}
	}
}
