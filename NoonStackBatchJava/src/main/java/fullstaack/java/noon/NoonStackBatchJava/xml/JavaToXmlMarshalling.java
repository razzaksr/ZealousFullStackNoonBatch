package fullstaack.java.noon.NoonStackBatchJava.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;

public class JavaToXmlMarshalling 
{
	public static void main(String[] args) throws JAXBException, IOException 
	{
			File file=new File("Riyaz.xml");
			JAXBContext context=JAXBContext.newInstance(Mobile.class);
			Marshaller mars=context.createMarshaller();
			mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Mobile mobile=new Mobile("5S", "Realme", "Camera", 4, 128, 11000, 10, 5.5F);
			mars.marshal(mobile, new FileOutputStream(file));
			System.out.println("Xml has created @ "+file.getAbsolutePath());
	}
}
