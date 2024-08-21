package lab05;

import java.util.Scanner;
import java.util.ArrayList;

public class lab05work01 {
//	Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa 
//	nhập và tính tổng của nó
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Double> myArray = new ArrayList<>();
		
		while (true) {
			System.out.println("Do you want to continue? Y/N ???");
			String userAnswer = scanner.nextLine();
			
			if (userAnswer.equals("y") || userAnswer.equals("Y")) {				
				System.out.printf("Your number is: ");
				double number = scanner.nextDouble();
				scanner.nextLine();
				myArray.add(number);
			}
			else if (userAnswer.equals("n") || userAnswer.equals("N")) {
				break;
			}
		}
		
		double res = 0;
		for (int i = 0; i < myArray.size(); i++) {
			res += myArray.get(i);
		}
		System.out.println("Your ans is: " + (res / myArray.size()));
		
		scanner.close();
	}
	
}
