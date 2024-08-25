package lab06;

import java.util.Scanner;

public class lab06work01 {
//	Ví dụ 1: Nhập username và password từ bàn phím. Nếu username = "hoidanit" và 
//	password > 6 ký tự thì hợp lệ 
//	gợi ý: sử dụng equals để so sánh; length để check chiều dài
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String username = scanner.nextLine();
		String password = scanner.nextLine();
		
		if (username.equals("Le Hoang Nhi") && password.length() > 6) {
			System.out.println("Hợp lệ");
		}
		else {
			System.out.println("Không hợp lệ");
		}
		
		scanner.close();
	}
	
}
