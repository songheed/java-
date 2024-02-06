package day02;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hei;
		double ans =0;
		System.out.print("키를 입력하세요?");
		hei = input.nextInt();
		ans =(hei - 100)*0.9;
		System.out.println("표준 체중은 " +ans +"입니다.");
	
		System.out.println();
		int kg;
		double hb=0;
		System.out.print("키를 입력하세요?");
		hei = input.nextInt();
		System.out.print("현재체중을 입력하세요?");
		kg = input.nextInt();
		
		hb = (kg / ans)*100;
		System.out.println("표준체중은" +ans +"이고 비만도는" +hb +"입니다.");
	
	
	
	
	}
}
