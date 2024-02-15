package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	for(int i=0; i<3; i++) {
		System.out.println(i + 1 + ".번째 메뉴 등록");
		//String menu = input.next();
		arr.add(input.next());
	}
	System.out.println("=== 등록된 메뉴 ===");
	System.out.println(arr);
	System.out.println("========");
	System.out.println("수정할 메뉴 입력");
	String search = input.next();
	System.out.println(arr.contains(search));
	System.out.println(arr.indexOf(search));
	System.out.println("---------------------");

}
}
