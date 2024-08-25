package lab06;

import java.util.Scanner;
import java.util.ArrayList;
import lab06.Student;

public class lab06work02 {
//	Ví dụ 2: Ứng dụng quản lý sinh viên - Tạo class Student với thuộc tính name, id - Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor) 
//	eg: new Student("Nam", 1); new Student("Eric", 2); 
//	Yêu cầu: tìm và xuất ra: -  các student có tên bắt đầu là "Nguyễn" 
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Student> myArray = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			String name = scanner.nextLine();
			int id = scanner.nextInt();
			scanner.nextLine();
			
			Student st = new Student(name, id);
			myArray.add(st);
		}
		
		for (int i = 0; i < 5; i++) {
			String tmpString = myArray.get(i).getName();
			for (int j = 0; j < tmpString.length(); j++) {
				if (tmpString.charAt(j) == ' ') {
					tmpString = tmpString.substring(0, j);
					break;
				}
			}
			
			if (tmpString.equals("Nguyễn")) {
				myArray.get(i).printInfomation();
			}
		}
		
		scanner.close();
	}
	
}
