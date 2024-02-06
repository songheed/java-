package day02;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year=0, ber=0, aeg=0;
		
		System.out.print("올해의 년도를 4자리로 입력하세요?");
		year = input.nextInt();
		System.out.print("당신이 태어난 년도를 4자리로 입력하세요?");
		ber = input.nextInt();
		
		aeg = year - ber;
		System.out.println("당신의 나이는 " +aeg +"살 입니다.");
		
		
		double a, b, sum = 0, ans = 0;
		System.out.print("첫 번째 물건의 무게를 입력 하시오?");
		a = input.nextDouble();
		System.out.print("두 번째 물건의 무게를 입력 하시오?");
		b = input.nextDouble();
		sum = a +b;
		ans = 600 - sum;
		System.out.println("현재 엘리베이터에 허용 무게는 "+ ans +"kg 입니다.");
		
		
		
	}
}
