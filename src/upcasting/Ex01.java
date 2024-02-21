package upcasting;

class A01{
	public void test() {
		System.out.println("aaaaa");
	}
}
class B01 extends A01{
	public void test() {
		System.out.println("bbbbbb");
	}
}
class C01 extends A01{
	public void test() {
		System.out.println("ccccc");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A01 a;
		a = new B01(); a.test();
		a = new C01(); a.test();
		
		
//		B01 b;
//		C01 c;
//		b = new B01(); b.test();
//		c = new C01(); c.test();
		
		
		
	}
	//casting = 형변환이다.
	//높은 쪽으로 형변환 upcasting
	//낮은 쪽으로 형변환 downcasting
}
