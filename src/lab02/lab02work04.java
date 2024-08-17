package lab02;

import java.util.Scanner;

public class lab02work04 {
//	Bài 4: Viết chương trình tổ chức menu:
//		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//		System.out.println("++ ----------------------------------------- ++");
//		System.out.println("| 1. Giải phương trình bậc nhất |");
//		System.out.println("| 2. Giải phương trình bậc hai |");
//		System.out.println("| 3. Tính số tiền điện |");
//		System.out.println("| 4. Kết thúc |");
//		System.out.println("++ ------------------ ++");
//		Yêu cầu:
//		- Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên
	public static void main (String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất               |");
		System.out.println("| 2. Giải phương trình bậc hai                |");
		System.out.println("| 3. Tính số tiền điện                        |");
		System.out.println("| 4. Kết thúc                                 |");
		System.out.println("++ ----------------------------------------- ++");
		
		Scanner scanner = new Scanner (System.in);
		
		while (true) {
			int option = scanner.nextInt();
			int a, b, c;
			switch (option) {
			case 1:
				a = scanner.nextInt();
				b = scanner.nextInt();
				
				if (a == 0 && b == 0) {
					System.out.println("Phương trình có vô số nghiệm");
				}
				else if (a == 0 && b != 0) {
					System.out.println("Phương trình vô nghiệm");
				}
				else {
					System.out.printf("Nghiệm của phương trình là : %.3f\n", (float)b/a * -1);
				}
				break;
			case 2:
				a = scanner.nextInt();
				b = scanner.nextInt();
				c = scanner.nextInt();
				
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
				break;
			case 3: 
				int electric = scanner.nextInt();
				if (electric < 100) {
					System.out.println("Tiền điện = " + electric * 1000);
				}
				else {
					System.out.println("Tiền điện = " + ((electric - 100) * 1500 + 100 * 1000));
				}
				break;
			default:
				System.out.println("Bạn đã kết thúc chương trình!");
				System.exit(0);
			}
		}
	}
}
