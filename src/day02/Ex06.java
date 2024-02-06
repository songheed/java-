package day02;

import java.util.Scanner;
//import는 특정기능을 현제 스테이지로 가지고 온다.

//Scanner 자료형 input변수이름
public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//new 객체생성
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next();
		
		System.out.print("수 입력 : ");
		num = input.nextInt(); //nextInt 정수
		
		System.out.println("이름 : " +name);
		System.out.println("입력 수 : " +num);
		
		double dou;
		System.out.println("실수 입력");
		dou = input.nextDouble();
		System.out.println("실수 : " +dou);
	
	}
}
