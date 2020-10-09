package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class Show 
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to BookMyShow Choose movie you wish to watch");
		String movie=scan.nextLine();
		System.out.println("Tell us Circle: ");
		String circle=scan.nextLine();
		System.out.println("Tell us Number of tickets you want: ");
		short nums=scan.nextShort();
		
		int netAmt=nums*150;
		
		System.out.println(nums+" has booked with "+netAmt+" which each 150 for the movie "+movie+" in circle of "+circle);
	}
}
