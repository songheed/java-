package file;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) throws Exception{ //throws Exception예외처리
	Scanner input = new Scanner(System.in);
//	String path = ""; //String 경로지정 (file도 사용가능)
	
	String path = "D:/핀테크_설송희1_31/test/test2.txt";
	System.out.println(path);
	FileOutputStream fos = new FileOutputStream(path);

	System.out.println("출력할 내용 입력");
	String name = input.next();
	
	fos.write(name.getBytes());
	System.out.println("저장되었습니다.");
}
}
