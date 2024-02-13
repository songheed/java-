package while_;

public class Ex01 {
	public static void main(String[] args) {
		
		int i = 1, sum =0;
		while(i<= 10) {
//		for( ; i<= 10; ) { //while을 for문으로 변경
			System.out.println(i);
			sum += i;
			i++;
		}
		System.out.println("sum = "+sum);//1~10까지의 합 
		System.out.println("다음 문장들 실행!");
	}
}

//continue 반복문 윗쪽으로 이동