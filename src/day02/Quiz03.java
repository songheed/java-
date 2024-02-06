package day02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2 = 0, sum, mul;
		String re,u, p;
		
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		sum = num1 % 2;
		re = (sum == 0)? "짝수" : "홀수";
		System.out.println(num1 +"=" +re);
		
		mul = num1 % 3;
		u = (num1 == 0)? "3의 배수이다." : "3의 배수가 아니다.";
		System.out.println(num1 +"=" +u);
		
		System.out.print("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		p = (num1 > num2)? "num1이 num2보다 크다" : "num2가 num1보다 크다";
		
		System.out.println("num1 : " +num1 +" ," +"num2 : " +num2);
		System.out.println(p);
		
	}
}
