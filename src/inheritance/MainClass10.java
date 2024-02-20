package inheritance;

class Test10{
//	public int num = 1000;
//	private int num = 1000;//외부의 접근을 막아 Error발생
	protected int num = 1000;//외부의 접근은 막아지만 상속받은 자식클래스는 허용
	
}
class TestClass10 extends Test10{
	public int num = 12345;
	public void test() {
		System.out.println("num : " +num);
		System.out.println("this.num : " +this.num);
		System.out.println("super.num : " +super.num);
	}
}
public class MainClass10 {
public static void main(String[] args) {
	TestClass10 tc = new TestClass10();
	tc.test();
	
	
	
}
}
