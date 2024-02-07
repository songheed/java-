package if_;

import java.util.Scanner;

public class Quiz4조 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		문제1.
//		1에서부터 6까지의 눈을 가진 주사위를 두명이서 굴려서 승자를 정하는 게임
//		두명이 본인의 [이름]과 [주사위 수]를 입력 
//		출력 ex) [이름]님 승리
//		    	 [이름]님 승리
//		    	 무승부 
//		    	 1~6 사이의 숫자만 입력해주세요
		
//		String name1 , name2;
//		int num1, num2;
//		
//		System.out.println("1. 이름 :");
//		name1 = input.next();
//		System.out.println("2. 이름 :");
//		name2= input.next();
//		
//		
//		System.out.println("1. 주사위 수 입력 ");
//		num1 = input.nextInt();
//		System.out.println("1. 주사위 수 입력 ");
//		num2 = input.nextInt();
//		
//		if(num1 <=0 && num1 > 6 || num2 <=0 && num2 >6) {
//			System.out.println("1~6사이의 숫자를 입력하세요");
//		}else if(num1 > num2) {
//			System.out.println(name1+"님 승리");
//		}else if(num1 == num2) {
//			System.out.println("무승부");
//		}else {
//			System.out.println(name2+"님 승리");
//		}
		
//		=========================================================
		
		
//		문제2. 
//		국어, 영어, 수학 점수를 입력하여 평균 점수와 등급을 출력하는 프로그램을 작성하시오.
//		단,  평균이 100점 초과이거나, 0점 미만인 경우 "잘못입력하셨습니다."를 출력하도록 작성하시오.
//		(A:90점 이상, B:90점 미만 80점 이상, C:80점 미만 70점 이상, D:70점 미만 60점 이상, F:60점 미만)
//		출력 ex ) 국어, 영어, 수학 점수를 입력하세요 > 95 90 85 평균 점수는 90점이며, 등급은 A입니다.
		
//		int n1,n2,n3,avr=0,sum=0;
//		System.out.println("국어 영어 수학 점수를 차례로 입력하시오");
//		n1 = input.nextInt();
//		n2 = input.nextInt();
//		n3 = input.nextInt();
//		sum = n1 + n2 + n3;
//		avr =sum / 3;
//		
//		if(avr >= 90) {
//			System.out.println("평균은 "+avr+"점 이며, 등급은 A입니다");
//		}else if(avr >= 80 && avr < 90) {
//			System.out.println("평균은 "+avr+"점 이며, 등급은 B입니다");
//		}else if(avr >= 70 && avr < 80) {
//			System.out.println("평균은 "+avr+"점 이며, 등급은 C입니다");
//		}else if(avr >= 60 && avr < 70) {
//			System.out.println("평균은 "+avr+"점 이며, 등급은 D입니다");
//		}else if(avr < 60) {
//			System.out.println("평균은 "+avr+"점 이며, 등급은 F입니다");
//		}else if(avr <= 0 && avr >100) {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		
//	========================================================================
		
//		문제3.
//		두 명이 가위, 바위, 보를 입력하여 결과를 출력하는 프로그램을 작성하시오.
//		단, 가위, 바위, 보가 아닌 것을 입력하면 "잘못입력하셨습니다." 출력
//		출력 ex )
//		첫번째 사람 가위 바위 보 입력 :
//		가위
//		두번째 사람 가위 바위 보 입력 :
//		바위
//		두번째 사람 승
		
		String man1, man2;
		
		System.out.println("가위 바위 보 입력 :");
		man1 = input.next();
		System.out.println("가위 바위 보 입력 :");
		man2 = input.next();
		
		
		if("가위".equals(man1) && "가위".equals(man2)){
			System.out.println("무승부");
		}else if("가위".equals(man1) && "보".equals(man2)) {
			System.out.println("첫 번째사람 승");
		}else if("가위".equals(man1) && "바위".equals(man2)) {
			System.out.println("두 번째사람 승");
		}
		if("바위".equals(man1) && "가위".equals(man2)){
			System.out.println("첫번째 사람 승");
		}else if("바위".equals(man1) && "보".equals(man2)) {
			System.out.println("두 번째사람 승");
		}else if("바위".equals(man1) && "바위".equals(man2)) {
			System.out.println("무승부");
		}
		if("보".equals(man1) && "가위".equals(man2)){
			System.out.println("두 번째사람 승");
		}else if("보".equals(man1) && "보".equals(man2)) {
			System.out.println("무승부");
		}else if("보".equals(man1) && "바위".equals(man2)) {
			System.out.println("첫 번째사람 승");
		}
		
		
		
	}

}
