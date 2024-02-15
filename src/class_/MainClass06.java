package class_;

import java.util.Scanner;

public class MainClass06 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num, sum;
	System.out.println("수 입력");
	num = input.nextInt();
	
	TestClass06 t = new TestClass06();
	sum = t.sumFunc(num);
//	이름이num이라서 testclass에 변수 이름까지 num 일필요는 없다.
	System.out.println(sum);
	
	
	t.test(20, "aaa");
}
}
