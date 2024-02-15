package class_;

import java.util.Scanner;

public class TestClass02 {
	public int inputTest() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 :");
		return input.nextInt(); //num => return변경
	}
}
//메소드를 사용하면 중복되는 코드를 줄일수 있다.