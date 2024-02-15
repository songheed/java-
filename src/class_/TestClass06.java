package class_;

public class TestClass06 {
//	public void sumFunc(int n) {
	public int sumFunc(int n) {
		int sum = 0;
		for(int i =1; i<=n ;i++) {
			sum += i;
		}
		return sum; //연산한 sum값을 보내겠다.
		//또는 메소드를 빠져나가겠다.
		//void위치에 있는 자료형을 문법적으로 맞춰줘야 하다.
	}
//	public void test(int n,String s) {
	public int test(int n,String s) {
		return 100;//을 쓰면 void는 int로변경
	}
}
