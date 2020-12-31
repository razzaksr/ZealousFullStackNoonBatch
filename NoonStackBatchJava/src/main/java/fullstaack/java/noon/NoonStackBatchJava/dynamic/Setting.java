package fullstaack.java.noon.NoonStackBatchJava.dynamic;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set:
 * no duplicates
 * 
 * since no index; get(index), add(index,object), remove(index), 
 * 	set(index,object) we can;t do above operations in set
 * 
 * order cannot be same as inserted, because 
 * HashSet>> random order
 * TreeSet>> Ascending order
 * 
 * methods:
 * add
 * addAll
 * remove(object)
 * removeAll
 * retainAll 
 * contains
 * 
 */

public class Setting 
{
	public static void main(String[] args) 
	{
		HashSet<Character> setOne=new HashSet<>();
		Set<Character> setTwo=new TreeSet<>();
		setOne.add('R');setOne.add('T');setOne.add('O');
		setOne.add('C');setOne.add('O');
		setOne.add('W');System.out.println(setOne);
		setTwo.addAll(setOne);
		System.out.println(setTwo);
		setOne.remove('T');
		setTwo.remove('C');
		System.out.println(setOne+"\n"+setTwo);
		System.out.println(setTwo.contains('T'));
		System.out.println(setOne.contains('T'));
		setOne.retainAll(setTwo);
		System.out.println("Object are:"+setOne);
		setTwo.removeAll(setOne);
		System.out.println("Object are:"+setTwo);
	}
}
