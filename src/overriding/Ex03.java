//class에다가 final을 붙여 사용
package overriding;

final class Test03{
	public void test() {
		System.out.println("test03dml test 기능");
	}
}//final이 붙으면 상속받을수 없다고 나타나고 상속을 받으려면 new연산자를 사용해 객체를 만들어야 한다.
class TestClass03 {
	Test03 t = new Test03();
	public void test() {
		System.out.println("class03 test 기능");
	}


//class TestClass03 extends Test03{
//	public void test() {
//		System.out.println("class03 test 기능");
//	}
}
public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
	}
	
}
