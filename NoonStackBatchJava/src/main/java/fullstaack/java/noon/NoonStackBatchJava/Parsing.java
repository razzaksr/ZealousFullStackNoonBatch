package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

/*
 * Type Conversion:
 * b. type parsing: String to other formats/types
 * int,float,char,double,long,short,byte,boolean
 * 
 * Integer, Float, Character, Double, Long, Short,Byte,Boolean>> Wrappers
 * 
 * int data=90;// literal
 * Integer data=new Integer(90);// non literal
 * Integer data=90;// literal
 * 
 * syntax for parsing:
 * type var=Wrapper.parseType(String);
 * eg:
 * int mob=Integer.parseInt(String);
 * 
 */

public class Parsing 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us Name: ");
		String name=scan.nextLine();
		System.out.println("Tell us years of experience: ");
		String experience=scan.next();
		System.out.println("Tell us current salary: ");
		String salary=scan.next();
		
		// parsing
		Short exp=Short.parseShort(experience);
		float current=Float.parseFloat(salary);
		
		// conditions for increment
		if(exp>=2&&exp<=5)
		{
			current+=(current*0.05F);
			System.out.println("Current salary incremented by 5 percent");
		}
		else if(exp>5&&exp<=8)
		{
			current+=(current*0.09F);
			System.out.println("Current salary incremented by 9 percent");
		}
		else if(exp>8&&exp<=10)
		{
			current+=(current*0.12F);
			System.out.println("Current salary incremented by 12 percent");
		}
		else if(exp>10)
		{
			current+=(current*0.03F);
			System.out.println("Current salary incremented by 3 percent");
		}
		else
		{
			System.out.println("Nonchanges inn current salary");
		}
		System.out.println("Now your current salary is: "+current);
	}
}
