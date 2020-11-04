package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Scanner;

public class Binary 
{
	public static void main(String[] args) 
	{
		double[] yet= {12.5,19.7,21.8,45.8,55.9,61.10};
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us element you wish to search: ");
		double element=scan.nextDouble();
		int received=Binary.searchBin(yet, 0, yet.length-1, element);
		if(received!=-1)
			System.out.println(element+" found @ "+received);
		else
			System.out.println(element+" not found");
	}
	public static int searchBin(double[] arr,int start,int end,double element)
	{
		int mid=(start+end)/2;
		if(element==arr[mid])
			return mid;
		else if(element<arr[mid])
			return searchBin(arr, start, mid, element);
		else if(element>arr[mid])
			return searchBin(arr, mid+1, end, element);
		else
			return -1;
	}
}
