package fullstaack.java.noon.NoonStackBatchJava.input.output.advance;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Renaming 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("D:\\jpgms\\2020-09-16.doc");
		File dest=new File("D:\\jpgms\\2020-12-16.doc");
		FileUtils.moveFile(src, dest);
		System.out.println(src.getName()+" has updated "+dest.getName());
	}
}
