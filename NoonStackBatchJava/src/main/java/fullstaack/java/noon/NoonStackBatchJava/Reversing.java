package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

/*
 * 879
 * 
 * %10>> 9
 * rev=0*10+9>>9
 * numer /10 >>87
 * %10 >> 7
 * 9*10>>90+7>>97
 * number/10 >> 8
 * %10>>8
 * rev: 97*10>>970+8>>978
 * 
 * 
 * 978
 * 
 * 
 * 
 * %10 >> 9
 *  divided 10
 * 
 */

public class Reversing 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us the number you wish to reverse: ");
		int number=scan.nextInt();
		int reverse=0;
		while(number>0)
		{
			reverse=reverse*10+(number%10);
			number/=10;
		}
		System.out.println(reverse);
	}
}
