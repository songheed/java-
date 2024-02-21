package variable;

public class StaticText05 {
	
	//다른 많은 파일에서 필요로 하는 경우
	public static String url = "c://공유폴더//접근한다.";
	//클래스 내부의 많은 메소드에서 필요로 하는경우
	//static을 사용하면 StaticText05만가지고 
	//사용할 수 있다.
	
	public String url_1 = "c://공유폴더//접근한다";
	public void test1() {
	//메소드 안에서 일회성으로 어떠한 연산을 할때 사용
		int num;
	}
}
