package while_;

public class Ex02 {
public static void main(String[] args) {
	//break, continue
	
	int i = 0;
	while(true) {
		i++;
		System.out.println("i : "+i);//무한반복
		if(i> 3)
			break;
	}
	System.out.println("다음 문장 실행!");
	
	
	for(;;) {
		System.out.println("for i : " +i);
		i++; //무한반복
		if(i>5) {
			break;
		}
	}
	System.out.println("다음문당 실행");//for(무한반복)이 발생할때 빠져나올수 없는 값 뒤에 
							  //식이 있다면 error발생
//	if( i==6){
//		System.out.println(i);
//		break;(무조건 반복문, switch문에서만 반응한다.)
//	}


}
}
