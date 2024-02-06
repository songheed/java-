package day02;

public class Ex08 {
	public static void main(String[] args) {
		int n1 = 9,n2 = 2;
		System.out.println(n1 / n2); //정수/정수 = 몫
		System.out.println(n1 / (double)n2); // 둘중하나라도 실수이면=실수값
		System.out.println(n1 % n2); //나머지 값
		//나머지가 0이면 그 수의 배수이다.
		
		//복합대입 연산자
		System.out.println("====복합대입연산자====");
		n1 = n2 =5;
		n1 += 1;
		System.out.println(n1); //6
		n1 -= 1;
		System.out.println(n1); //5
		n1 *= n2;
		System.out.println(n1); //25
		n1 /= n2;
		System.out.println(n1); //5
		n1 %= n2;
		System.out.println(n1); //0
		
		
//		연산자는 두개 이상의 값은 들어올수 없다.
		System.out.println("====관계연산자====");
		n1 = 5;
		n2 = 2;
		System.out.println(n1 > n2); //t
		System.out.println(n1 <= n2);//f
		System.out.println(n1 == n2);//f
		System.out.println(n1 != n2);//t
		
//		boolean bool = 0;
//		boolean 에 저장할 수 있는 값은 true or false이다.
		boolean bool;
		bool = n1 > n2;
		System.out.println(bool);
		bool = n1 < n2;
		System.out.println(bool);
		
		//논리 연산자 
		//참또는 거짓을 판별
		//여러개의 식을 하나로 묶을 수 있다.
		//!반전
		
		System.out.println("====논리====");
		int n3 = 10;
		n1 = 5; n2 = 7;
		System.out.println(n1> n2 && n1 > n3);
		System.out.println(n2> n1 && n2 > n3);
		System.out.println(n3> n2 && n3 > n1);
		
		System.out.println("---- or ----");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("---- and ----");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("---- not ----");
		System.out.println(!false);
		System.out.println(!true);
		System.out.println(!(10>5));
		
		System.out.println("---- 예제 ----");
		n1 = 10; n2 = 5;
		bool = n1 > n2 && n1 %2 ==0;
		System.out.println(bool);
		
		
		//증감 연산자 자신을 1+하거나 1- 한다.
		System.out.println("==== 증감 연산자 ====");
		n1 = 5;
		++n1;
		System.out.println(n1);
		
		n2 = 5;
		n2++;
		System.out.println(n2);
//		부호가 앞인지 뒤인지에 따라 연산되는 값이 다르다.
		System.out.println("----------");
		n1 = 10;
		n2 = ++n1;
		System.out.println("n1 : " +n1);
		System.out.println("n2 : " +n2);
//		앞쪽에 ++가 붙으면 어떠한 연산보다 면저 +1증가시킨다.
		
		System.out.println("----------");
		n1 = 10;
		n2 = n1++;
		System.out.println("n1 : " +n1);
		System.out.println("n2 : " +n2);
//		뒤에 ++가 붙으면 모든 연산이 끝난 다음에 +1을 증가시켜라
//		다른 연산자와 중복해서 사용하지는 않는다.
		
////		쓸일은 없지만 결과예측해보기
//		int a=5, b=6, c=10, d;
//		d= ++a * b--; //36
//		System.out.println(a +"," +b +"," +d); 
//		
//		d= a++ + ++c - b--; //12
//		System.out.println(a +"," +b +"," +c +"," +d);
		
		
		
		System.out.println("===삼항 연산자(조건연산자) ===");
		n1 = 20;
		n2 = 10;
		String result;
		result = (n1>n2)? "참인 경우" : "거짓인 경우";
		System.out.println(result);
	}
}
