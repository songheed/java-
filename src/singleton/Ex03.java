package singleton;

class Test03{
	private static Test03 t;  //static이 필요한 이유...
	int num;
	private Test03() {
		System.out.println("생성자 실행");
	}
//	public Test03 객체생성메소드() {
	public static Test03 객체생성메소드() {
		System.out.println("객체생성 메소드 연동");
		System.out.println("t : " +t);
		if(t == null)
			t = new Test03();
		return t;  //return null;
	}
//	일반적인 메소드면 객체를 생성해서 사용해야 하는데
//	static이 붙으면 클래스명으로 접근이 가능하다.
}
public class Ex03 {
public static void main(String[] args) {
//	Test03 t = new Test03();
//private으로 객체생성을 막아놔서 객체를 생성할수 없다.
//	Test03.객체생성메소드();
//	Test03.객체생성메소드();
	Test03 t01 = Test03.객체생성메소드();
	Test03 t02 = Test03.객체생성메소드();
	Test03 t03 = Test03.객체생성메소드();
	
	t01.num = 1000; t02.num = 2000;
	System.out.println(t01 + " : " + t01.num);
	System.out.println(t02 + " : " + t02.num);
	System.out.println(t03 + " : " + t03.num);
}
}
