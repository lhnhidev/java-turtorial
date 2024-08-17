package lab02;

import java.util.Scanner;

public class lab02work03 {
//	Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
//	Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//	- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//	- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
//	Khóa Học Java Core - Youtube Channel ‘Hỏi Dân IT’
//	29
//	Gợi ý:
//	- Nếu số điện <= 100 => số tiền = số điện x 1000
//	- Nếu số điện > 100
//	=> số tiền = 100 * 1000 + (số điện - 100) * 1500
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int electric = scanner.nextInt();
		if (electric < 100) {
			System.out.println("Tiền điện = " + electric * 1000);
		}
		else {
			System.out.println("Tiền điện = " + ((electric - 100) * 1500 + 100 * 1000));
		}
		
		scanner.close();
	}
}
