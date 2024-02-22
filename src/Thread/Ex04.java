package Thread;
class Test04 extends Thread{
	A04 a;
	public Test04(A04 a, int num) {
		this.a = a;
		System.out.println(num + " -> a : "+ a);
	}
	public void run() {
		a.test();
	}
}


//package Thread;
//class A04{
//	int sum = 1;
//	public void test() {
//		for(int i = 1; i<10 ; i++) {
//			System.out.println(i + " : sum : " +sum);
//			sum+= i;
//		}
//	}
//}

class A04{
	int sum = 1;
	public void test() {
//	public synchronized void test() { //synchronized를 사용해서 스레드의 순서를 정한다.
		for(int i = 1; i<10 ; i++) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " : sum : " +sum);
			sum+=i;
		}
	}
}
public class Ex04 {
	public static void main(String[] args) {
		
		
//		A04 a01 = new A04();
//		A04 a02 = a01; //싱글톤 하나의 객체를 만들어 공유한다.
//		System.out.println("a01 : "+ a01);
//		System.out.println("a02 : "+ a02);
//		a01.sum =12345;
//		System.out.println(a01.sum);
//		System.out.println(a02.sum);
////		a02.sum= 11111;
////		System.out.println(a01.sum);
////		System.out.println(a02.sum);

//		A04 a01 = new A04();
//		A04 a02 = a01;
//		a01.test();
//		System.out.println(a02.sum);
//		a02.test();
//		System.out.println(a02.sum);
//		//스레드로 실행하면 값이 다르게 나타난다.
		
		
		A04 a01 = new A04();
		Test04 t01 = new Test04(a01, 1);
		Test04 t02 = new Test04(a01, 2);
		Test04 t03 = new Test04(a01, 3);
		System.out.println("t01 :"+t01);
		System.out.println("t02 :"+t02);
		System.out.println("t03 :"+t03);
		
		t01.start();		//		t01.run();
		t02.start();		//		t02.run();
		t03.start();		//		t03.run();
		//순차적으로 진행해야할 경우 동기화를 진행해야 한다.
		//스레드의 순서를 정하는 것 synchronized

	}
}
