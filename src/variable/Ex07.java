package variable;

class Test07{
	public static final String KOREA = "대한민국";
	//static 과 final을 같이사용가능
	public static int num; 
	static{ //범위를 지정해서 사용가능
		num = 1234;
	}
}

public class Ex07 {
public static void main(String[] args) {
	//final
//	final String KOREA = "대한민국";
//	KPREA = "미국";
	
	
	System.out.println(Test07.KOREA);
	System.out.println(Test07.num); //보통은 클래스이름을 사용
	
	//참고
	Test07 t = new Test07();
	System.out.println(t.KOREA);
}
}
