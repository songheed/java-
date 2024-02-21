package exception;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x ;
	System.out.println("수 입력");
	x = input.nextInt();
	//스트림 ?
	try {
		int result =10/x;
		System.out.println("결과 : result" + result);
		return; //문제가 발생하지 않으면 return에서 빠져나옴
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	} finally {
		input.close(); //마지막에 하는 작업을 넣어준다.
		System.out.println("finally 실행"); //무조건 실행된다. 문제를 발생하더라도 실행된다.
	}
	System.out.println("다음 문장드 실행");
	
}
}
