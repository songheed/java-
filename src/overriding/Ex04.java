package overriding;

class Test04{
	public void test() {
		System.out.println("부모 실행");
	}
}
class TestClass04 extends Test04{
	public void test() { //부보가 void지만 int를 사용하면 오버라이딩 표시는 사라진다.
						 //오버라이딩에 따라 작은 값은 실행 가능하다.
		System.out.println("자식 실행");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		
	}
}
