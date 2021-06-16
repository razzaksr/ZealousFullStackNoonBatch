package fullstaack.java.noon.NoonStackBatchJava.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonByJackson 
{
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		File file=new File("ArunJackson.json");
		Project pro=new Project("irctc", 1000, "QA", 60, "Indian Govt");
		Resource res=new Resource("Arunachalam", 26, 301831, false, new String[] {"JSP","XML","JSON"}, pro);
		
		ObjectMapper map=new ObjectMapper();
		
		map.writeValue(file, res);
		
		System.out.println(file.getAbsolutePath()+" json done");
	}
}
