package if_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		
		
//		if(num > 10)
//			System.out.println("1.종속문장실행");
//		System.out.println("2.종속문장실행");
//		System.out.println("3.종속문장실행");
//		System.out.println("다음 문장들 실행!");
////		if을 {}로 묶지 않으면 if문 다음문장만을 종속문장으로 인식한다.
		
		if(num > 10) { //해당문장이 거짓이면 종속문장은 실행되지 않는다.
			System.out.println("1.종속문장실행");
			System.out.println("2.종속문장실행");
			System.out.println("3.종속문장실행");
		}
		System.out.println("다음 문장들 실행!");
		
	}
}
