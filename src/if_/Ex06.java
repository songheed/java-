package if_;

public class Ex06 {
	public static void main(String[] args) {
		//if 중첩문
//		한줄의 식을 나눠놓은것(세분화하는 것)
//		int n1 = 3, n2 = 2, n3 = 1;
		
//		if(n1 > n2 && n1 > n3) {
//			System.out.println("n1이 가장크다");
//		}
		
		
		//가장 큰수 , 두번째 큰수 , 마지막수
		int n1 = 3, n2 = 2, n3 = 1;
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("가장 큰수는 n1 이다"+n1);
			}else {
				System.out.println("가장 큰수는 n3 이다"+n3);}
		}
		if(n2 > n3) {
			System.out.println("두번째 큰수는 n2 이다"+n2);
		}else {
			System.out.println("ㅇㅇ");
		}
		if(n1 > n3) {
			System.out.println("젓번째 큰수는 n3 이다"+n3);
		}else {
			System.out.println("ㅇ");
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	}
}
