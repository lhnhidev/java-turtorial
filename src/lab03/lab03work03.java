package lab03;

import java.util.Scanner;
import java.util.Arrays;

public class lab03work03 {
	public static void main(String[] args) {
//		Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//			- Sắp xếp và xuất mảng vừa nhập ra màn hình
//			- Xuất phần tử có giá trị nhỏ nhất
//			- Xuất phần tử có giá trị lớn nhất

		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		int[] a = new int[n];
		int mx = -99999999;
		int mn = 99999999;
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i : a) {
			mx = (int)Math.max(mx, i);
			mn = (int)Math.min(mn, i);
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		Arrays.sort(a);
		for (int i : a) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		System.out.println("Max = " + mx);
		System.out.println("Min = " + mn);
		
		scanner.close();
	}
}
