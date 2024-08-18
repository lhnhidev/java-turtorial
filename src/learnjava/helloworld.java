package learnjava;

import java.util.Arrays;
import java.util.Scanner;

public class helloworld {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int[] myArray = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nhập phần tử thứ " + i + ": ");
			myArray[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Phần tử thứ " + i + ": ");
			System.out.println(myArray[i]);
		}
		
		scanner.close();
	}
}
