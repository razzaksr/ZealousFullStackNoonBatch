package fullstaack.java.noon.NoonStackBatchJava.oop;

import java.io.Serializable;

public class Mobile implements Serializable, Comparable<Mobile>
{
	private String model,brand,features;
	private int ram,internal,price,qty;
	private float size;
	
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
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getInternal() {
		return internal;
	}
	public void setInternal(int internal) {
		this.internal = internal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		int pos=this.brand.compareTo(o.brand);
		return pos==0?this.brand.compareTo(o.brand):pos;
	}
}
