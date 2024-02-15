package string;

public class Ex03 {
public static void main(String[] args) {
	String str = "test   ";
	System.out.println("str : "+str);
	System.out.println(str.equals("test"));
//	공백이 들어가 있을때 처리하는방법
	
	String result = str.trim(); //양쪽의 공백을 삭제 시켜준다.
	System.out.println("result : " +result);
	System.out.println(result.equals("test"));
	
	String addr = "05214 노원구 동일로4567"; //특정문자를 기준으로 잘라준다.
	System.out.println(addr);
	
//	String[] split = addr.split("5"); //5가 들어있는 기준으로 쪼개준다.
	String[] split = addr.split(" "); //공백이 들어있는 기준으로 쪼개준다.
	for(int i=0;i<split.length; i++) {
		System.out.println(i + "." + split[i]);
	}
	
	String phone = "101-1234-1234";
	String rep = phone.replace("-","");
	System.out.println("rep : " +rep);
	//치환하는 기능으로 "-"문자를 ""으로 변경한다.
	//a로 치환해도 "a"라고 작성
	
//	phone.split(rep)기능들이 보일때 :이후에 보이는 것은 작성시에 형태를 알려주는 것
	
	phone = "1234";
	System.out.println(phone + 100);
	
	phone = "1234";
	int num = Integer.parseInt(phone);
	System.out.println( num + 100);
//	문자열형태의 숫자를 숫자로 변경해준다.
	
//	String s = num; num은 숫자로 변경되어 String s에 저장될 수 없다.
	
	String s = num + "";
	System.out.println(s + 100);
	
}
}
