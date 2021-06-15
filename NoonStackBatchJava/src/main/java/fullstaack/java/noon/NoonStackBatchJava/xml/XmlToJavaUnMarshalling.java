package fullstaack.java.noon.NoonStackBatchJava.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;

public class XmlToJavaUnMarshalling 
{
	public static void main(String[] args) throws JAXBException 
	{
		File file=new File("aravind.xml");
		JAXBContext context=JAXBContext.newInstance(Mobile.class);
		Unmarshaller unmars=context.createUnmarshaller();
		Mobile mob=(Mobile)unmars.unmarshal(file);
		System.out.println("REceived Object from XML is: \n"+mob);
	}
}
