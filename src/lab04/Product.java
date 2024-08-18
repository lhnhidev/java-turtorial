package lab04;

public class Product {

	private String name;
	private double price;
	private double tax;
	
	public void nhapThongTin(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	public void xuatThongTin() {
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
		System.out.println("Tax: " + this.tax);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getTax() {
		return this.tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}
}
