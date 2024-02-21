package com.care.test;

class Test001{
	void test001() {
		System.out.println("Test001 test001 메소드");
	}
}
public class TestClass { //public class는 하나밖에 만들지 못한다.
	public void test() {
		System.out.println("test 메소드");
		
	}
	void test2() { // void앞쪽에 아무표시가 없으면 디폴트 
		//같은 패키지 안에서는 사용이 가능하지만 다른 패키지 에서는 사용 불가
		//public이 써져 있는 것만 다른 패키지 에서 사용이 가능하다.
		System.out.println("test2 메소드");
	}
}
