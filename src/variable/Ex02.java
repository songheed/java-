package variable;
//인스턴스변수
class Test02{
	public int num; //객체가 사라지기 전까지 존재할 수 있다.
	
	public void test1() //일회용
	{//특정 지역에서 사용할 경우 지역변수
		num = 100;
		System.out.println("test1 : " +num);
	}
	public void test2() {
		System.out.println("test2 : " +num);
	}
}

public class Ex02 {
public static void main(String[] args) {
	Test02 t = new Test02(); //t는 num.test1,2를 가지고 있다.
	t.test1();//호출하는 시점에서 지역변수가 생성
	t.test2();
	
}
}
