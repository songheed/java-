package array;

import java.util.Scanner;

public class Quiz_1조 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
//	1.번
//	arr = {"a","b","c","d","e"}; 를 역순으로 다시 배열에 저장하고 출력하세요
//	arrayName.clone() 메소드 이용
	
//	String[] arr = {"a","b","c","d","e"};



//	================================================================
	
//	2.번
	String[] arr = new String[5];
	int num;
	
	while(true) {
		System.out.println("1. 이름 입력\n2. 성적 입력\n3. 성적 출력\n4. 종료");
		System.out.println("선택 >>> ");
		num = input.nextInt();
		
		if(num == 1) {
			System.out.println("1. 모두 입력하시겠습니까?");
			System.out.println("2. 이름을 수정하시겠습니까?");
			System.out.println("선택 >>> ");
			num = input.nextInt();
			if(num == 1) {
				for(int i=1; i<=5; i++ ) {
					System.out.println("이름을 입력해 주세요 : ");
					
				}
			}
		}
	}
	
	

	
	
	
	
	
	

}
}
