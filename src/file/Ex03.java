//가지고 있는 기능이 다르다.
package file;

import java.io.File;

public class Ex03 {
public static void main(String[] args) {
	String sPath = "c:/test/"; 
	File fPath = new File("D:/핀테크_설송희1_31/test");
	
	fPath.mkdir();
//	fPath.delete();//파일 삭제
	
	fPath = new File("D:\\핀테크_설송희1_31");
	//해당하는 파일 목록을 가지고 오기
	String[] s = fPath.list(); //String[] s형태의 저장소생성
	
	System.out.println(s.length);
	for(String ss : s) {
		System.out.println(ss);
	}
	System.out.println(fPath.exists()); 
	//해당하는 값이 존재하는지 true false로 확인
	
	
}
}
