//package inheritance;
////다중상속은 안되지만 비슷하게 접근할수 있는방법
//class A{
//	public void a() {
//		System.out.println("a 메소드 실행");
//	}
//}
//class B{
//	public void b() {
//		System.out.println("bbbb 메소드 실행");
//	}
//}
//class C{
//	public void c() {
//		System.out.println("cccc 메소드 실행");
//	}
//}
//
//public class MainClass11 {
//public static void main(String[] args) {
////	A a = new A();
////	a.a();
////	B b = new b();
////	b.b();

package inheritance;
//다중상속은 안되지만 비슷하게 접근할수 있는방법 물림상속
class A{
	public void a() {
		System.out.println("a 메소드 실행");
	}
}
class B extends A{
	public void b() {
		System.out.println("bbbb 메소드 실행");
	}
}
//class C extends A,B{
class C extends B{
	public void c() {
		System.out.println("cccc 메소드 실행");
	}
}

public class MainClass11 {
public static void main(String[] args) {
	C c = new C();
	c.c(); c.a(); c.b();

}
}
