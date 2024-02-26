//package file;
//
//import java.util.Scanner;
//
//public class Ex05 {
//	public static void main(String[] args) {
		//nextLine공백 문제
//		Scanner input = new Scanner(System.in);
//		String s1,s2;
//		System.out.println("1.문자열 입력");
//		s1 = input.next();
//		System.out.println("1.문자열 입력");
//		s2 = input.next();
//		System.out.println("s1 : " +s1);
//		System.out.println("s2 : " +s2);
		//next는공백과 enter를 구분한다. 공백을 
		//nextLine은 enter값을 기준으로 값을 빼내온다.
//		Scanner input = new Scanner(System.in);
//		String s1,s2;
//		System.out.println("1.문자열 입력");
//		s1 = input.next();
//		System.out.println("1.문자열 입력");
//		s2 = input.nextLine();
//		System.out.println("s1 : " +s1);
//		System.out.println("s2 : " +s2);
//		//aaa작성후
//		Scanner input = new Scanner(System.in);
//		String s1,s2;
//		System.out.println("1.문자열 입력");
//		s1 = input.next();
//		System.out.println("1.문자열 입력");
//		input.nextLine();
//		s2 = input.next();
//		System.out.println("s1 : " +s1);
//		System.out.println("s2 : " +s2);
		
package file;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//nextLine공백 문제
		Scanner input = new Scanner(System.in);
		String s1,s2;
		int num;
//		while(true) {
//			System.out.println("수");
//			num = input.nextInt();
//			System.out.println("입력값"+num);
//		}//int,String 형식이 달라도 프로그램을 계속 진행시키고 싶다.
		
		
		while(true) {
			try {
			System.out.println("수");
			num = input.nextInt();
			System.out.println("입력값"+num);
		}catch(Exception e) {
			s1 = input.nextLine();
			System.out.println(s1 + " :수입력");
		}
		
		}
		
		
		
		
		
		
		
		
		
	}
}
