package array;

import java.util.Scanner;

public class Quiz_5조 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//	up&down 게임 만들기
		//	Random 숫자 값을 설정하고 해당 숫자 값을 맞추는 게임을 제작하시오
		//	입력 숫자가 정답숫자보다 높으면 "UP"/ 낮으면"Down"
		//	랜덤 정수 구하는식 => (int)(Math.random()*50+1);
		//	예시)
		//	======Up & Down======
		//	1. 게임 시작
		//	2. 기록 확인
		//	3. 게임 종료
		//	번호를 선택하시오 >> 1
		//	========Start=========
		//	50
		//	정답 입력 : 25
		//	Up
		//	정답 입력 : 70
		//	Down
		//	정답 입력 : 50
		//	정답!!
		//	====================
		//	1. 게임 시작
		//	2. 기록 확인
		//	3. 게임 종료
		//	번호를 선택하시오 >> 2
		//	이전 기록은 3회 입니다.
		int menu, count=0, rd = 0, num=0;
		while(true) {
			System.out.println("======Up & Down======");
			System.out.println("1. 게임시작\n2. 기록 확인\n3. 게임 종료");
			System.out.println("번호를 선택하시오 >>>");
			menu = input.nextInt();
			rd = (int)(Math.random()*50+1);
			if(menu == 1){
				while(true) {
					System.out.println("========Start=========");
					//			System.out.println(rd);
					System.out.println("정답 입력 : ");
					num = input.nextInt();
					count+=1;
					if(num == rd) {
						System.out.println("정답!!");
						break;
					}else if(num <rd ) {
						System.out.println("Up");
						continue;
					}else {
						System.out.println("Down");
						continue;
					}
				}
			}else if(menu == 2) {
				System.out.println("예전 기록은 "+count+"입니다.");
			}else if(menu == 3) {
				System.out.println("종료 하겠습니다.");
				break;
			}

		}



	}
}
