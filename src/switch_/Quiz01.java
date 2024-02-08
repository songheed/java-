package switch_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String home=null, offi=null;
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = input.nextInt();
			
			switch(num) {
			case 1 : System.out.println("우리집 목적지 입력 : ");
			home = input.next();
			System.out.println("등록성공");break;
			case 2 : System.out.println("회사 목적지 입력 : ");
			offi = input.next();
			System.out.println("등록 성공");break;
			case 3 : System.out.println("우리집 : "+home +"\n"+"회사 : "+offi);break; 
			}
			
		}
		
		
		
	}
}
