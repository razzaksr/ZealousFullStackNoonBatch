package fullstaack.java.noon.NoonStackBatchJava.oop;

//Crudl

public interface Retail 
{
	public void addToStock(Mobile obj);
	public void enquiry(int ram);
	public void enquiry(String brand);
	public void enquiry(String features,int budget);
	public void enquiry(double budget);
	public void discount(int range);
	public Mobile remove(int pos);
	public void list();
	public void sortByBrand();
}
