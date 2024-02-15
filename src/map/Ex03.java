package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
public static void main(String[] args) {
	//따로 출력
	
	HashMap<String, String> map = new HashMap<>();
	map.put("이름", "홍길동");
	map.put("나이", "20");
	System.out.println("map : " + map);
	
	System.out.println("key set : " + map.keySet()); //해당하는 key만 출력
	System.out.println("values : " + map.values()); //해당하는 값만 출력
	
	Set<String> set = map.keySet();
	//set = 이름, 나이(인덱스 사용 불가)
	System.out.println("set : " +set);
	// it = [bof,이름,나이,eof]
	//set은 get기능이 없어 Interator사용
	Iterator<String> it = set.iterator();
	
	for(; it.hasNext(); ) {
//		System.out.println(it.next());
		String key = it.next();
		System.out.println(key + " : " + map.get(key));
	}
	System.out.println("종료 !!");
	
	
}
}

class
동작되는 방식, 순서를 잘 기억하기
class는 내가 사용하고 싶은 자료형들을 모아놓고 사용한다.(사용자가 만드는 자료형)
class를 이용해여 변수를 만드는 것을 객체라고 표현한다.


