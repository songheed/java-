//package Thread;
//
//import java.util.Scanner;
//
//class A03 extends Thread{
//	public void run() {
//		for(;;) {
//			System.out.println("문자가 날라왔습니다.");
//				//sleep();을 작성후 마우스 올려 try catch선택
//			try {
//				sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//public class Ex03 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String str;
//		A03 a = new A03();
//		a.start();		 //start를 만나 스레드가 하나 더 생성된다.
//		while(true) {
//			System.out.println("문자열 입력 : ");
//			str = input.next();
//			System.out.println("입력한 값 :" +str);
//		}
//	}
//}

//setDaemon 사용
package Thread;

import java.util.Scanner;

class A03 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("문자가 날라왔습니다.");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		A03 a = new A03();
		a.setDaemon(true); //setDaemon 
		a.start();
		while(true) {
			System.out.println("문자열 입력 : ");
			str = input.next();
			System.out.println("입력한 값 :" +str);
			if(str.equals("end")) {
				System.out.println("종료합니다.");
				break;
			}
		}
		System.out.println("main이 종료 됩니다.");
		//메인프로그램이 종료되면 포함된 프로그램도 종료되어야하는데 이때 사용하는 것이 setDaemon이다.
	}
}