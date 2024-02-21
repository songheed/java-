package singleton;

class Test02{
	int num;
	static int cnt;
	public void Test02() {
		cnt++;
		System.out.println(cnt + " : 객체 생성");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test01 t01 = new Test01();
		Test01 t02 = t01;
		Test01 t03 = t02;
		
		t01.num = 100;
		t02.num = 200;
		t03.num = 300;
		
		System.out.println(t01 + " : " + t01.num);
		System.out.println(t02 + " : " + t02.num);
		System.out.println(t03 + " : " + t03.num);
	//하나의 공간을 공유해서 사용하는 것	
	}
}


//package singleton;
//class Test02{
//	int num;
//	static int cnt;
//	private void Test02() {
//		cnt++;
//		System.out.println(cnt + " : 객체 생성");
//
//		
//	}
//}
//public class Ex02 {
//	public static void main(String[] args) {
//		Test02 t01 = new Test01();
//		Test02 t02 = t01;
//		Test02 t03 = t02;
//		Test02 t04 = new Test02;
//		
//		t01.num = 100;
//		t02.num = 200;
//		t03.num = 300;
//		
//		System.out.println(t01 + " : " + t01.num);
//		System.out.println(t02 + " : " + t02.num);
//		System.out.println(t03 + " : " + t03.num);
//	//하나의 공간을 공유해서 사용하는 것	
//	}
//}