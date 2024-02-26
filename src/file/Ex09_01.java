package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Ex09_01 {
	public static void main(String[] args) throws Exception {
		String path = "D:/핀테크_설송희1_31/test/test.txt";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
//		ois.readObject();
		//파일의 바이트로 되어있는 것을 객체로 가져옴
		//파일에 저장되어있는 값이 dto여서 new연산자는 사용하지 않는다.
		//가지고 온 값은 형변환은 해주어야한다.
		Ex09DTO dto = (Ex09DTO)ois.readObject();
		System.out.println("name : " + dto.getName());
		System.out.println("addr : " + dto.getAddr());
	}
}
