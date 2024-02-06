package day02;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final String k="국어 점수", e="영어 점수", m="수학 점수", n="학생 이름";
		String name;
		int kor=0, eig=0, met=0;
		double evr;
		
		System.out.print(n +" : ");
		name = input.next();
		System.out.print(k +" : ");
		kor = input.nextInt();
		System.out.print(e +" : ");
		eig = input.nextInt();
		System.out.print(m +" : ");
		met = input.nextInt();
		int sum =0;
		sum = kor +eig +met;
		evr = sum / 3.0;
		System.out.println("==================학생 정보==================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t");
		System.out.println("-------------------------------------------");
		System.out.println(name+"\t" +kor +"\t" +eig +"\t" +met +"\t" +sum +"\t" +evr);
		
		
	}

}
