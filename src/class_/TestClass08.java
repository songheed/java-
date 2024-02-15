package class_;

public class TestClass08 {
	public void inputData() {
		int num = 100;//입력받았다고 가정
//		return num;
		op(num);//같은 메서드 안에있으면 사용할수 있다.
	}
	public void op(int num) {
		num += 1000;
		printN(num);
	}
	public void printN(int n) {
		System.out.println("n : " +n);
	}
}
//메서드 안에서 다른 메서드를 결합하는 과정이 많은것을 강한결합
//개별적으로 사용할수 없어 좋지않다.
