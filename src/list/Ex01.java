//컬렉션 프레임워크 는 합성어로
//프레임 웍 은 디자인 패턴 표준화된 프로그래밍 방식
//컬랙션은 자바의 자료구조로 저장하는 방식등을 정한다.
//컬렉션 프레임원의 핵심 인터페이스(list,set, map등등)
//배열은 고정적인 크기가 들어가야되고 list는 공간에 대한 제약이 유연하고, 데이터의 중복을 허용한다.
//list보다 배열이 처리속도가 더빠르다.
package list;

import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>(); //<E>->자료형을 정한다.
	arr.add("안녕"); //index 0번째
	arr.add("하세요");
	System.out.println("arr : " + arr);
//추가하는만큼 데이터는 저장된다.
	
	String s = arr.get(0);
	System.out.println("0 : " + s);
}
}
