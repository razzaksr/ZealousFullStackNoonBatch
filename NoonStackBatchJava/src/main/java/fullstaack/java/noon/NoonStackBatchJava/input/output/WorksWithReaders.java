package fullstaack.java.noon.NoonStackBatchJava.input.output;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WorksWithReaders 
{
	public static void main(String[] args) throws IOException 
	{
		File loc=new File("D:\\jpgms\\architha.txt");
		FileReader fr=new FileReader(loc);
		int each;
		while((each=fr.read())!=-1)
		{
			System.out.print((char)each);
		}
		fr.close();
	}
}
