package exception;

import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age = 0;
	System.out.println("나이입력 :" );
	try {
		age = input.nextInt();
		if(age < 0) {
			throw new Exception("음수는 안되요");
		}
	}catch(Exception e) {
//		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	System.out.println("당신의 나이는 : " + age);
	//-의 나이는 없기때문에 개발의 의도와는 달라 예외처리 하는데 이때 강제예외처리를 사용한다.
}
}
