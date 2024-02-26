package file;
import java.io.BufferedInputStream;
//DataInputStream
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.Buffer;

public class Ex08 {
public static void main(String[] args) throws Exception {
	String path = "D:/핀테크_설송희1_31/test/test.txt";
	FileOutputStream fos = new FileOutputStream(path);
	BufferedOutputStream bos = new BufferedOutputStream(fos); //보조
	DataOutputStream dos = new DataOutputStream(bos);  //보조
	
//	dos는 더많은 기능을 가지고 있는 보조스트림
	dos.writeUTF("안녕하세요");
	dos.writeInt(100);
	dos.writeDouble(1.111);
	//스트림은 역순으로 close해야한다.
	dos.close();bos.close();fos.close();
	
	FileInputStream fis = new FileInputStream(path); //기본스트림 생성
	BufferedInputStream bis = new BufferedInputStream(fis);
	DataInputStream dis = new DataInputStream(bis);
	//저장한 순서 문자, 정수, 실수 순서로 출력해야 한다.
	String msg = dis.readUTF();
	int num = dis.readInt();
	double dou = dis.readDouble();
	System.out.println(msg);
	System.out.println(num);
	System.out.println(dou);
	//.txt 파일에는 깨져서 출력된다.
}
}
