package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Dto02{
	private String name,id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
		
	
}
public class Ex02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String id, name;
	ArrayList<Dto02> arr = new ArrayList<>();
	while(true) {
		System.out.println("1.저장");
		System.out.println("2.모든 내용 확인");
		int num = input.nextInt();
		switch (num) {
		case 1 : 
			Dto02 d = new Dto02();
			System.out.println("아이디 입력 ");
			id = input.next();
			d.setId(id);
			System.out.println("이름입력");
			d.setName(input.next());
			arr.add(d);
			System.out.println("저장되었습니다.");
			break;
		case 2 : 
			System.out.println("---모든내용 ---");
			for(Dto02 dd : arr) {
				System.out.println("아이티 :" +dd.getId() );
				System.out.println("아이티 :" +dd.getName() );
				System.out.println("-------------");
			}
			break;
		}
	}
}
}
