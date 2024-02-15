package class_;

public class MainClass03 {
public static void main(String[] args) {
	TestClass03 t = new TestClass03();
	System.out.println("main 시작");
	t.test();
	//메소드의 호출이 일어남
	//03의 class로 가서 출력후 다시 main으로 돌아옴
	System.out.println("main 종료");
}
}
