package map;

import java.util.HashMap;

public class Ea01 {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	map.put("num", "100");
	map.put("name", "홍길동");
	map.put("선풍기", "1000만원");
	System.out.println("map : " +map);
	
	
	//get으로 출력
	System.out.println(map.get("num")); //num에 들어있는 값 출력
	System.out.println(map.get("선풍기"));
	System.out.println(map.get("없는키"));
}
}
