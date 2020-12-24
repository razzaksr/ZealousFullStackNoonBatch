package fullstaack.java.noon.NoonStackBatchJava.input.output.advance;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CutPaste 
{
	public static void main(String[] args) throws IOException
	{
		/*File src=new File("D:\\jpgms\\aravind.doc");
		File dest=new File("D:\\jpgms\\hello");
		FileUtils.moveFileToDirectory(src, dest, true);*/
		File src=new File("D:\\jpgms\\riyaz.txt");
		File dest=new File("D:\\jpgms\\hello\\arunachalam.txt");
		FileUtils.moveFile(src, dest);
		System.out.println(src.getName()+" has cut and pasted to "+dest.getName());
	}
}
