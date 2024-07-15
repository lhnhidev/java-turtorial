package lab01;

import java.util.Scanner;

public class lab01work01 {
//	Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím. 
//	In ra màn hình với định dạng:
//	<tên_sinh_viên> có điểm = <điểm> 
//	Ví dụ: "Eric" có điểm = 9.6
//	<tên sinh viên>: Eric
//	<điểm> : 10
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String fullName = scanner.nextLine();
		float mark = scanner.nextFloat();
		
		System.out.println(fullName + " have the mark is " + mark);
		
		scanner.close();
	}
}