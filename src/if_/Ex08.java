package if_;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
//		if - else if
//		다중if문
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num > 100) {
			System.out.println("100보다 큰수");
		}else if(num > 50) {
			System.out.println("50보다 큰수");
		}else if(num > 0) {
			System.out.println("0보다 큰수");
		}else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행");
		
	}
}
//if는 개별적으로 실행하고, else if는 묶음으로 실생