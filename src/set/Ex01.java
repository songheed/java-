//set 순서를 유지하지 않는데이터 데이터의 중복허용하지않는다.

package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	set.add("라면");
	set.add("김밥");
	set.add("순대");
	set.add("라면");
	ArrayList<String>arr = new ArrayList<>();
	arr.add("라면");
	arr.add("김밥");
	arr.add("순대");
	arr.add("라면");
	System.out.println("set : " +set);
	System.out.println("set : " +arr);
}
}
//set과 list의 차이점 