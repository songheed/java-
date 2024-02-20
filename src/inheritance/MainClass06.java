package inheritance;
//this와 super 의 차이점 확인
class Test06{
	public void test() {
		System.out.println("부모 test 메소드");
	}
}
class TestClass06 extends Test06{
	public void test() {
//	public void test11111() {
		System.out.println("자식 test 메소드");
	}
	public void display() {
		super.test();
		this.test();
		//super가 없으면 tc자신안에 먼저 찾아서 출력
		//super는 부모 메소드를 출력
	}
}
public class MainClass06 {
public static void main(String[] args) {
	TestClass06 tc = new TestClass06();
	tc.display();
}
}
