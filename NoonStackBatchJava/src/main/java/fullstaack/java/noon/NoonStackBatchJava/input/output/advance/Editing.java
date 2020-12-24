package fullstaack.java.noon.NoonStackBatchJava.input.output.advance;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Editing 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scan=new Scanner(System.in);
		File file=new File("D:\\jpgms\\2020-09-16.doc");
		List<String> container=FileUtils.readLines(file);
		//System.out.println(container);
		for(String temp:container)
		{
			System.out.println(temp);
		}
		
		// edit single word in particular line
		System.out.println("Tell us line number you wish to change: ");
		int line=scan.nextInt();
		line--;
		System.out.println("Tell us word you wish to change: ");
		String begin=scan.next();
		System.out.println("Tell us word you wish alter instead of "+begin);
		String newone=scan.next();
		String original=container.get(line);
		if(original.contains(begin))
		{
			original=original.replace(begin, newone);
			container.set(line, original);
		}
		FileUtils.writeLines(file, container);
		System.out.println(begin+" has updated as "+newone+" in line "+(line+1));
		
		
		/*
		// edit a word through out the file
		System.out.println("Tell us word you wish to change: ");
		String begin=scan.next();
		System.out.println("Tell us word you wish alter instead of "+begin);
		String newone=scan.next();
		Collections.replaceAll(container, begin, newone);
		FileUtils.writeLines(file, container);
		System.out.println(FileUtils.readFileToString(file));*/
	}
}
