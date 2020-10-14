package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Cibil 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the cibil score: ");
		int cibil=scan.nextInt();
		if(cibil<=1||cibil>=1000)
		{
			System.out.println("Invalid Cibil");
		}
		else
		{
			System.out.println("Yo will get loan");
			if(cibil>=500&&cibil<700)
			{
				System.out.println("You will get PL of 2lacks");
			}
			else if(cibil>=700&&cibil<800)
			{
				System.out.println("You will get BL of 8lacks");
			}
			else if(cibil>=800&&cibil<1000)
			{
				System.out.println("You will get HL of 9lacks");
			}
			else
			{
				System.out.println("No loans available for you");
			}
		}
	}
}
