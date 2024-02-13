package while_;

public class Quiz_다중반복문 {
public static void main(String[] args) {
	

	for(int i = 1 ; i<=5; i++) {
		System.out.println();
		for(int j = 1; j<=5; j++) {
			System.out.print("\t"+j*i);
		}
	}
//	============================================
	
	
	for(int i = 1; i<=5; i++) {
		System.out.println();
		for(int j=0; i<=25;j++) {
			System.out.print("\t"+ i+j);
		}
	}

}
}
