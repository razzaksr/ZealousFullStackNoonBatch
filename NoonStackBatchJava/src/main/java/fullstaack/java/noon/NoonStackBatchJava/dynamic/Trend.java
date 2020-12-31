package fullstaack.java.noon.NoonStackBatchJava.dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Trend 
{
	public static void main(String[] args) 
	{
		List<String> house=new Vector<String>();
		/*house=new LinkedList<String>();
		house=new ArrayList<String>();
		house=new Stack<String>();
		*/
		house.add("Razak");house.add("Riyaz");house.add("Zealous");
		house.add("Aravind");house.add("Dinesh");house.add("Balaji");
		house.add("Arunachalam");
		System.out.println(house);
		Collections.reverse(house);
		System.out.println(house);
		Collections.sort(house);
		System.out.println(house);
		Collections.reverse(house);
		System.out.println(house);
	}
}
