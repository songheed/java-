package string;

public class Ex01 {
public static void main(String[] args) {
//	첫번째 문자가 대문자이면 특정 기능이 있는데
//	String은 문자열과 관련된 특정기능이 있다.
	String str;
	String str1= new String();
	String str2= "test";
	String str3= new String("test init");
	System.out.println("str3 : " + str3);
	String s1 = str3.toUpperCase(); // 전부 대문자로 변경
	System.out.println("s1 : " + s1);
	String s2 = s1.toLowerCase();
	System.out.println("s2 : " +s2); // 전부 소문자로 변경
	
	str3 = "JaVa"; //
	//if(str3.equals("java")){
	if(str3.toLowerCase().equals("java")) {
		System.out.println("수강 과목은 자바군요");
	}else {
		System.out.println("다르다");
	}
	
	
}
}
