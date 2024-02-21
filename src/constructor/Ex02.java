package constructor;

class TestClass02{
	private String officeName;
//	public TestClass02() {
	public TestClass02(String officeName) {
		System.out.println("생성자 실행");
		this.officeName = officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getOfficeName() {
		return this.officeName;
	}
}
public class Ex02 {
public static void main(String[] args) {
	String name = "나의 회사";
//	TestClass02 t = new TestClass02();
	TestClass02 t = new TestClass02(name);
//	t.setOfficeName(name); // 주석으로 묶으면 null값 출력
	System.out.println(t.getOfficeName() );
	
}
}
