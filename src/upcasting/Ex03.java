package upcasting;
//오브젝트 
class Test{}
public class Ex03 {
	public static void main(String[] args) {
//		int num = 100;
//		String name = "홍길동";
//		System.out.println(num);
//		System.out.println(name);
		
		//공통적인 부모를 가지고 있으면 처리가 가능하다.
		
		Object num = 100;
		Object name = "홍길동";
		System.out.println(num);
		System.out.println(name);
		
		
//		int a = 100 +num; // num을 오브젝트로 받았기때문에 오브젝트와 연산할 수 없어 Error발생
		int a = 100 + (int)num; // 원래 형태로 변환해야 한다. downcasting
		System.out.println(a);
		
	}
}
