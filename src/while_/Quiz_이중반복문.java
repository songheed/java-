package while_;

import java.util.Scanner;

public class Quiz_이중반복문 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
//	2에서 부터 입력된 어떤수까지 내에 있는 소수를 찾는 프로그램 작성
	
	
	
	
	
//	========================================================
//	1~1000사이에 있는 자연수에 대하여 자기 자신의 수를 제외한
//	모든 약수의 합이 자신과 같아지는 수를 구하여라
	int tot=0;
	
	for(int i=1; i<=1000; i++) {
		int sum =0;
		for(int j=1; j<i; j++) {
			if(i % j == 0) {
//				System.out.println(i +"의 약수는 : " +j);
				sum += j;
//				System.out.println("sum : "+sum);
				if(sum == i) {
					tot += sum;
					System.out.println("합 :"+tot);
				}
			}
			
			
			
		}
	}
	
	
	
//	=========================================================
//	별을 마름모모양으로 찍어라.
	
	
}
}
