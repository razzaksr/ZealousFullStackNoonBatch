package fullstaack.java.noon.NoonStackBatchJava.json;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.gson.Gson;

import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;

public class JavaToJsonByGSON 
{
	public static void main(String[] args) throws IOException 
	{
		Mobile mob=new Mobile("7","One Plus","Dual Camera",6,128,33000,3,6.5F);
		Gson gson=new Gson();
		String converted=gson.toJson(mob);
		//System.out.println(converted);
		File file=new File("Arunachalam.json");
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(converted.getBytes());
		fos.close();
		System.out.println(file.getAbsolutePath()+" contains converted json object");
	}
}
