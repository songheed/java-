package file;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		Ex09DTO dto = new Ex09DTO();
		dto.setName("홍길동");
		dto.setAddr("산골자기");
		
		//dto를 파일로 저장하려면
		String path = "D:/핀테크_설송희1_31/test/test.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(dto);
		
		oos.close();bos.close();fos.close();
	}
}
