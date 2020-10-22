package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

/*
 * C,D,T,I
 */

public class Transaction 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		char process='\0';
		int debitCount=0, creditCount=0, fundCount=0, intrestCount=0;
		for(int each=1;each<=10;each++)
		{
			System.out.println("Tell us transaction type C/D/T/I: ");
			process=scan.next().charAt(0);
			if(process=='c'||process=='C')
				creditCount++;
			else if(process=='d'||process=='D')
				debitCount++;
			else if(process=='t'||process=='T')
				fundCount++;
			else if(process=='i'||process=='I')
				intrestCount++;
		}
		System.out.println("No of Debit's done is: "+debitCount);
		System.out.println("No of credit's done is: "+creditCount);
		System.out.println("No of Fund Transfer's done is: "+fundCount);
		System.out.println("No of Intrest done is: "+intrestCount);
	}
}
