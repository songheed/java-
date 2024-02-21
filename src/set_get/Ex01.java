package set_get;
class Test01{
	private int num = 12345;
//	public과 private의 차이점은 t.하면 외부와 내부의정보차이점
	//private으로 만들기
	public void test(int n) {
		num = n;
		//private의 내부에있는 변수라서 사용할 수 있다.
	}
	public int test2() {
		return num;
	}
}
public class Ex01 {
public static void main(String[] args) {
	Test01 t = new Test01();
	t.test(10000);
//	System.out.println(t.num);
	System.out.println(t.test2());
	
	
}
}
