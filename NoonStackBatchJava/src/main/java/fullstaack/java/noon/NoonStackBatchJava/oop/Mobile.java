package fullstaack.java.noon.NoonStackBatchJava.oop;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fullstaack.java.noon.NoonStackBatchJava.gui.View;

@XmlRootElement
public class Mobile implements Serializable, Comparable
{
	private String model,brand,features;
	private Integer ram,internal,price,qty;
	private Float size;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String model, String brand, String features, int ram, int internal, int price, int qty, float size) {
		super();
		this.model = model;
		this.brand = brand;
		this.features = features;
		this.ram = ram;
		this.internal = internal;
		this.price = price;
		this.qty = qty;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", features=" + features + ", ram=" + ram + ", internal="
				+ internal + ", price=" + price + ", qty=" + qty + ", size=" + size + "]";
	}
	public String getModel() {
		return model;
	}
	@XmlAttribute
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	@XmlElement
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFeatures() {
		return features;
	}
	@XmlElement
	public void setFeatures(String features) {
		this.features = features;
	}
	public int getRam() {
		return ram;
	}
	@XmlElement
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getInternal() {
		return internal;
	}
	@XmlElement
	public void setInternal(int internal) {
		this.internal = internal;
	}
	public int getPrice() {
		return price;
	}
	@XmlElement
	public void setPrice(int price) {
		this.price = price;
	}
	public float getSize() {
		return size;
	}
	@XmlElement
	public void setSize(float size) {
		this.size = size;
	}
	public int getQty() {
		return qty;
	}
	@XmlElement
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int compareTo(Object o) 
	{
		/*String com=((Mobile)o).getBrand();
		return this.brand-com;*/
		if(View.field.equals("Brand"))
		{
			return this.brand.compareTo(((Mobile)o).brand);
		}
		else if(View.field.equals("Model"))
		{
			return this.model.compareTo(((Mobile)o).model);
		}
		else if(View.field.equals("Ram"))
		{
			return this.ram.compareTo(((Mobile)o).ram);
		}
		else if(View.field.equals("Display Size"))
		{
			return this.size.compareTo(((Mobile)o).size);
		}
		else if(View.field.equals("Internal"))
		{
			return this.internal.compareTo(((Mobile)o).internal);
		}
		else if(View.field.equals("Price"))
		{
			return this.price.compareTo(((Mobile)o).price);
		}
		else if(View.field.equals("Quantity"))
		{
			return this.qty.compareTo(((Mobile)o).qty);
		}
		else
		{
			return 0;
		}
	}
}
