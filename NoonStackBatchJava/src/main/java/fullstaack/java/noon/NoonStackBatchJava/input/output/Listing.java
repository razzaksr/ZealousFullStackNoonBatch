package fullstaack.java.noon.NoonStackBatchJava.input.output;

import java.io.File;

public class Listing 
{
	public static void main(String[] args) 
	{
		File area=new File("D://jpgms");
		if(area.isDirectory())
		{
			System.out.println("Listing all files/ folder in "+area.getAbsolutePath());
			File[] hold=area.listFiles();
			for(File each:hold)
			{
				System.out.println(each.getName());
			}
		}
		else {System.out.println(area.getAbsolutePath()+" is not folder");}
	}
}
