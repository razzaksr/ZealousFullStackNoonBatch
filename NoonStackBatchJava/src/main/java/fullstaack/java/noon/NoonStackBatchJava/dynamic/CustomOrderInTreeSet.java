package fullstaack.java.noon.NoonStackBatchJava.dynamic;

import java.util.TreeSet;

/*
 * We cannot change treeset order if we deal with in built types such as:
 * Integer, Float, Character and all wrapper type classes
 * 
 * We can change treeset order if we deal with user defined class object 
 * by using Comparable<E>
 * 
 * compareTo()>> order decision
 */

public class CustomOrderInTreeSet 
{
	public static void main(String[] args) 
	{
		Jobcard job1=new Jobcard("Razak Mohamed", 4192L, "Paid", 4000);
		Jobcard job2=new Jobcard("Sabari nathan", 0635L, "Free", 500);
		Jobcard job3=new Jobcard("Karunagaran", 1234L, "Paid", 9000);
		Jobcard job4=new Jobcard("Riyaz", 9737L, "Free", 1000);
		Jobcard job5=new Jobcard("Aravind", 9888L, "Paid", 7100);
		TreeSet<Jobcard> logs=new TreeSet<>();
		logs.add(job1);logs.add(job2);logs.add(job3);logs.add(job4);
		//System.out.println(logs);
		for(Jobcard temp:logs)
		{
			System.out.println(temp);
		}
		System.out.println(logs.contains(job5));
	}
}
class Jobcard implements Comparable<Jobcard>
{
	String customerName;
	Long vehicleNumber;
	String serviceType;
	Integer expectedBill;
	
	@Override
	public int compareTo(Jobcard o) {
		// TODO Auto-generated method stub
		//return this.expectedBill.compareTo(o.expectedBill);
		//return o.serviceType.compareTo(this.serviceType);
		return this.vehicleNumber.compareTo(o.vehicleNumber);
	}
	
	public Jobcard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jobcard(String customerName, Long vehicleNumber, String serviceType, Integer expectedBill) {
		super();
		this.customerName = customerName;
		this.vehicleNumber = vehicleNumber;
		this.serviceType = serviceType;
		this.expectedBill = expectedBill;
	}

	@Override
	public String toString() {
		return "Jobcard [customerName=" + customerName + ", vehicleNumber=" + vehicleNumber + ", serviceType="
				+ serviceType + ", expectedBill=" + expectedBill + "]";
	}

}