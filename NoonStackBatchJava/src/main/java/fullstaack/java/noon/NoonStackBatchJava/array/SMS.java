package fullstaack.java.noon.NoonStackBatchJava.array;

public class SMS 
{
	public static void match(int[][] yet,int desired)
	{
		for(int ind=0;ind<yet.length;ind++)
		{
			for(int col=0;col<yet[ind].length;col++)
			{
				if(yet[ind][col]<=desired)
				{
					System.out.println("Matched @row"+ ind +" @column"+col);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		//int[][] msg=new int[3][15];
		int[][] msg= {{15,20},{10,40},{19,24}};
		SMS.match(msg, 15);
	}
}
