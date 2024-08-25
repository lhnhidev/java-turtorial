package lab06;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class lab06work05 {
//	- Email : cần có ký tự @ và dấu chấm (.) 
//	ví dụ hợp lệ: eric@hoidanit.com.vn 
//	không hợp lệ: abc#blabla (không chứa @ và dấu chấm) 
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		String email = scanner.nextLine();
		
		String regex = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[^\\.]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if (matcher.matches()) System.out.println("Email hợp lệ");
		else System.out.println("Email không hợp lệ");
		
		scanner.close();
	}
	
}
