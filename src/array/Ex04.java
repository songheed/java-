package array;

public class Ex04 {
public static void main(String[] args) {
	int[] arr = new int[] {100,200,300};
	double[] dos = {1.11,2.22,3.33};
	String[] str = {"안녕", "하세요"};
	
//	for(int i=0;arr.length;i++	) {}
	for(int num : arr) {
//		System.out.println(i + "."+num);
//		i++;
	}
	for(double dou : dos) {
		System.out.println(dou);
	}
	for(String s : str) {
		System.out.println(s);
		
	}
	
}
}
