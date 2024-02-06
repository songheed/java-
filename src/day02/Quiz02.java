package day02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name = null;
		int kor=0, enl=0, met = 0, sum=0;
		final String N = "이 름", K="국 어", E="영 어", M = "수 학",S="합 계";

	
		System.out.print("당신의 이름은 무엇입니까 ?");
		name = input.next();
		System.out.print(name+ " 님의 국어 점수 : ");
		kor = input.nextInt();
		System.out.print(name+ " 님이 영어 점수 : ");
		enl = input.nextInt();
		System.out.print(name+ " 님의 수학 점수 : ");
		met = input.nextInt();
		sum = kor + enl + met;

		System.out.println("================");
		System.out.println(N+" : "+name);
		System.out.println("================");
		System.out.println(K+ " : "+kor);
		System.out.println(E+ " : "+enl);
		System.out.println(M+ " : "+met);
		System.out.println("================");
		System.out.println(S+ " : "+sum);
		System.out.println("================");
		
	}
}
