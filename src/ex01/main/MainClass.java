package ex01.main;

import java.util.Scanner;

import ex01.service.MemberServiceImpl;
import ex01.service.MemberServie;

public class MainClass {
public static void main(String[] args) {
	//서비스 연동
	Scanner input = new Scanner(System.in);
	MemberServie ms = new MemberServiceImpl();
	int num;
	while(true) {
		System.out.println("1.회원보기");
		System.out.println("2.회원수정");
		System.out.println("3.종료");
		System.out.println(">>> : ");
		num = input.nextInt();
		switch(num) {
		case 1: ms.memberView(); break;
		case 2: ms.modify();break;
		case 3:System.out.println("프로그램 종료"); return;
		}
	}
}
}
