package while_;

import java.util.Scanner;

public class Quiz_자판기 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int money = 0, num, change=0;
	
	System.out.println("요금을 투입 하세요 >>> ");
	money = input.nextInt();
	
	while(true) {
		System.out.println("=======커피 자판기=======");
		System.out.println();
		System.out.println("1. 커피(200)\n2. 코코아(250)\n3. 반환\n4. 종료");
		System.out.println("메뉴를 선택하세요 >>> ");
		num = input.nextInt();
		if(num == 1) {
			if(money < 200) {
				System.out.println("요금이 부족합니다.");
				continue;
			}else {
				System.out.println("맛있게 드세요");
				money -= 200;
				continue;
			}
		}else if(num == 2) {
			if(money <250) {
				System.out.println("요금이 부족합니다.");
			}else {
			System.out.println("맛있게 드세요");
			money -= 250;
			continue;
			}
		}else if(num == 3) {
			System.out.println("반환되는 금액은 "+ money +"입니다.");
		}else if(num == 4) {
			System.out.println("종료 합니다.");
			break;
		}
		
	}
	
	
}
}
