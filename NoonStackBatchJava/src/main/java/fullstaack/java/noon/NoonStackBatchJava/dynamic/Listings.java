package fullstaack.java.noon.NoonStackBatchJava.dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/*
 * Vector
 * ArrayList
 * 
 * add
 * add(pos,object)
 * 
 * set(pos,object)
 * 
 * remove(object)
 * remove(index)
 * 
 * get(index)
 * 
 * retainAll
 * removeAll
 * 
 * 
 * Collections:
 * replaceAll
 * sort
 * reverse
 * max
 * min
 * 
 */

public class Listings 
{
	public static void main(String[] args) 
	{
		ArrayList<String> src1=new ArrayList<String>();
		src1.add("12");src1.add("Riyaz");src1.add("Aravind");
		Vector<String> src2=new Vector<String>();
		src2.addAll(src1);
		src2.add(2, "Mohamed");
		System.out.println(src1+"\n"+src2);
		System.out.println(Collections.max(src1));
		src1.set(1, "Zealous");
		System.out.println(src1+"\n"+src2);
		src1.retainAll(src2);
		System.out.println(src1+"\n"+src2);
		src2.removeAll(src1);
		System.out.println(src2);
		src1.remove(0);
		System.out.println(src2);
	}
}
