package collection.main;

import java.util.Scanner;

import collection.dao.MemberDAO;
import collection.service.MemberService;
import collection.service.MemberServiceImpl;

public class MainClass {
//기본적인 흐름(틀) 생성
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		MemberService ms = new MemberServiceImpl();
		while (true) {
			System.out.println("1.회원관리");
			System.out.println("2.로그인기능");
			System.out.println("3.종료");
			System.out.print(">>>");
			num = input.nextInt();
			switch(num) {
			//기능별로 파일을 나눈다.
			case 1 : 
				ms.display();
//				ms.register();
				break;
			case 2 : 
				ms.memberViews();
				break;
			case 3 : 
				break;
			}
		}
	}
}
