package fullstaack.java.noon.NoonStackBatchJava.input.output.advance;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class AdvanceWritting 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\jpgms\\aravind.doc");
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us what you wish to write in file "+file.getName());
		String content=scan.nextLine();
		FileUtils.writeStringToFile(file, content, true);
		System.out.println("Content has written in "+file.getName());
	}
}
