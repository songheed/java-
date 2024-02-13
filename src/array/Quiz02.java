package array;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.println("짝수, 홀수 입력 : ");
		odd_even= input.next();

		//	if(odd_even.equals("짝수")) {
		//		for(int i=0; i<arr.length ; i++) {
		//			if(arr[i] % 2 ==0) {
		//				System.out.println("짝수 : " + arr[i]);
		//			}
		//		}
		//	}else {
		//		for(int j=0; j<arr.length; j++) {
		//			if(arr[j] % 2 == 1) {
		//			System.out.println("홀수 : " +arr[j]);
		//			}
		//		}
		//	}
		//	=======================================================

		//	짝수 입력시 : index가 짝수 번째인값 출력(0,2,4)10,13,25
		//	홀수 입력시 : index가 홀수 번째인값 출력(1,3,5)54,17,30

		for(int i = 0; i< arr.length ; i++) {
			if(odd_even.equals("짝수") && i%2 ==0) {
				System.out.println(i+"."+arr[i]);
			}
		}

	}
}
