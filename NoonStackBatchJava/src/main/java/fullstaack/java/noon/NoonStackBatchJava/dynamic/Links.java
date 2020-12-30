package fullstaack.java.noon.NoonStackBatchJava.dynamic;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList: index starts 0
 * add/addLast
 * addFirst
 * add(pos,object)
 * 
 * set(pos,object)
 * 
 * get(index)
 * getFirst
 * getLast
 * 
 * remove/removeFirst
 * removeLast
 * remove(index)
 */

public class Links 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> link1=new LinkedList<Integer>();
		link1.add(12);link1.addLast(98);link1.add(67);link1.add(99);
		link1.add(56);link1.add(12);link1.addFirst(11);link1.add(2,78);
		System.out.println(link1);
		Collections.replaceAll(link1, 12, 44);
		System.out.println(link1);
		link1.set(3, 101);
		System.out.println(link1);
		link1.remove((Object)12);// remove by object data
		System.out.println(link1);
		link1.remove(3);// remove by index
		System.out.println(link1);
		link1.removeFirst();//remove/removeFirst
		System.out.println(link1);
		System.out.println("Removed object is: "+link1.removeLast());
		System.out.println(link1);
		System.out.println(link1.getLast());
		System.out.println(link1.getFirst());
		System.out.println(link1.get(2));
		System.out.println("Traverse by loop");
		for(Integer tmp:link1)
		{
			System.out.println(tmp);
		}
		System.out.println("Traverse by iterator interface");
		Iterator<Integer> it=link1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
