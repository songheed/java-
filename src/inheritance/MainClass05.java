package inheritance;
//상속받기
class Calc05{
	public void display() {
		System.out.println("나는 계산기 입니다.");
	}
}
class Computer05 extends Calc05{
/*	Calc04 calc;
	public Computer04() {
		calc = new Calc04();
	}
	*/
	public void print() {
		System.out.println("컴퓨터로 동작합니다.");
//		calc.display();
		display();
	}
}
public class MainClass05 {
public static void main(String[] args) {
	Computer05 com = new Computer05();
	com.print();
}
}

