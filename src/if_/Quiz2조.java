package if_;

import java.util.Scanner;

public class Quiz2조 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
//		문제 1. 
//		1과목, 2과목, 3과목, 4과목, 5과목 까지 있는 시험을 치른다.
//		한 과목이라도 60점 미만인 경우 "불합격입니다."를 출력하고
//		총점이 400점 이상이면 "합격입니다!"를 출력하시오.

//		int n1,n2,n3,n4,n5, sum =0;
//		System.out.println("5과목의 점수를 입력하세요");
//		n1 = input.nextInt();
//		n2 = input.nextInt();
//		n3 = input.nextInt();
//		n4 = input.nextInt();
//		n5 = input.nextInt();
//		sum = n1+n2+n3+n4+n5;
//		
//		if (n1 > 60 || n2 > 60 || n3 > 60 ||
//				n4 > 60 || n5 > 60) {
//			if(sum >= 400) {
//				System.out.println("합격입니다.!");				
//				}else {
//					System.out.println("불합격 입니다.");
//				}
//		}else {
//			System.out.println("불합격 입니다.");			
//		}
		
		
		
//		=====================================================================
		
//		문제 2.
//		점수와 학년을 입력했을때 합격 불합격 여부
//
//		조건 1) 점수가 60점 이상면 합격 그렇지 않으면 불합격 출력
//		    2)  단, 4학년을 입력했을때는 70점 이상이여야 합격이다
		
//		int p , a;
//		
//		System.out.println("점수를 입력하세요");
//		p = input.nextInt();
//		System.out.println("학년을 입력하세요");
//		a = input.nextInt();
//		
//		if(a == 4) {
//			if(p >=70 ) {
//				System.out.println("합격");
//				}else {
//			System.out.println("불합격");
//			}
//		}else if(p >=60){
//			System.out.println("합격");						
//		}else {
//			System.out.println("불합격");									
//		}
		
		
//		===================================================================
		
//		문제 3.
//		연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		
//		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
//		1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
//		하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//		입력)
//		첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//		출력)
//		첫째 줄에 윤년이면 1, 아니면 0을 출력한다
//		예시 )
//		예제 입력) 2000       예제 출력) 1
//		예제 입력) 1999       예제 출력) 0
//		예제 입력) 1900       예제 출력) 0
//		예제 입력) -500        예제 출력) 1~4000사이를 입력하세요
		
		
		int year =0;
		System.out.println("연도를 입력하세요: ");
		year = input.nextInt();
		
		if(year >= 1 && year <= 4000) {
			if(year % 4 == 0 ){
				if(year % 400 == 0 && year % 100 != 0){
					System.out.println("1");
				}
			}else {
				System.out.println("0");
			}
		}else {
				System.out.println("1~4000사이를 입력하세요");
			}
		
		
		
		
		
		
		
		
	}
}
