package class_;

public class MainClass01 {
public static void main(String[] args) {
	TestClass01 tc = new TestClass01();
	//tc라는 객체는 testClass안에있는 값을 사용할 수 있다.
//	tc.점을 찍으면 만든것(변수)들이 보인다.
	tc.name = "홍길동";
	tc.age = 20; //testclass에 public age를 private으로 변경하면 mainclass의 age 는 error남
	System.out.println("이름 : " + tc.name);
	System.out.println("나이 : " + tc.age);
	
	
}
}
