package learnjava;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		Integer[] myArray = new Integer[n];
		
		for (int i = 0; i < n;  i++) {
			myArray[i] = scanner.nextInt();
		}
		
		Arrays.sort(myArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(myArray));
		
		scanner.close();
	}
	
}
