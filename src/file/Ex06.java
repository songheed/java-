package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
public static void main(String[] args) throws IOException {
	String path = "D:/핀테크_설송희1_31/test/test.txt";
	FileOutputStream fos = new FileOutputStream(path,true);
	fos.write('c');
	//true현재 파일이 존재하면 유지하면서 새로운 내용이 추가된다.
	fos.close(); //메모리를 효율적으로 사용하기 위해 닫아준다.
				 //닫은뒤의 스트림은 사용할수 없다.
//	fos.write('d');
	
	fos = new FileOutputStream(path, true);
	fos.write('c');
	fos.close();
	
	FileInputStream fis = new FileInputStream(path);
	int re = fis.read();
	System.out.println(re);
	//숫자로 출력이되고
	System.out.println((char)re);
	//파일에 저장된값은 음수는 존재하지 않는다.
	//-1은 파일끝에저장된다.(저장된값이 없을때 받는 수이다)
	while(true) {
		re = fis.read();
		if(re < 0) {
			System.out.println("내용이 없습니다. " +re);
			break;
		}
		System.out.println((char)re);
	}
	fis.close();
	
}
}
