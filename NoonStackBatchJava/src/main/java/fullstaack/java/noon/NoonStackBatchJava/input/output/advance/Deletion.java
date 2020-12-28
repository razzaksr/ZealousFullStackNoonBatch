package fullstaack.java.noon.NoonStackBatchJava.input.output.advance;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Deletion 
{
	public static void main(String[] args) throws IOException 
	{
		/*File loc=new File("D:\\jpgms\\2020-12-16.doc");
		FileUtils.forceDelete(loc);
		System.out.println(loc.getName()+" has been deleted");*/
		File loct=new File("D:\\jpgms\\Dhaya");
		/*FileUtils.cleanDirectory(loct);
		System.out.println(loct.getName()+" files are all deleted");*/
		FileUtils.deleteDirectory(loct);
		System.out.println(loct.getName()+" has been deleted");
	}
}
