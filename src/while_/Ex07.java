package while_;

public class Ex07 {
public static void main(String[] args) {
	//error조심
	String n1 = null, n2 = "test";
	//n1 == "abcd"
//	첫번째 글자가 대문자일 경우 클래스변수, 대문자일 경우는 .을 찍으면 기능을 볼수있다.
	
	int num = 1000;
//	
	System.out.println(n1.equals(n2));
	//***내용에 값이 없으면(null값을 가지고 있을때) 사용할 수 없다.
	System.out.println(n2.equals(n1));
//	안의 값을 비교
	
	if(n1 == null) {
		System.out.println("n1입력하세요");
	}else {
		if(n1.equals(n2)) {
			System.out.println("두 문자열은 같다.");
		}else {
			System.out.println("다르다..");
		}
	}
}
}
