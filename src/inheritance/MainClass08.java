//package inheritance;
//
//class Test08{
//	public Test08(String s) {
//		System.out.println(s + "부모 생성자 실행");
//	}
//}
//class TestClass08 extends Test08{
//	//상속은 이전에 만들어논 클래스를 그대로 사용하는 것
//	public TestClass08() { 
//		System.out.println("자식 생성자 실행");
//	}
//}
//public class MainClass08 {
//public static void main(String[] args) {
//	
//}
//}
//부모생성자엣는 String s 값을 받고자하는데 자식 클래스에서는 전달할 값이 없어 Error발생
//super는 무조건 생성자 첫재줄에 넣어야 한다.***

package inheritance;

class Test08{
	public Test08(String s) {
		System.out.println(s + "부모 생성자 실행");
	}
}
class TestClass08 extends Test08{
	//상속은 이전에 만들어논 클래스를 그대로 사용하는 것
	public TestClass08() { 
		super("값 전달");
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass08 {
public static void main(String[] args) {
	
}
}