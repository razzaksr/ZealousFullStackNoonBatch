package hai;

public class Product 
{
	private String name;
	private int price,qty;
	private double netwt;
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", qty=" + qty + ", netwt=" + netwt + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price, int qty, double netwt) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.netwt = netwt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getNetwt() {
		return netwt;
	}
	public void setNetwt(double netwt) {
		this.netwt = netwt;
	}
}
