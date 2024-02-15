package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex02 {
public static void main(String[] args) {
//	첫글자가 소문자로 형성되어있는 것은 자료형으로 부여할 수 없다.
//	Wrapper Class는 소문자로 형성되어있는 것을 대신해서 자료형으로 사용할 수 있는것
	ArrayList<Integer> arr = new ArrayList<>();
	Random r = new Random();
	for(int i=0; i<6 ; i++) { //(;arr.size() < 6;)
		int num = r.nextInt(45) + 1;
		if(arr.contains(num) == false) { //존재하면 true
		arr.add(num);
	}
	}
	System.out.println( arr );
	
	
	HashSet<Integer> set = new HashSet<>();
	for( ; set.size()<6 ; ) {
		int num = r.nextInt(6) +1;
		set.add(num);
	}
	System.out.println(set);
	//위의 if문은 필요없고 중복을 하지 않는다.
}
}
