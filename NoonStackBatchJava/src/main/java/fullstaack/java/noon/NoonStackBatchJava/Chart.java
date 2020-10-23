package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

/*
 * $# #$
 * $$ $#
 * ## ##
 * $# $$
 * 
 */

public class Chart 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String dia="";
		for(int row='A';row<='C';row++)
		{
			for(int seat=1;seat<=4;seat++)
			{
				System.out.println("Pay the ticket fare: ");
				int fare=scan.nextInt();
				if(fare>=500)
				{
					//System.out.println("Your seat has booked @ "+row+" "+seat);
					dia+="$";
				}
				else
				{
					dia+="#";//System.out.println("Can't travel in this bus");
				}
				if(seat==2)
					dia+=" ";
			}
			dia+="\n";
		}
		System.out.println(dia);
	}
}
