package overriding;

import java.util.ArrayList;

class Test02 extends ArrayList<String>{
	public String get(int i) {
		System.out.println( super.get(i));
//		return "";
		return super.get(i); //변수로 저장
	}
	
	@Override
	public boolean add(String e) {
		System.out.println("저장되었습니다.");
		return super.add(e);
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		
		Test02 t = new Test02();
		t.add("111"); //"111"데이터 추가
//		t.get(0); //super가 붙어 부모가 가지고 있는 get을 출력
		t.add("222");
		t.add("333");
		t.get(2);
	}
}
