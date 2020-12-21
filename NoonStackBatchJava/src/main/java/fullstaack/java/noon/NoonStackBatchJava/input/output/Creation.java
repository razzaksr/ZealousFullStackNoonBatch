package fullstaack.java.noon.NoonStackBatchJava.input.output;

import java.io.File;
import java.io.IOException;

public class Creation 
{
	public static void main(String[] args) throws IOException 
	{
		File point=new File("D:\\jpgms\\aravind.txt");
		point.createNewFile();
		System.out.println(point.getName()+" created successfully");
	}
}
