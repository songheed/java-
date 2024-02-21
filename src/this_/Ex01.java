package this_;

class Test01{
	public int num = 12345;
	public void test() {
//		int num = 33333; //num값이 있을때와 없을때의 차이점
		System.out.println("this : " +this);
		//메소드를 만들면 this는 자동으로 생성
		System.out.println("this : " +this.num);
		System.out.println("num : " +num); 
		//모든 값들은 자기자신의 위치를 우선시한다.
		//그냥 변수를 사용하면 자신의 정보를 먼저 찾는다.
	}
}
public class Ex01 {
public static void main(String[] args) {
	Test01 t = new Test01();
	System.out.println("main : " + t);
//	main : this_.Test01@2133c8f8 ->t의 저장소의 위치 정보
	System.out.println("main num : " +t.num);
	
	t.test();
	//this와 t의 값이 동일하다.
	//this 자신의 정보를 가지고 있다. 
}
}
