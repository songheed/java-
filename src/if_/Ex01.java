package if_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("1. 쉬운게임");
		System.out.println("2. 어려운게임");
		System.out.println("3. 종료");
		System.out.print(">>>> : ");
		num = sc.nextInt();
		
		if(num == 1)
			System.out.println("쉬운게임을 실행합니다.!!");
		if(num == 2)
			System.out.println("여러움 게임 실행!!");
		if(num == 3)
			System.out.println("게임 종료");
//		해당하는 조건이 참, 거짓인지 확인하고 출력
		
		
	}
}
