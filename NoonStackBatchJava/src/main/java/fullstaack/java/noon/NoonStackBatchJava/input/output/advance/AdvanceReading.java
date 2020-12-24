package fullstaack.java.noon.NoonStackBatchJava.input.output.advance;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceReading 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\jpgms\\aravind.doc");
		System.out.println(file.getName()+" contents are \n"+FileUtils.readLines(file));
	}
}
