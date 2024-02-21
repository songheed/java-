package overloading;

import java.util.ArrayList;

class TestClass01{ //1 매개변수가 없는  -> 2-1
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc(int n) {//3 매개변수가 없는 ->2-2
		System.out.println("n을 가지고 연산합니다.");
	}
	
	public void sumFunc(int n, int num) { //2-3
		System.out.println(n + num + "입니다.");
	}
	public void sumFunc(String n, String num) { //2-4
		System.out.println(n + num + "입니다.");		
	}
	
}


public class Ex01 {
public static void main(String[] args) {
	//2
	TestClass01 t = new TestClass01();
	t.sumFunc(); //2-1
	t.sumFunc(10); //2-2
	t.sumFunc(10,20); //2-3
	t.sumFunc("안녕", "하세요"); //2-4
	
	
	
	
}
}
//파일이나 개수가 다르거나 이름이 다르면 서로다른 파일이라 인식해서 error발생