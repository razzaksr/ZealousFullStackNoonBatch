package fullstaack.java.noon.NoonStackBatchJava.array;

import java.util.Arrays;

public class BinOverMulti 
{
	public static void selection(String[][] get)
	{
		String temp="";
		for(int team=0;team<get.length;team++)
		{
			//holding/ select index by index
			for(int hold=0;hold<get[team].length;hold++)
			{
				//compare
				for(int com=hold+1;com<get[team].length;com++)
				{
					if(get[team][hold].compareTo(get[team][com])>0)
					{
						temp=get[team][hold];
						get[team][hold]=get[team][com];
						get[team][com]=temp;
					}
				}
			}
		}
	}
	public static String binSearch(String[][] get, int row, int start,int end,String element)
	{
		if(Arrays.toString(get[row]).contains(element))
		{
		int mid=(start+end)/2;
		if(element.equals(get[row][mid]))
			return element+" found row of "+row+", column of "+mid;
		else if(element.compareTo(get[row][mid])>0)
			return binSearch(get, row, mid+1, end, element);
		else if(element.compareTo(get[row][mid])<0)
			return binSearch(get, row, start, mid, element);
		return "";
		}
		else
			return element+" not found anywhere in "+row;
	}
	public static void list(String[][] hai)
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
	public static void main(String[] args) 
	{
		String[][] members= {{"Riyaz","Sri","Nivetha"},
				{"Aravind","Vinotha","Maha"},
				{"Arunachalam","Madhu","Maadhu"}};
		BinOverMulti.selection(members);
		BinOverMulti.list(members);
		for(int row=0;row<members.length;row++)
		{
			System.out.println(BinOverMulti.binSearch(members, row, 0, members[row].length-1, "Razak"));
		}
	}
}
