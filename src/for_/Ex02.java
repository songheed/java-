package for_;
/*
 debuging
 내가 작성한 코드가 잘못됬는지 확인 하는 기능
 F11 : 디버깅 시작 모드
 F6 : 한줄씩 실행(메소드 건너뜀)
 F7 : 한줄씩 실행(메소드로 이동)
 F8 : 다음 브레이크 포인터로 이동
 왼쪽 숫자를 더블클릭하면 표시가 나타나는데 break pinter기능이다.
 ctrl + f2 : 디버깅 종료
 variables은 
 */
public class Ex02 {
	public static void main(String[] args) {
		int sum = 0;
		//sum = sum + i; i++;
		for(int i= 1; i<= 10; i++) {
		//(;;)안에 식이 없어도 되지만 ;은 2개가 있어야 한다.
			System.out.println(i);
			sum = sum +i;
		}
		System.out.println("sum : " +sum);
	}
}
