package day01;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(100 + 100);
		System.out.println(1.123 + 3.456);
		
		System.out.println("안녕" + "하세요");
		
		System.out.println("100" + 200);
		//""로 묶이면 문자로 취급해서 붙여서 출력된다.
		
		System.out.println("안녕" +100 +100);
		//실행이 왼쪽부터 시작하기 때문에 안녕과 100이 합쳐저 문자가 되고 다시 100이 합쳐진다.
		System.out.println("안녕" +(100 +100));
		//()를 사용해서 먼저 출력되게 해준다.
		
		
		
		
		
	}
}
