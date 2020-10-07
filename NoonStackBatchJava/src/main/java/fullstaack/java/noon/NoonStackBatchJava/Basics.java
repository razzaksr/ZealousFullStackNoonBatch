package fullstaack.java.noon.NoonStackBatchJava;

/*
 * data types: size and format
 * short(2), int(4), long(8) >> whole numbers
 * float(4), double(8) >> fractional/decimal point numbers 
 * char(2)>> 'A' '7' '$'
 * byte(1)>> ascii+uni
 * boolean>> true/false
 * 
 * var:
 * type identifier=value
 * 
 * Occupies space in Compile time
 * 
 * 
 * String>> class
 */

public class Basics 
{
	public static void main(String[] args) 
	{
		//System.out.println("Going to store Riyaz laptop details");
		short ram=4;float size=17.1F;String model="Toshiba c850";
		double cost=32750.89;
		System.out.print("Riyaz Conforms laptop such as:");
		/*System.out.println("Model Name is: "+model+" Monitor size: "+
		size+" Ram Capacity in GB: "+ram+" laptop cost: "+cost);*/
		System.out.printf("Model Name is: %s Monitor Size: %.1f RamCapacity in GB: %d Price is: %.3f"
				,model,size,ram,cost);
	}
}
