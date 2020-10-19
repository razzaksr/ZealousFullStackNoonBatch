package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class RiyazComplex 
{
	public static void main(String[] args) 
	{
		int netAmt=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us number tickets required: ");
		int numTic=scan.nextInt();
		// will you get the ticket as you requested or not
		if(numTic>=5&&numTic<=40)
		{
			System.out.println("Tell us do you all need refreshment: ");
			String refresh=scan.next();
			System.out.println("Tell us do you have any coupen: ");
			String coupen=scan.next();
			System.out.println("Tell us King/Queen Circle: ");
			char circle=scan.next().charAt(0);
			// circle based amount calculation
			if(circle=='k'||circle=='K')
			{
				netAmt=numTic*75;
			}
			else if(circle=='q'||circle=='Q')
			{
				netAmt=numTic*150;
			}
			else {System.out.println("Invalid Circle");return;}
			// check the eligibility for 10% discount
			if(numTic>=20)
			{
				netAmt-=(netAmt*0.10);
			}
			// check eligibility for 2% discount
			if(coupen.equalsIgnoreCase("yes"))
			{
				netAmt-=(netAmt*0.02);
			}
			// adding refreshment along with net amount
			if(refresh.equalsIgnoreCase("yes"))
			{
				netAmt+=(numTic*50);
			}
			System.out.println("Total cost to pay: "+netAmt);
		}
		else
		{
			System.out.println("Required Ticket Between 5 to 40");
		}
	}
}
