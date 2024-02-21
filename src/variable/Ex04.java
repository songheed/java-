package variable;

class Test04{
	public int num; //->인스턴스 변수는 인스턴스가 생기면 생성된다.
	//객체를 만들어야 인스턴스 변수를 사용할 수 있다.
	public static String mag = "연습";
}
public class Ex04 {
	public static void main(String[] args) {
		System.out.println("변경 전 : " +Test04.mag);
		Test04.mag = "1111";
		System.out.println( Test04.mag);
		
		
		
		Test04 t = new Test04();
		t.num = 100;
	}
}
