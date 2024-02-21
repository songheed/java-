package upcasting;

class Parents{
	public void familyName() {
		System.out.println("이");
	}
	public void name( ) {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
public class Ex02 {
	public static void main(String[] args) {
//		Parents par = new Parents();
//		par.name();
//		Daughter d = new Daughter();
//		d.name();
//		Son s = new Son();
//		s.name();
		
//		Parents par = new Parents();
//		Daughter d = new Daughter();
//		Son s = new Son();
		
		
		//사용자로 입력받아 출력
		//1. 아빠이름 2. 딸, 3. 아들이름
//		int num = 2;
//		if(num ==1 ) {
//			par.name();
//		}else if(num ==2 ) {
//			d.name();
//		}else {
//			s.name();
//		}
		
		Parents par;
//		Daughter d ;
//		Son s ;
		
		int num = 2;
		if(num ==1 ) {
			par = new Parents();
			par.name();
		}else if(num ==2 ) {
			par = new Daughter();
			par.name();
		}else {
			par = new Daughter();
			par.name();
		}
		
		
		
		
		
	}
	
	
	
	
}
