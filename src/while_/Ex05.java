package while_;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	//연산사는 방법 사용자가 입력한 것을 쪼갠다.
	Scanner input = new Scanner(System.in);
	int i , temp;
	i = input.nextInt();
	System.out.println("수 입력 : ");
	boolean bool = true; //변수를 사용해  참또는 거짓으로 break대신 사용할 수 있다
	while(bool) {
//		System.out.println("while");
		//i = 123
		temp = i%10; //웹페이지 사용할때 응용함
		i= i/10;
		System.out.println(temp + ", ");
		if(i == 0) {
			
//		if(bool) {
//			System.err.println("bool : " +bool);
//			bool = false;
			break;
		}
		System.out.println("while 종속문장");
	}
	System.out.println("다음 문장들 실행 : " +bool);
}
}
//  % 와 /를 이용해서 특정 문자를 입력받고 쪼개었을때 사용한다.