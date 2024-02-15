//set 은 index로 접근할수 없다

package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	arr.add("일");
	arr.add("이");
	arr.add("삼");
	System.out.println("arr : " + arr);
	/*
	  Iterator : 반복자( 배열 형식의 데이터로 만든다.)
	  - hasNext : 다음 위치에 값이 있으면 true, 없으면 fals
	  - next : 다음 위치로 이동후 값을 얻어옴
	 	bof : 데이터의 시작을 의미
	 	eof : 데이터의 끝 의미
	 	it => [bof,일,이,삼,eof]
	 */
	
	Iterator<String> it = arr.iterator();
	System.out.println(it.hasNext() ); //다음값이 존재하다.
	System.out.println(it.next()); // 다음 값을 꺼내옴
	System.out.println(it.next()); // 다음 값을 꺼내옴
	System.out.println(it.hasNext() ); //다음값이 존재하다.
	System.out.println(it.next()); // 다음 값을 꺼내옴
	System.out.println(it.hasNext() ); //다음값이 존재하다.
//	System.out.println(it.next()); //꺼내올 값이 없어 Error
	
	System.out.println("---- set ----");
	HashSet<String> set = new HashSet<>();
	set.add("111");
	set.add("222");
	set.add("333");
	
	System.out.println("set : "+ set); 
	it = set.iterator();
	//값을 꺼내기위해 Interator를 사용한다.
	//it => [bof,111,222,333,eof]
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("종료 !");
	//set은 get을 사용할 수 없어 
	
}
}
