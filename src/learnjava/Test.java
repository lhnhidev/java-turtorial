package learnjava;

import java.util.Scanner;
import java.util.ArrayList;

public class Test {
	
	static public class Product {
		
		String name;
		double price;
		
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		public void printProduct() {
			System.out.println(this.name + " " + this.price);
		}
		
	}
	
	public static void main(String[] args) {
		
		Product pd = new Product("iphone", 14.5);
		pd.printProduct();
		
	}
	
}
