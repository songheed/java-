//동작하는 부분을 나누어서 실행할 수있다.
//하지만 동시에 2가지를 처리할 수 없다.
//package Thread;
//
//class A01{
//	public void run() {
//		for(int i = 0; i<100 ; i++)
//			System.out.println("i : " + i);
//	}
//}
//class B01{
//	public void run() {
//		for(int k = 0; k<100 ; k++)
//			System.out.println("k : " + k);
//	}
//}
//public class Ex01 {
//	public static void main(String[] args) {
//		A01 a = new A01();
//		B01 b = new B01();
//		a.run();
//		b.run();
//		//i의 값이 99까지 출력한뒤 k의 값이 출력된다.
//		//i의 값이 끝나기전까지는 k는 실행되지 않는다.
//	}
//}


package Thread;

class A01 extends Thread{
	public void run() {			 //run을 오버라이딩 해야한다.
								 //run메소드를 사용해야 스레드를 사용할수 있다.
		//sleep(1000);
		for(int i = 0; i<100 ; i++)
			System.out.println("i : " + i);
	}
}
class B01 extends Thread{
	public void run() {
		for(int k = 0; k<100 ; k++)
			System.out.println("k : " + k);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		a.start();
		b.start();
		
	}
}
