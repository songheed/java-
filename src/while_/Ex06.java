package while_;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String name1, name2;
	System.out.println("1이름 입력");
	name1 = input.next();
	System.out.println("2이름 입력");
	name2 = input.next();
	
	System.out.println("n1 == n2 => " + (name1 == name2));
	System.out.println("n1.equals(n2) => " +(name1.equals(name2)));
	if(name2.equals(name1)) {
		System.out.println("이름이 같다.");
	}else {
		System.out.println("다른 이름!");
	}
}
}
//문자열을 비교할 때는 ==로 비교할 수 없다.
//문자열을 비교할 때는 .equals로 비교할 수 있다.
