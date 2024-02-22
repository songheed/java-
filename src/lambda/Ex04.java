package lambda;
interface Test04{
	public void test();
}
class TestClass04{
	public void testClass(Test04 t) {
		System.out.println("기능 실행합니다");
		t.test();
	}
}


public class Ex04 {
public static void main(String[] args) {
	TestClass04 t01 = new TestClass04();
	
	Test04 t04 = new Test04() {
		
		@Override
		public void test() {
			System.out.println("test 실행합니다.");
		}
	};
	
	t01.testClass(t04);
	
	//값을 한번만 사용하고 쓰지 않을 경우 변수를 만들 필요가 없어 값을 바로 출력하기
	t01.testClass( 
			new Test04() {
				public void test() {
					System.out.println("test111 실행합니다.");
		}
	}
	);
//	String ss = input.next();
//	System.out.println("ss : " + ss);
//	System.out.println("input : " + input.next());
	
	
	System.out.println("-----람다-----");
	Test04 t1 = () -> {
		System.out.println("t1 실행");
	};
	t01.testClass(t1);
	t01.testClass(() -> {
		System.out.println("t121212 실행");
	});
	
	
}
}
