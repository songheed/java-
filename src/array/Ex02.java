package array;

public class Ex02 {
public static void main(String[] args) {
//	double dos [] = new double[5];
	double dos [] = new double[] {1.111, 2.222, 3.333};
//	초기화 하면서 배열을 생성할 수 있다.
	
	System.out.println(dos[0]);
	
	System.out.println(dos.length);
	//.length는 배열의 개수를 구함
	for(int i=0; i<3 ; i++) { //보다는
//	for(int i=0; i<dos.length ; i++) { //.length를 사용하는게 좋다.
		
		System.out.println(i + "." + dos[i]);
	}
}
}
