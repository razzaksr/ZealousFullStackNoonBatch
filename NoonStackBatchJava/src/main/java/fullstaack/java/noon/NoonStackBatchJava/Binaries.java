package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

/*
 * 64 32 16 8 4 2 1
 * 1  0  1  0 1 1 1 >>87
 */

public class Binaries 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us number wishto see binary form");
		int number=scan.nextInt();//87
		System.out.println(Integer.toBinaryString(number));
		/*StringBuffer hai=new StringBuffer();
		while(number>0)
		{
			hai.append(number%2);
			number/=2;
		}
		System.out.println(hai.reverse().toString());*/
	}
}
