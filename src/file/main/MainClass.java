package file.main;

import java.util.Scanner;

import file.serivce.ServiceMember;
import file.serivce.ServiceMemberImpl;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	ServiceMember member = new ServiceMemberImpl();
	while(true) {
		System.out.println("1. 회원가입");
		System.out.println("2. 검색");
		System.out.println("3. 회훤 목록보기");
		System.out.println("4. 탈퇴");
		System.out.println("5. 종료");
		System.out.print(">>>>");
		num = input.nextInt();
		switch(num) {
		case 1 : member.register(); break;
		case 2 : 
			member.search();
			break;
		case 3 : 
			member.list();
			break;
		case 4 : 
			member.delete();
			break;
		case 5 : 
			System.out.println("프로그램 종료");
			return;
		}
	}
}
}
