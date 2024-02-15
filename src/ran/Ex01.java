package ran;

import java.util.Random;

public class Ex01 {
public static void main(String[] args) {
	//random
	
	
	for(int i=0; i<5 ; i++) {
		System.out.println(Math.random() );
	}
	
	System.out.println("-------");
	for(int i=0; i<5 ; i++) {
		double dou = Math.random() *3;
		System.out.println((int)dou);
	}
//	int로 환산하면 실수값은 없어지고 0~2까지의 3개의 숫자를 뽑을수 있다.
//	Math는 수학과 관련된 기능이 들어있다.
	
	
	System.out.println("=========");
	Random r = new Random();
	for(int i=0; i<5 ; i++) {
		int num = r.nextInt(3); //0~2
		System.out.println(num);
	}
	
}
}
