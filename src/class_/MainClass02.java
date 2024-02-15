package class_;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 tc = new TestClass02();
		int num;
		num = tc.inputTest();
		if( num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		num = tc.inputTest();
		if( num % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님!");
		}
		
		
		/*
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 :");
		num = input.nextInt();
		if( num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		System.out.println("수 입력 :");
		num = input.nextInt();
		if( num % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님!");
		}
		*/
		
		
		
		
	}

}

//독립적인 기능을 가지는 작은 프로그램 .add() , .get() , in.next() 등은 메소드이다.
//중복되는 코드는 method를 활용하면 효율적이다.
//메소드는 만드는 방법이 변수와같다.
//접근제한자 (public private) 반환자료형 (int char ...등) 메소드 이름
//펑션과 메소드의 차이점