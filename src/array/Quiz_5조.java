package array;

import java.util.Scanner;

public class Quiz_5조 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		문제1
//		6개의 서로 다른 자연수를 배열로 입력하고, 이들 중 최댓값을 찾고 
//		그 최댓값이 몇번째 수 인지 구하는 프로그램 작성
//		* 자연수를 입력하지 않을 경우 "다시 입력하세요" - 해당 수만 다시 입력하도록 함
//		* 자연수는 1번째 부터 6번째까지 있음
//
//		1번째 수 입력 : 0
//		다시 입력하세요 : 0
//		다시 입력하세요 : 12
//		2번째 수 입력 : 99
//		3번째 수 입력 : 25
//		4번째 수 입력 : -7
//		다시 입력하세요 : 7
//		5번째 수 입력 : 56
//		6번째 수 입력 : 100
//		12 99 25 7 56 100 
//		해당 배열의 최댓값은 6번째 수인 100 입니다. 
		
		
//		int arr[] = new int[6];
//		int k=1;
//		while(true) {
//			for(int i=0; i<arr.length; i++) {
//				System.out.println(k +"번째 수 입력 : ");
//				k++;
//				arr[i] = input.nextInt();
//				while(arr[i] <= 0) {
//					System.out.println("다시 입력하세요 : ");
//					arr[i] = input.nextInt();
//					}
//				}
//			for(int j=0; j<arr.length; j++) {
//				System.out.print(arr[j]+"\t");
//				}
//			break;
//			}
//		}
//	================================================================
		
//	문제 2) 
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜
//	배열에 초기화 후 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//	ex. 5 3 2 7 4 8 6 10 9 10
//	최대값 : 10
//	최소값 : 2
		
//	int arr[] = new int [10];
//	int ran;
//	int max = arr[0], sm = arr[0];
//
//	
//	for(int i= 0; i<arr.length; i++) {
//		ran = (int)(Math.random()*10+1);
//		arr[i] = ran;
//		System.out.print(ran);
//		}
//		System.out.println();
//	for(int j=0; j<arr.length; j++) {
//		if(arr[j] > max) {
//			max = arr[j];
//		}else if(arr[j] < sm) {
//			sm = arr[j];
//		}
//	}
//		System.out.println("최대값 : "+max);
//		System.out.println("최소값 : " +sm);

	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	================================================================
		
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
		
		
//		int menu, count=0, rd = 0, num=0;
//		while(true) {
//			System.out.println("======Up & Down======");
//			System.out.println("1. 게임시작\n2. 기록 확인\n3. 게임 종료");
//			System.out.println("번호를 선택하시오 >>>");
//			menu = input.nextInt();
//			rd = (int)(Math.random()*50+1);
//			if(menu == 1){
//				while(true) {
//					System.out.println("========Start=========");
//					//			System.out.println(rd);
//					System.out.println("정답 입력 : ");
//					num = input.nextInt();
//					count+=1;
//					if(num == rd) {
//						System.out.println("정답!!");
//						break;
//					}else if(num <rd ) {
//						System.out.println("Up");
//						continue;
//					}else {
//						System.out.println("Down");
//						continue;
//					}
//				}
//			}else if(menu == 2) {
//				System.out.println("예전 기록은 "+count+"입니다.");
//			}else if(menu == 3) {
//				System.out.println("종료 하겠습니다.");
//				break;
//			}
//
//		}

//		======================================================================
		
//		배열에 1~9까지의 수를 넣고 random으로 3개의 수를 출력하되
//		중복되지 않는 수 3개를 출력 하시오
//		System.arraycopy(num, i, num3, j, tmp); 사용
		
//		int[] num = {1,2,3,4,5,6,7,8,9};
//		int[] num3 = new int[3];
//		int j , tmp;
//		for(int i=0; i<num.length; i++) {
//			j = (int)(Math.random() * num.length);
//			tmp = 0;
//
//			tmp = num[i];
//			num[i] = num[j];
//			num[j] = tmp;
//		}
//		System.arraycopy(num, 0, num3, 0, 3);
//		for(int i =0; i<num3.length ; i++) {
//			System.out.print(num3[i]);
//		}

	}
}
