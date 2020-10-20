package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class PostOffice 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		for(int token=19;token<=15;token++)
		{
			System.out.println("Tell us reason for visting: ");
			String reason=scan.nextLine();
			switch(reason)
			{
			case "moneyorder":System.out.println("Go to counter 7");break;		
			case "post":System.out.println("Go to counter 5");break;
			case "aadhar":System.out.println("Updating adhar go to 22");break;
			}
		}
	}
}
