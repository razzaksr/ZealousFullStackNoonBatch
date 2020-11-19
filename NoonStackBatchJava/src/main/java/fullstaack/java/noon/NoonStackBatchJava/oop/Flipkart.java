package fullstaack.java.noon.NoonStackBatchJava.oop;

import java.util.Arrays;

public class Flipkart 
{
	public static void main(String[] args) 
	{
		Item i1=new Item();i1.name="SonyPendrive";i1.price=2000;
		Item i2=new Item();i2.name="RealMe";i2.price=21000;
		Item i3=new Item();i3.name="ThomsonTV";i3.price=12500;
		Item i4=new Item();i4.name="HonorBand";i4.price=2300;
		Kart riyaz=new Kart();
		//riyaz.setHolder(98765456789L);
		Item[] tmp=new Item[2];tmp[0]=i2;tmp[1]=i4;
		riyaz.setItem(tmp);riyaz.calculate();
		System.out.println(riyaz.getHolder()+" "+Arrays.toString(riyaz.getItem())+" "+riyaz.getValue());
		
		tmp=new Item[3];
		tmp[0]=i2;tmp[1]=i4;tmp[2]=i1;
		Kart arun=new Kart(87654556545L,tmp);
		//arun.show();
		System.out.println(arun);
	}
}
