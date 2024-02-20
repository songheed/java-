package inheritance;

import java.util.ArrayList;

class TestClass02 extends ArrayList<String>{
//TestClass02 자식 클래스 ArrayList는 부모 클래스
	public void test() {
		System.out.println("test 메소드 실행");
	}
}
public class MainClass02 {
public static void main(String[] args) {
	TestClass02 tc = new TestClass02();
	//부모의 기능+ 내가 만든 기능을 사용할 수 있다.
	tc.test();
	tc.add("aaa");
	System.out.println(tc.get(0));
}
}
