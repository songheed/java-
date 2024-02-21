package interface_;
interface A01{
	public void test1();//실질적인 코드가없어야한다.
}
interface B01{
	public void test1();
}
class Class01{ }
class Class02{ }
//public class Ex01 extends Class01, { //class 는 여러개를 상속받을 수 없다.
//
//}
public class Ex01 extends Class01 implements A01, B01 {
//interface는 implements로 상속을 받고 실질적인 코드는 없어야 한다.
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	} 

}