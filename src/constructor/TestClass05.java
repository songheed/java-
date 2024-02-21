package constructor;
//bpo
public class TestClass05 {
	private String name, addr;
	//저장하기 위한 class
	
	public TestClass05() {
		System.out.println("기본 생성자");
	}
	
	public void display() {
		//출력을 하기 위한class
		System.out.println("1. 저장합니다.");
		name = "홍길동";
		setAddr("산골짜기");
		System.out.println("2. 출력합니다.");
		System.out.println(getName());
		System.out.println(addr);
		//같은 클래스에 있을경우 name = "홍길동";형식으로 사용 
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
