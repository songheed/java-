package overriding;
//오브젝트
class Test05{
	
}
public class Ex05 {
	public static void main(String[] args) {
		Test05 t = new Test05();
		//class에 기능을 만들기 않고도 기능들이 뜨는것을 오브젝트가 가지고 있는 기능이다.
		
		System.out.println("aaa".getClass());
		System.out.println(t.getClass());
		//기본 자료형을 알려준다.
		System.out.println(t.toString());
		System.out.println(t); //값이 동일하게 출력
		
	}
}
