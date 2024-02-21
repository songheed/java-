package constructor;

import java.util.ArrayList;

class TestClass04{
	public TestClass04(int num) {
		System.out.println("매개변수 받는 생성자");
		//생성자를 만드는 순간 디폴트 생성자는 없어진다.
	}
	public TestClass04() {
		System.out.println("기본 생성자 실행");
	}
	//동일한 메소드의 이름을 사용할 수 있는 것이 오버로딩이다
	//하지만 매개변수는 달라야 한다.
	public void test() {
		System.out.println("test 호출");
	}
	public void test(int num) {
		System.out.println(num + " test 호출");
	}
}

public class Ex04 {
public static void main(String[] args) {
	TestClass04 t = new TestClass04();
	t.test(); t.test(100);
	TestClass04 t2 = new TestClass04(1000);
	//매개변수를 받는 생성자 만들어 실행

	
	ArrayList arr = new ArrayList<>();
	//ctrl + ArrayList<>()클릭
	String s = new String();
	String s1 = new String("값 전달");
	//매개변수받지않는 스트링으로 이동
	
	
}
}
