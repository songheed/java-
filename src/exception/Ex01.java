package exception;
//예외처리
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x, y, result =0;
	System.out.println("수 입력");
	x = input.nextInt();
	y = input.nextInt();
	try {
		System.out.println("try실행");
		result = x/y;		
		System.out.println("정상동작");
		System.out.println("정상동작");
		System.out.println("정상동작");
		}catch(ArithmeticException e) {
			System.out.println("문제 발생");
			System.out.println("0으로 나눌수 없음");
	}
	System.out.println("결과 : " + result);
	

}
}
