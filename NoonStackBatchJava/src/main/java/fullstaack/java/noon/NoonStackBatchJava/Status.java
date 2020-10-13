package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

/*
 * Relational: == >= <= > < !=
 * 
 * Logical: combine relational operator results
 * && || 
 */

public class Status 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		/*System.out.println("Tell us amount wish to draw: ");
		int cash=scan.nextInt();
		System.out.println("Do you need reciept: ");
		char state=scan.next().charAt(0);
		System.out.println("can the cash getting by 500: "+(cash%500==0));
		System.out.println("can the cash getting by 2000: "+(cash%2000==0));
		System.out.println("can the cash getting by 100: "+(cash%100==0));
		
		System.out.println("Can you get the amount as per daily limitation: "+(cash<=20000));
		
		System.out.println("Was Reciept required: "+(state=='y'));*/
		System.out.println("TEll us your annual salary: ");
		float ctc=scan.nextFloat();
		System.out.println("Are you comes under 5 % : "+(ctc>=3&&ctc<=5));
		System.out.println("Are you comes under 10 % : "+(ctc>5&&ctc<=10));
		System.out.println("Are you comes under 15 % : "+(ctc>10&&ctc<=20));
		System.out.println("Are you comes under 20 % : "+(ctc>20&&ctc<=30));
		System.out.println("Are you comes under 30 % : "+(ctc>30));
	}
}
