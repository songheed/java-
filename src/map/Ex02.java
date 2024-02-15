package map;

import java.util.HashMap;

public class Ex02 {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
	map.put("num", 100);
	map.put("age", 10);
	System.out.println("map : " +map);
	
	Integer num = map.get("age"); // == int num 
	System.out.println("num : " + num);
	
	
	System.out.println(map.containsKey("age")); //key 존재 확인가능
	System.out.println(map.containsValue(2000)); //값을 존재 확인가능
	
	map.put("age", 12345); //값 중복은 되지 않지만 변경이 가능
	System.out.println(map);
	
	map.remove("age"); //"age" 삭제 
	System.out.println(map);
	
}
}
