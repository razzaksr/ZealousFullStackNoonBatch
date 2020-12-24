package fullstaack.java.noon.NoonStackBatchJava.input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;

public class DealingWithObjectsAndFiles 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		File loc=new File("D:\\jpgms\\razak.doc");
		// Serialization
		/*FileOutputStream fos=new FileOutputStream(loc);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Mobile mob=new Mobile("5s", "Realme", "quad camera", 4, 128, 14999, 20, 5.9F);
		oos.writeObject(mob);
		oos.close();
		fos.close();
		System.out.println(mob.getModel()+" has written in "+loc.getName());*/
		
		// Deserialization
		FileInputStream fis=new FileInputStream(loc);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Mobile temp=(Mobile)ois.readObject();
		ois.close();
		fis.close();
		System.out.println(temp+"\nhas readed from "+loc.getName());
	}
}
