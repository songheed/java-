package set_get;

import java.util.Scanner;

class test1{
	Scanner input = new Scanner(System.in);
	private String name;
	private int age;
	
	public void setName(String name) {
		System.out.println("이름 입력 :");
		this.name = input.next();
	}
	public void setAge(int age) {
		System.out.println("나이 입력 : ");
		this.age = input.nextInt();
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}


public class Quiz_Test_01 {

}
