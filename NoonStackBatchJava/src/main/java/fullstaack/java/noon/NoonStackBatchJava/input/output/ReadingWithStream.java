package fullstaack.java.noon.NoonStackBatchJava.input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingWithStream 
{
	public static void main(String[] args) throws IOException 
	{
		File loc=new File("D:\\jpgms\\riyaz.txt");
		FileInputStream fis=new FileInputStream(loc);
		byte[] data=new byte[fis.available()];
		fis.read(data);
		System.out.println("Content extracted from "+loc.getName());
		fis.close();
		System.out.println(new String(data));
	}
}
