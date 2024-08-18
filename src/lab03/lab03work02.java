package lab03;

import java.util.Scanner;
import java.util.Arrays;

public class lab03work02 {
	
	public static void main (String[] args) {
//		Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(n + " * " + i + " = " + (n * i));
			
		}
		
		scanner.close();
	}
	
}
