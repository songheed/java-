package variable;

class Test06{
	public static int su;
	public void test() {
		su = 1234;
	}
	
//	public int num;  //public static int num;
//	public static void test2() {
//		num = 1234;
//		//미리만들어논 static에서 없는값num 을사용하니 error발생
//	}
	
}
public class Ex06 {
	int num;
public void main(String[] args) {
	test1();
	num = 123;
}
public void test1() {
	num = 123;
	System.out.println(num);
}
//public class Ex06 {
//	static int num;
//public static void main(String[] args) {
//	test1();
//	num = 123;
//}
//public static void test1() {
//	num = 123;
//	System.out.println(num);
//}
}






