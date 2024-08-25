package lab06;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class lab06work03 {
//	- Số CCCD : chỉ gồm ký tự số, chứa 12 ký tự, không chứa ký tự là chữ số hoặc ký tự đặc 
//	biệt 
//	Ví dụ hợp lệ: 099145697413 
//	không hợp lệ:  09914569741a (chứa ký tự là chữ số) 
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String id = scanner.nextLine();
		
		String regex = "^\\d{12}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(id);
		
		if (matcher.matches()) System.out.println("Id Hợp lệ");
		else System.out.println("Id không hợp lệ");
		
		scanner.close();
	}
	
}
