package inheritance;

class Test09{
	public Test09(String s) {
		System.out.println(s + ": 부모 생성자");
	}
	public Test09() {
		System.out.println("부모 기본 생성자");
	}
}
class TestClass09 extends Test09{
	public TestClass09() {
		System.out.println("기본 생성자 자식");
	}
	public TestClass09(String s) {
//		super(s);
		System.out.println(s+ ": 자식 생성자");
	}
}
public class MainClass09 {
	public static void main(String[] args) {
		TestClass09 tc = new TestClass09("전달");
		TestClass09 tc2 = new TestClass09();
		
	}
}
//생성자를 만들때 오버로딩이 가능하다
//부모도 동일하게 기본 생성자를 넣으면 Error를 줄일수 있다.