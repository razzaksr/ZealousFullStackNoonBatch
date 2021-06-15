package fullstaack.java.noon.NoonStackBatchJava.json;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.google.gson.Gson;

import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;

public class JsontoJavaByGSON 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("aravind.json");
		FileInputStream fis=new FileInputStream(file);
		byte[] tmp=new byte[fis.available()];
		fis.read(tmp);
		String data=new String(tmp);
		Gson gson=new Gson();
		Mobile mob=(Mobile)gson.fromJson(data, Mobile.class);
		System.out.println("Received mobile from json: \n"+mob);
		System.out.println(mob.getBrand());
	}
}
