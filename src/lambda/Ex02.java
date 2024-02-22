package lambda;
interface Test02{
	public void test(); //=>메소드는 1개만
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02() {
			//객채화하는 입장에서 메소드를 정의화해야한다.
			@Override
			public void test() {
				System.out.println("test실행");
				
			}
		};
		t.test();
		System.out.println("---람다---");
		Test02 t02 = ()	-> System.out.println("test 실행22");
		//()메소드를 가리킴
		t02.test();
	}
}
