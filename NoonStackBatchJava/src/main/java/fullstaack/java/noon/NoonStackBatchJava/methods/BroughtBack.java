package fullstaack.java.noon.NoonStackBatchJava.methods;

import java.util.Scanner;

public class BroughtBack 
{
	public static String recruit(int year)
	{
		if(year>=3&&year<=5){return "Senior Associate";}
		else if(year>5&&year<=8){return "Team Lead";}
		else if(year>8&&year<=10){return "Consultant";}
		else if(year>10){return "Project Manager";}
		else{return "Be as same you are";}
	}
	public static float fixedDeposit()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us no of months want to deposit: ");
		int months=scan.nextInt();
		System.out.println("Tell us amount wish to dedposit: ");
		int amount=scan.nextInt();
		if(months>=12)
		{amount+=(amount*0.0625F);}
		else {amount+=(amount*0.0425F);}
		return amount;
	}
	public static void main(String[] args) 
	{
		float tmp=BroughtBack.fixedDeposit();
		System.out.println("Maturity value: "+tmp);
		System.out.println("Maturity value: "+BroughtBack.fixedDeposit());
		String temp=BroughtBack.recruit(4);
		System.out.println(temp);
		temp=BroughtBack.recruit(7);
		System.out.println(temp);
		System.out.println(BroughtBack.recruit(12));
	}
}
