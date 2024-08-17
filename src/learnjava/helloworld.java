package learnjava;

import java.util.Scanner;

public class helloworld {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		}
		else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		}
		else {
			System.out.printf("Nghiệm của phương trình là : %.3f\n", (float)b/a * -1);
		}
		
		scanner.close();
	}
}
