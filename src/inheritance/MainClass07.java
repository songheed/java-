package inheritance;

class Test07{
	public Test07() {
		System.out.println("부모 생성자 실행");
	}
}
class TestClass07 extends Test07{
	public TestClass07() {
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass07 {
public static void main(String[] args) {
	TestClass07 tc = new TestClass07();
}
}
//자식을 찾아갔는데 상속을 받았으면 부모클래스 먼저 실행 이후 자식클래스 실행