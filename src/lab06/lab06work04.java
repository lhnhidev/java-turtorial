package lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class lab06work04 {
//	- Mật khẩu: có ít nhất 6 ký tự 
//	ví dụ hợp lệ: 123456 
//	không hợp lệ: 12345 (chứa 5 ký tự) 
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String password = scanner.nextLine();
		
		String regex = "^.{6,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		
		if (matcher.matches()) System.out.println("Password Hợp lệ");
		else System.out.println("Password không hợp lệ");
		
		scanner.close();
	}
	
}
