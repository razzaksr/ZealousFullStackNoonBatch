package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

/*
 * Pattern:
 * 1 2 3 4 5
 * 6 7 8 9 10
 * 11 12 13 14 15
 * ..
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 * 
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *  ****
 *   ***
 *    **
 *     *
 *     
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * 	*******
 *   *****
 *    ***
 *     *
 * series
 * form: square, floyds, pascals, pyramid
 */

public class Patterns 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us no of rows you want: ");
		int user=scan.nextInt();
		System.out.println("Pattern pyramid lower");
		for(int row=user, alpha=65,limit=(user*2)-1;row>0;row--)
		{
			for(int space=user-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++,alpha++)
			{
				System.out.print((char)alpha);
			}
			limit-=2;System.out.println();
		}
		/*System.out.println("Pattern pyramid upper");
		for(int row=1, alpha=65,limit=1;row<=user;row++)
		{
			for(int space=user-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++,alpha++)
			{
				System.out.print((char)alpha);
			}
			limit+=2;System.out.println();
		}*/
		/*System.out.println("Pattern right upper pascal");
		for(int row=1, alpha=65;row<=5;row++)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,alpha++)
			{
				System.out.print((char)alpha+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern right lower floyd");
		for(int row=5, alpha=65;row>0;row--)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,alpha++)
			{
				System.out.print((char)alpha+" ");
			}
			System.out.println();
		}*/
		/*System.out.println("Pattern right lower floyd");
		for(int row=5, alpha=65;row>0;row--)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,alpha++)
			{
				System.out.print((char)alpha);
			}
			System.out.println();
		}*/
		/*System.out.println("Pattern right upper floyd");
		for(int row=1, alpha=65;row<=5;row++)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,alpha++)
			{
				System.out.print((char)alpha);
			}
			System.out.println();
		}*/
		/*System.out.println("Pattern Left Lower Floyd");
		for(int row=5, alpha=65;row>0;row--)
		{
			for(int col=1;col<=row;col++,alpha++)
			{
				System.out.print((char)alpha+" ");
			}
			System.out.println();
		}*/
		/*System.out.println("Pattern Left Upper Floyd");
		for(int row=1, alpha=65;row<=5;row++)
		{
			for(int col=1;col<=row;col++,alpha++)
			{
				System.out.print((char)alpha+" ");
			}
			System.out.println();
		}*/
		/*System.out.println("Pattern Square");
		for(int row=1, alpha=65;row<=5;row++)
		{
			for(int col=1;col<=5;col++,alpha++)
			{
				System.out.print((char)alpha+" ");
			}
			System.out.println();
		}*/
	}
}
