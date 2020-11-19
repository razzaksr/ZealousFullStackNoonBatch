package fullstaack.java.noon.NoonStackBatchJava.oop;

import java.util.Arrays;

/*
 * Constructor: nothing but special method
 * classname
 * no return
 * 
 * usage:
 * Operation priority
 * members initialization
 * 
 * constructor overloading: same name for multiple blocks distinct by parameters
 * 
 */

public class Kart 
{
	private Long holder;
	private Item[] item=new Item[10];
	private int value;
	
	public Kart() {System.out.println("Kart gonna intiated");}// default cons
	public Kart(Long yet,Item[] hai)// parameterized cons 
	{
		this.holder=yet;this.item=hai;
		calculate();
	}
	@Override
	public String toString() {
		return "Kart [holder=" + holder + ", item=" + Arrays.toString(item) + ", value=" + value + "]";
	}
	public void setHolder(Long holder)// setter
	{this.holder=holder;}
	public Long getHolder() {return this.holder;}//getter
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item[] item) {
		this.item = item;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void calculate()
	{
		for(int index=0;index<item.length&&item[index]!=null;index++)
		{
			value+=item[index].price;
		}
	}
	public void show()
	{
		System.out.println(holder);
		for(int index=0;index<item.length&&item[index]!=null;index++)
		{
			System.out.println(item[index].name+" "+item[index].price);
		}
		System.out.println(value);
	}
}
class Item
{
	String name;
	int price;
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
}