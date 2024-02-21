package overriding;
//toString 오버라이딩
class TestDTO{
	String name;
	int age;
	@Override //art + shift + s 후 override클릭
	public String toString() { //toString은 객체의 정보를 되돌려준다.
		return "[name : " + name + ", age :" +age +"]";
	}
	
}
class Test06{
	TestDTO t;
	public Test06( ) { t = new TestDTO();}
	public void setDTO() {
		t.name = "홍길동"; t.age = 200;
	}
	public void print() {
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println("------------");
		System.out.println(t.toString());
		System.out.println(t);
	}
}
public class Ex06 {
	public static void main(String[] args) {
		Test06 t = new Test06();
		t.setDTO(); t.print();
	}
}
