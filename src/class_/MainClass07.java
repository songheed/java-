package class_;

public class MainClass07 {
public static void main(String[] args) {
	TestClass07 t = new TestClass07();
//	t.inputData(); //입력받는 기능
	int n = t.inputData();
	
//	System.out.println("n :" +n);
	int s = t.opData(n);//사용자의 값을 opData에다 전달
//	System.out.println("s : "+s);
	t.printData(n, s);





}
}
