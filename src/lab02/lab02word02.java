package lab02;

import java.util.Scanner;

public class lab02word02 {
//	Bài 2: Cho phương trình: ax^2 + bx + c = 0
//			Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình 
//			trên
//			Gợi ý:
//			- Nếu a = 0 => làm tương tự ví dụ bài 1
//			- Nếu a # 0:
//			 - Tính delta = b^2 - 4ac.
//			 - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//			 - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//			 - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//			 x1 = (-b + căn(delta))/(2*a)
//			 x2 = (-b - căn(delta))/(2*a)
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a == 0) { 
			if (b == 0 && c == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			}
			else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			float denta = (float) Math.pow(b, 2) - 4 * a * c;
			if (denta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}
			else if (denta == 0) {
				System.out.printf("Phương trình có nghiệm kép : %.3f\n", (float)b/(2*a) * -1);
			}
			else {
				System.out.println("Phương trình có 2 nghiệm phân biệt: ");
				System.out.printf("x1 = %.3f\n", (-b + (float)Math.sqrt(denta)) / (2 * a));
				System.out.printf("x2 = %.3f\n", (-b - (float)Math.sqrt(denta)) / (2 * a));
			}
		}
		
		scanner.close();
	}
}
