package interface_;
class A04{
	public void aaa() {}
}
class B04 extends A04{
	public void aaa() {}
	public void bbb() {}
	public void ccc() {}
	
}
public class Ex04 {
	public static void main(String[] args) {
//		B04 b = new B04();
//		b.
		A04 b = new B04();
		//자식안의 메소드라도 부모안의 메소드만 보이고 자식이 가지고 있는 메소드는 사용할 수 없다.
	}
}
