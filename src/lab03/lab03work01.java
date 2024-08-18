package lab03;

import java.util.Scanner;
import java.util.Arrays;

public class lab03work01 {
	
	public static void main (String[] args) {
//		Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
//		nguyên tố hay không ?
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(n + " không phải là số nguyên tố!");
				System.exit(0);
			}
		}
		
		if (n > 1)
			System.out.println(n + " là số nguyên tố");
		else 
			System.out.println(n + " không phải là số nguyên tố!");
		scanner.close();
	}
	
}
