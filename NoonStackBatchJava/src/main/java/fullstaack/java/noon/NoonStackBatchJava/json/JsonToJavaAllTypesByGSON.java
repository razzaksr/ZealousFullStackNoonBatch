package fullstaack.java.noon.NoonStackBatchJava.json;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.google.gson.Gson;

public class JsonToJavaAllTypesByGSON 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("ArunachalamResource.json");
		FileInputStream fis=new FileInputStream(file);
		byte[] tmp=new byte[fis.available()];
		fis.read(tmp);
		fis.close();
		String data=new String(tmp);
		Gson gson=new Gson();
		Resource resource=(Resource)gson.fromJson(data, Resource.class);
		System.out.println("Received resource person info: \n"+resource);
		System.out.println("Role took in his best project: "+resource.getBest().getRole());
	}
}
