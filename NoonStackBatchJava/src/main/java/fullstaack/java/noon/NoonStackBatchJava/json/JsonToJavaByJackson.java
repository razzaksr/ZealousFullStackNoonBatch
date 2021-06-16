package fullstaack.java.noon.NoonStackBatchJava.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaByJackson
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		File file=new File("RiyazJackson.json");
		ObjectMapper map=new ObjectMapper();
		Resource resource=(Resource)map.readValue(file, Resource.class);
		System.out.println("Received from JSON: \n"+resource);
	}
}
