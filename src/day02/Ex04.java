package day02;

public class Ex04 {
	public static void main(String[] args) {
		//형변환
		char ch = 'A';
		System.out.println(ch);
		int num = ch; //char형태가 int로 변환하는 것을 자동형 변환이라함
		System.out.println(num);
		//강제형변환
//		char ch02 = num; //자료형에대한 크기때문에 큰값은 작은 공간에 넣을 수 없다.
		char ch02 = (char)num;
		System.out.println(ch02);
		
		
		//실수
		double d = 1.111;
		float f = 1.111f
				; 
		//기본 실수 값이8바이트여서 float에서 출력할수 없다.
		float f1 = (float)1.111;
	}
}
