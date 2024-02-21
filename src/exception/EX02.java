package exception;

import java.util.Scanner;

public class EX02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;	
		while(true) {
				System.out.println("수 입력");
				num = input.nextInt();
				try {
					System.out.println("결과 : " +(100/num));
				}catch(Exception e) {
//					System.out.println("0입력하면 안되요");
//					System.out.println(e);//현재 가지고 있는 문제확인
					System.err.println("에러 :" +e);
				}
		}
}
}
