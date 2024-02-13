package while_;

public class Ex03 {
public static void main(String[] args) {
	
	int i = 0;
	while(i<5) {
//	for(; i<5;) { //while문을 for문으로 변경
		i++;
		if(i== 3) {
			System.out.println("3333");
//			break;
			continue; //break문은 다음문장을 실행하지만 continue는 다시 while문으로 돌려놓는다.
		}
		System.out.println("i : "+i);
	}
	System.out.println("다음 문장들 실행!!");
	
	
	
	
	
}
}
