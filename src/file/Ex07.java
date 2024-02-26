package file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.Buffer;

public class Ex07 {
	public static void main(String[] args) throws Exception {
//		//닫히면서 해당하는 값은 없애준다.
//	String path = "D:/핀테크_설송희1_31/test/test.txt";
//	FileOutputStream fos = new FileOutputStream(path);
//	for( char ch ='0' ; ch <= '9'; ch++) {
////		Thread.sleep(2000);
//		fos.write(ch);
//		//write를 만날때마다 파일에 접근을 한다.
//		//처리속도가 느리다.
//	}
//	fos.close();
		
		
		//기본스트림은 유지
		String path = "D:/핀테크_설송희1_31/test/test.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for( char ch ='0' ; ch <= '9'; ch++) {
			Thread.sleep(1000);
//			fos.write(ch);
			bos.write(ch);
			//자신만의 보조스트림공간에 출력되고있다.
			}
		bos.flush(); //보조스트림의 공간의 모든 내용을 한번에 출력하라.
		bos.write('a');
		fos.close();//데이터를 전송하고 연결 통로를 끊겠다.
	
	}
}