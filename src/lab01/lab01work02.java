package lab01;

import java.util.Scanner;

public class lab01work02 {
//	Tính toán và in ra console:
//		- chu vi hình chữ nhật
//		- diện tích hình chữ nhật
//		- cạnh nhỏ nhất của hình chữ nhật
//		- cạnh lớn nhất của hình chữ nhật
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float edgeWidth = scanner.nextFloat();
		float edgeHeight = scanner.nextFloat();
		
		System.out.println("Circumferenct of rectangle is " + (edgeWidth + edgeHeight) * 2);
		System.out.println("Area of rectangle is " + edgeWidth * edgeHeight);
		
		System.out.println("The min edge is " + Math.min(edgeWidth, edgeHeight));
		System.out.println("The max edge is " + Math.max(edgeWidth, edgeHeight));
		
		scanner.close();
	}
}