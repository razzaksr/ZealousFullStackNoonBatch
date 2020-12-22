package fullstaack.java.noon.NoonStackBatchJava.input.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingWithStream 
{
	public static void main(String[] args) throws IOException 
	{
		File point=new File("D:\\jpgms\\riyaz.txt");
		FileOutputStream fos=new FileOutputStream(point);
		Scanner scan=new Scanner(System.in);
		System.out.println("Please write anything to the file: ");
		String text=scan.nextLine();
		fos.write(text.getBytes());
		fos.close();
		System.out.println("Content has written in "+point.getAbsolutePath());
	}
}
