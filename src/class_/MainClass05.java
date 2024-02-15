package class_;

import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = 0;
	System.out.println("수 입력 ");
	num = input.nextInt();
	TestClass05 t = new TestClass05();
	t.sumFunc(10);
	//main에는 num이있고, test에는 num이없을때
	//메개변수 사용해야 num의 값을 전달할 수 있다.
	//연결되어있는 testclass에 
	



}
}
