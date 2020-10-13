package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

/*
 * Type Conversion:
 * a. Type casting: between any data type
 * syntax:
 * destVar=(destType)srcVar;
 */

public class Casting 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		char refer='R';
		System.out.println((int)refer);
		
		int sigma=122;
		System.out.println(sigma+" "+(char)sigma);
		
		System.out.println("Gold Conversion");
		System.out.println("Tell us gram price: ");
		float gram=scan.nextFloat();
		int pown=(int)(gram*8);
		int savaran=(int)gram*10;
		System.out.println("Pown value: "+pown);
		System.out.println("Savaran value: "+savaran);
	}
}
