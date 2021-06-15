package fullstaack.java.noon.NoonStackBatchJava.json;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.gson.Gson;

public class JavaToJsonAllTypeByGSON 
{
	public static void main(String[] args) throws IOException 
	{
		Project project=new Project("RTO - Buddy",59,"Team Lead",30,"Tamilnadu Govt");
		Resource resource=new Resource("Aravind", 25, 124500, false, new String[] {"java","SQL","JSP","Servlet"}, project);
		Gson gson=new Gson();
		String data=gson.toJson(resource);
		File file=new File("AravindResource.json");
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(data.getBytes());
		fos.close();
		System.out.println("Resource object written as JSON @ "+file.getAbsolutePath());
	}
}
