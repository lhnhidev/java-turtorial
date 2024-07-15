package lab01;

import java.util.Scanner;

public class lab01work03 {
//	 Viết chương trình nhập vào bàn phím cạnh của một khối lập phương. 
//	 Tính và xuất ra thể tích của hình lập phương.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float edge = scanner.nextFloat();
		System.out.println("Volumn of cube is " + Math.pow(edge, 3));
		
		scanner.close();
	}
}