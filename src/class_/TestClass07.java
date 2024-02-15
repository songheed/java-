package class_;

import java.util.Scanner;

public class TestClass07 {
	public int inputData() {
		System.out.println("입력 받는 기능입니다.");
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		return num;
	}
	public int opData(int a) { //()안에 받는 정보값(int)을 정하고 저장할 변수를 작성
		int sum =0;
		for(int i=1; i<=a ;i++) {
			sum += i;
		}
		return sum;
	}
	public void printData(int n, int s) {
		System.out.println("1~" + n +"까지의 합:");
	}
}
