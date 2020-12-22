package fullstaack.java.noon.NoonStackBatchJava.input.output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorksWithWriters 
{
	public static void main(String[] args) throws IOException 
	{
		File loc=new File("D:\\jpgms\\architha.txt");
		FileWriter fw=new FileWriter(loc);
		fw.write("Cognizant offers most exicited increment in the salary");
		fw.flush();
		fw.close();
		System.out.println("File Written succesfully");
	}
}
