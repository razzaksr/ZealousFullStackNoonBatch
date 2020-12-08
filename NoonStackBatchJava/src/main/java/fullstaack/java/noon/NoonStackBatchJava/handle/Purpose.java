package fullstaack.java.noon.NoonStackBatchJava.handle;

import java.util.Scanner;

public class Purpose 
{
	public static void main(String[] args) //throws StringIndexOutOfBoundsException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us index to extract: ");
		String alpha="Aravind";
		try
		{
			System.out.println(alpha.charAt(scan.nextInt()));
		}
		catch(StringIndexOutOfBoundsException sin)
		{
			System.out.println(sin);
			System.out.println("Index within 0 to "+(alpha.length()-1));
			System.out.println(alpha.charAt(scan.nextInt()));
		}
		finally
		{
			System.out.println("Done");
		}
	}
}
