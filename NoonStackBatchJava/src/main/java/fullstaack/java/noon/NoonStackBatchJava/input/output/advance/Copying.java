package fullstaack.java.noon.NoonStackBatchJava.input.output.advance;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Copying 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("D:\\jpgms\\aravind.doc");
		//File dest=new File("D:\\jpgms\\Sankar");
		//FileUtils.copyFileToDirectory(src, dest);
		File dest=new File("D:\\jpgms\\Kavin\\mohamed.doc");
		FileUtils.copyFile(src, dest);
		System.out.println(src.getName()+" has copied to "+dest.getName());
	}
}
