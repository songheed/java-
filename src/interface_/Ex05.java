//package interface_;
//class A지상군05 implements TestInt05{
//
//	@Override
//	public void attack() {
//		System.out.println("지상군 공격");
//	}
//
//	@Override
//	public void defense() {
//		System.out.println("지상군 방어");
//	}
//	
//}
//public class Ex05 {
//	public static void main(String[] args) {
//		A지상군05 a = new A지상군05();
//		a.attack(); a.defense();
//	}
//}
//public class Ex05 {
//	public static void main(String[] args) {
//		A지상군05 a = new A지상군05();
//		a.attack(); a.defense();
//		
//	}

//문제 발생 예제


package interface_;
class A지상군05 implements TestInt05{

	@Override
	public void attack() {
		attack1();
		attack2();
		System.out.println("지상군 공격");
	}
	public void attack1() {
		System.out.println("총알장전");
	}
	public void attack2() {
		System.out.println("조준");
	}

	@Override
	public void defense() {
		System.out.println("지상군 방어");
	}
	
}
public class Ex05 {
	public static void main(String[] args) {
//		A지상군05 a = new A지상군05();
//		a.
		TestInt05 a = new A지상군05();
		a.attack();
	}
}