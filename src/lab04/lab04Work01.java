package lab04;

import lab04.Product;

public class lab04Work01 {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.nhapThongTin("Computer", 420, 0.1);
		System.out.println();
		product1.xuatThongTin();
		System.out.println("TaxPrict: " + product1.getTaxPrice(product1.getPrice(), product1.getTax()));
		
		
		Product product2 = new Product();
		product2.nhapThongTin("Inphone", 235, 0.15);
		System.out.println();
		product2.xuatThongTin();
		System.out.println("TaxPrict: " + product2.getTaxPrice(product2.getPrice(), product2.getTax()));
		
	}
	
}
