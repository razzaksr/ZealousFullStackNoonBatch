package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Arrays;

public class DemoStr 
{
	public static void main(String[] args) 
	{
		String alpha="  razzaksr@gmail.com";// literal
		String beta=new String("Razak Mohamed");// non literal
		System.out.println(alpha.length());
		System.out.println(beta.length());
		alpha=alpha.trim();// immutablity
		System.out.println(alpha.length());
		System.out.println(alpha.equalsIgnoreCase("RAZZAKSR@GMAIL.COM"));
		System.out.println(beta.compareTo("Razak Mohamed"));
		String[] temp=alpha.split("@");
		System.out.println(Arrays.toString(temp));
		System.out.println(beta.contains("ham"));
		System.out.println(beta.substring(3,7));
		System.out.println(alpha.charAt(10));
		System.out.println(alpha+" "+alpha.getBytes());
		beta=beta.toUpperCase();
		System.out.println(beta);
	}
}
