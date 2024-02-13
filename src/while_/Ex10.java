package while_;

public class Ex10 {
public static void main(String[] args) {
	for( int k=0;k<3; k++) {
		System.out.println("====상위 반복문 시작");
		for(int i=0; i<3; i++) {
			System.out.println(i+ ".for");
//			break; //=> 만나면 상위반복문으로 빠져 나감
		}
		System.out.println("상위 반복문 끝====");
		//break;
	}
	System.out.println("다음 문장들 실행!!");
}
}
//break, continue는 어느 위치에 있는지 출력되는 값이 다르다.