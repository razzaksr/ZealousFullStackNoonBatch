package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Scanner;

public class Land 
{
	static Scanner scan=new Scanner(System.in);
	public static void list(double[][] hai)
	{
		for(int row=0;row<hai.length;row++)
		{
			for(int col=0;col<hai[row].length;col++)
			{
				System.out.print(hai[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static void survey(double[][] get)
	{
		for(int layout=0;layout<get.length;layout++)
		{
			for(int area=0;area<get[layout].length;area++)
			{
				System.out.println("Tell us squarefeet of :"+(layout+1)+" @ "+(area+1));
				get[layout][area]=scan.nextDouble();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		double[][] sqFeet=new double[2][4];
		Land.survey(sqFeet);
		Land.list(sqFeet);
	}
}
