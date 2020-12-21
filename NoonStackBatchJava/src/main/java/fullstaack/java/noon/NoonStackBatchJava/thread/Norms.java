package fullstaack.java.noon.NoonStackBatchJava.thread;

import java.util.Arrays;

public class Norms implements Cloneable// marked interfaces
{
	String[] terms;
	public String toString() {return Arrays.toString(terms);}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Norms n1=new Norms();
		n1.terms=new String[] {"No Mobile","No Casuals"};
		System.out.println("Company one "+n1);
		Norms n2=n1;
		System.out.println("Company two "+n2);
		n2.terms[0]="Id Must";
		System.out.println("Company two "+n2);
		System.out.println("Company one "+n1);
		n1.terms[1]="Shoe Must";
		System.out.println("Company two "+n2);
		System.out.println("Company one "+n1);
		Norms n3=(Norms)n1.clone();// unboxing
		System.out.println("Company three: "+n3);
		n3.terms=new String[] {"No accessories"};
		n2.terms=new String[] {"Helmets are mandate"};
		System.out.println("Company one "+n1);
		System.out.println("Company two "+n2);
		System.out.println("Company three: "+n3);
		Object obj=n1;// boxing
	}
}