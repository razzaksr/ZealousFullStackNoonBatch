package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Donation 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		boolean status;int amt, dayCollection=0;
		int dayMax=Integer.MIN_VALUE, festMax=Integer.MIN_VALUE, festCollection=0;
		for(int day=1;day<=3;day++)
		{
			dayCollection=0;
			do
			{
				System.out.println("Tell us amount wish to donate: ");
				amt=scan.nextInt();
				dayCollection+=amt;
				if(amt>dayMax)
				{
					dayMax=amt;
				}
				System.out.println("Is there another donor?");
				status=scan.nextBoolean();
			}while(status==true);
			festCollection+=dayCollection;
			System.out.println("Donation obtained is "+dayCollection+" in the day of "+day);
			System.out.println("High paid Donation obtained is "+dayMax+" in the day of "+day);
			if(dayMax>festMax)
			{
				festMax=dayMax;
			}
		}
		System.out.println("Total donation obtained: "+festCollection);
		System.out.println("High paid donation in this festival: "+festMax);
	}
}
