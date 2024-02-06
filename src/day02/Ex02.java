package day02;

public class Ex02 {
	public static void main(String[] args) {
		int number = 123;
		System.out.println("변경 전 num : " + number);
		number=100;
		System.out.println("변경 후 num : " + number);
		number = number+ 200;
		System.out.println("변경 후 num :" + number);
		//자료형은 첫번째로 정해주면 된다.
		//대입연산자는 오른쪽에 있는 저장값을 왼쪽 변수에 저장한다.
		//변수는 값을 저장하고 언제든지 변경가능핟.
	}
}
