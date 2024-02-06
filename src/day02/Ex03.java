package day02;

public class Ex03 {
	public static void main(String[] args) {
		char ch = 'A'; //""는 문자열을 작성할때 사용한다.
		int num = 5;
		int ret;  //변수는 저장되지만 값은 존재하지 않음 (값을 출력할 수 없음)
		ret = ch + num;
		System.out.println("A + 5 = "+ret);
		System.out.println("ch : " +ch);
		System.out.println("num : " +num);
		
		
		
//		문자열
		String str = "hello";
		System.out.println("변경 전 str : "+ str);
		str = "test";
		System.out.println("변경 후 str : "+ str);
		
	}
}
