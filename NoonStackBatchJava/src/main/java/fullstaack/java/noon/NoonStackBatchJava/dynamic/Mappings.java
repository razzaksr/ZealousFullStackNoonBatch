package fullstaack.java.noon.NoonStackBatchJava.dynamic;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/*
 * Map:<key,value>: key: index, value: object
 * HashMap: asynchronized,10bits, Hashtable:synchronized, 11 bits 
 * TreeMap: Ascending based on key
 * 
 * put(k,v)
 * putAll
 * 
 * get(k)
 * 
 * containsKey
 * containsValue
 * 
 * remove(k)
 * 
 * keys()
 * 
 * values()
 * 
 */

public class Mappings 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> term=new Hashtable<>();
		term.put(100, "Riyaz");term.put(920, "Arun");
		term.put(120, "Aravind");term.put(98, "Riyaz");
		System.out.println(term);
		term.put(920, "Shabeer");
		System.out.println(term);
		term.remove(98);
		System.out.println(term.containsKey(98));
		System.out.println(term.containsValue("Riyaz"));
		System.out.println(term.get(920));
		Map<String,Long> contact=new TreeMap<String, Long>();
		contact.put("Sasikumar", 9876556765L);
		contact.put("Albertkumar",123432343L);
		contact.put("Venkatkumar", 4567898778L);
		contact.put("Vikaykumar", 10399933321L);
		System.out.println(contact);
		System.out.println(contact.keySet());
		System.out.println(contact.values());
	}
}
