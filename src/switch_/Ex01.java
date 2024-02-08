package switch_;

public class Ex01 {
	public static void main(String[] args) {
//		switch - case
//		(식)에 들어맞는 해당 문장으로 가서 출력됨
//		default는 else와같다.
		
		int select = 2;
		switch(select) {
		case 1: System.out.println("1입력");break;
		case 2: System.out.println("2입력");break;
		default : System.out.println("1,2 제외한 값");
		}
		System.out.println("다음 문장들 실행!!");
//		break가 없다면 다음문장이 실행된다. break를 만나면 switch문을 빠져 나온다.
//		default는 break를 생략 가능하다.
		
//		if문으로 변경
		if(select == 1) {
			System.out.println(111);
		}else if(select == 2) {
			System.out.println(2222);
		}else {
			System.out.println("그 외의 값");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
