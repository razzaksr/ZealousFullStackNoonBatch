package fullstaack.java.noon.NoonStackBatchJava.input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class UnReadable 
{
	public static void main(String[] args) throws IOException 
	{
		File loc=new File("D:\\jpgms\\mohamed.zip");
		FileOutputStream fos=new FileOutputStream(loc);
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		Scanner scan=new Scanner(System.in);
		System.out.println("Please write anything to the file: ");
		String text=scan.nextLine();
		dos.write(text.getBytes());
		dos.close();
		fos.close();
		System.out.println(loc.getName()+" has got contents");
		FileInputStream fis=new FileInputStream(loc);
		InflaterInputStream iis=new InflaterInputStream(fis);
		byte[] temp=new byte[fis.available()];
		iis.read(temp);
		System.out.println(new String(temp));
		iis.close();
		fis.close();
	}
}
