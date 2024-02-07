package if_;

public class Ex05 {
	public static void main(String[] args) {
//		변수 초기화
//		int num = 0, su = 10;
//		if(su > 100) {
//			num = 1234;
//		}
//		if(su < 100) {
//			num =1;
//		}
//		System.out.println(num); 
//		//The local variable num may not have been initialized
//		//local ->  num인 변수값이 초기화 되지 않았다. (초기화 num = 0)
		
		int num, su = 10;
		if(su > 100) {
			num = 1234;
		}
		else {
			num =1;
		}
		System.out.println(num); 
//		else는 if문이 거짓이면 둘중하나는 무조건 실행된다. (초기화 하지 않더라도 실행가능함)
		
	}
}
