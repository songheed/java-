package if_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		
//		두수를 입력 받아 큰수를 출력 하시오
		System.out.println("두수를 입력 하시오 :");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 +"이" +num2 +"보다 큽니다");
		}
		if(num2 > num1) {
			System.out.println(num2 +"이" +num1 +"보다 큽니다");
		}
		if(num1 ==num2) {
			System.out.println("입력한수는 같습니다.");
		}
		
//		세수를 입력 받아 큰 수를 출력 하시오
		
		System.out.println("세수를 입력 하시오 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3)
			System.out.println(num1 +"이" +num2 +", "+num3 +"보다 큽니다");
		}
		if(num2 > num1) {
			if(num2 > num3)
			System.out.println(num2 +"이" +num1 +", " +num3 +"보다 큽니다");
		}
		if(num3 > num1) {
			if(num3 > num2)
			System.out.println(num3 +"이" +num1 +", " +num2 +"보다 큽니다.");
		}
		
		
	}
}
