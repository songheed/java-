//package exception;
//class Test06{
//	public void test1() {
//		System.out.println(1111);
//		test2();
//	}
//	public void test2() throws InterruptedException {
//		System.out.println(22222);
//		Thread.sleep(1000);
//		//예외를 전가하는거다보니 test1()에도 예외처리를 해주어야 한다.
//		//test1()에도 예외처리하면 main에도 예외처리해주어야 한다. t.test1();
//	}
//}
//public class Ex06 {
//public static void main(String[] args) {
////	Thread.sleep(1000);
//	//문제가 발생할 요지가 있는 것은 예외처리해야한다
//	Test06 t = new Test06();
//	t.test1();
//}
//}


package exception;
class Test06{
	public void test1() {
		System.out.println(1111);
		test2();
	}
	public void test2()  {
		System.out.println(22222);
		try { //try catch문을 사용하면 모든 곳에 예외처리하지 않아도 된다.
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
}
public class Ex06 {
public static void main(String[] args) {
//	Thread.sleep(1000);
	//문제가 발생할 요지가 있는 것은 예외처리해야한다
	Test06 t = new Test06();
	t.test1();
}
}
