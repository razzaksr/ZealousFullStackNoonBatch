package fullstaack.java.noon.NoonStackBatchJava.array;

public class MultiSample 
{
	public static void list(int[][] hai)
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
		int[][] yet= {{12,34},{56,90},{12,45},{55,19}};
		System.out.println(yet.length);
		System.out.println(yet[0].length);
		System.out.println(yet[2][1]);
		System.out.println(yet[3][1]);
		list(yet);
	}
}
