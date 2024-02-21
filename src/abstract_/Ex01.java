package abstract_;
abstract class Test01{
//	public void speed() {
//		System.out.println("2024년 속도 기능");
//		//매년마다 사용해야하는 코드를 오버라이딩해서 사용하면 
//	}
	public abstract void speed();
	public void myBreak() {
		System.out.println("멈춤기능");
	}
}
class TestClass01 extends Test01{
	public void speed() {
		System.out.println("2025");
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.speed(); t.myBreak(); t.autoSystem();
	}
}
