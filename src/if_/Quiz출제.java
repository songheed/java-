package if_;

import java.util.Scanner;

public class Quiz출제 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("년도 입력 : ");
//		int year;
//		year = input.nextInt();
//		if(year % 400 == 0) {
//			if(year % 100 != 0 && year % 4 ==0) {
//				System.out.println("윤년 입니다");
//			}
//		else {
//			System.out.println("평년 입니다.");
//		}
//		}
		
		
		
		
		int age , mon;
		
		System.out.println("나이 입력 : ");
		age = input.nextInt();
		
		System.out.println("금액 입력 : ");
		mon = input.nextInt();
		
		
		
		if(age >= 10 && age <=15) {
			if(mon >= 13000) {
				System.out.println("어린이표 구매");	
			}else{
				System.out.println("표를 구매할 수 없습니다.");
			}
  		}
		if(19 <= age) {
			if(mon >=15000) {
			System.out.println("성인표 구매");
			}
			else {
			System.out.println("표를 구매할 수 없습니다.");
			}
		}
		
		
		
		
		
	}
}
