package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Quiz_01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap<>();
	int num, price;
	String menu;
	while(true) {
		System.out.println("1. 메뉴 등록\n2. 메뉴별 가격 보기\n3. 종 료");
		System.out.println(">>> ");
		num = input.nextInt();
		
		map.put("김밥", 3500);
		map.put("라면", 4500);
		map.put("주먹밥", 3000);
		
		while(num == 1) {
			System.out.println("메뉴 입력 : ");
			menu = input.next();
			if(map.containsKey(menu)) { // 메뉴 중복 확인
				System.out.println("존재하는 메뉴입니다.");
			break;
			}
			System.out.println("가격 입력 : ");
			price = input.nextInt();
			map.put(menu, price);
			System.out.println("메뉴가 등록 되었습니다.");
			break;}
	
		 if(num == 2) {
			 Set<String> set = map.keySet();
//			 System.out.println(set);
			 Iterator<String> it = set.iterator();
			 for( ;it.hasNext(); ) {
				 String key = it.next();
				 System.out.println(key + " : " + map.get(key));
				 System.out.println();
				 }
			 System.out.println("1.수정  2.삭제  3.나가기");
			 System.out.println(">>>");
			 num = input.nextInt();
			 while(num == 1 ) {
				 System.out.println("변경 메뉴이름 입력 : ");
				 menu = input.next();
				 while(map.equals(menu))
				 while(map.equals(menu)) {
					 System.out.println("없다.");
				 }
			 }
			 }
		 if(num == 3) {
			 break;
		 }
	}
}
}
