package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException, IOException {
		File path = new File("D:\\핀테크_설송희1_31\\test\\tes.txt"); //경로를 받고있는 객체
		FileOutputStream fos = new FileOutputStream(path); //예외처리 필요
		fos.write(97);//throws예외처리 둘다 필요
		fos.write('a');
		//write를 byte배열로 변경해야 한다.
		fos.write("test".getBytes());
//		Stream은연결을 시켜주는 연결통로 입출력을 할수 있다.
	}
}
