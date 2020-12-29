package fullstaack.java.noon.NoonStackBatchJava.dynamic;

import java.util.Stack;

/*
 * Stack: Last In First Out
 * push
 * pop
 * peek
 * search
 * clear
 * 
 */

public class Differ 
{
	public static void main(String[] args) 
	{
		Stack stkOne=new Stack();// generics
		stkOne.push(12);stkOne.push(1.2);stkOne.push('h');
		stkOne.push("Zealous");stkOne.push(true);
		System.out.println(stkOne);
		Object obj=stkOne.pop();
		System.out.println(obj);
		System.out.println(stkOne.peek());
		System.out.println(stkOne.search('h'));
		System.out.println(stkOne.search(1.2));
		System.out.println(stkOne.search(false));
		stkOne.clear();
		System.out.println(stkOne);
		System.out.println(stkOne.isEmpty());
	}
}
