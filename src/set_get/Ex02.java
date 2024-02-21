package set_get;
class Test02{
	private int num, age;
	
		//	public void setNum(int num) {
		//		num = num;
		//		//num에 저장을 해도 빠져나오면 사라지는 값이라 private num에는 저장되지 않는다.
		//	}
		
		//	public void setNum(int num) {
		//		this.num = num;
		//		//this설정을 해주면 private의 num 에 저장된다.
		//	}
	
	//값 설정하는 용도setter
	public void setNum(int n) {//합성어의 첫번째글짜는 대문자 
		num = n;
	}
	
	//값 꺼내오는 용도getter
	public int getNum() {
		return num;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
}

public class Ex02 {
//setter,getter사용법
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.setNum(100);
		t.setAge(20);
		int a = t.getAge();
		System.out.println("age : " +a);
		System.out.println(t.getNum() );
	}
}
