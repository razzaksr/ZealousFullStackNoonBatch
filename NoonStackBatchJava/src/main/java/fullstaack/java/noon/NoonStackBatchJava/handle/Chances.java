package fullstaack.java.noon.NoonStackBatchJava.handle;

import java.util.Scanner;

public class Chances 
{
	int[] memCard= {1200,670,300,800,450,500,200};
	Scanner scan=new Scanner(System.in);
	static int attempt=0;
	public void buy()
	{
		attempt++;
		try
		{
			System.out.println("TEll us boundry: ");
			int input=scan.nextInt();
			System.out.println(memCard[input]);
			System.out.println("Desired product purchased");
		}
		catch(ArrayIndexOutOfBoundsException ain)
		{
			//ain.printStackTrace();
			System.out.println(ain);
			/*System.out.println("Enter valid boundry");int input=scan.nextInt();
			System.out.println(memCard[input]);*/
			if(attempt<5)
			{buy();}
			else {return;}
		}
	}
	public static void main(String[] args) 
	{
		new Chances().buy();
		System.out.println("Shopping done");
	}
}
