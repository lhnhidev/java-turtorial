package learnjava;

import java.util.Scanner;
import java.util.ArrayList;

public class Test {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
		
		ArrayList<Integer> myArray = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			myArray.add(x);
		}
		
		myArray.remove(2);
		
		for (int x : myArray) {
			System.out.printf("%d ", x);
		}
		
		
		scanner.close();
	}
	
}
