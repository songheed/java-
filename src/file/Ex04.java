package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) throws IOException {
	Scanner input = new Scanner(System.in);
	String path = "D:/핀테크_설송희1_31/test";
	
	System.out.println("파일명 입력");
	String fileName = input.next();
	
	File fillePath = new File(path + fileName+ ".txt");
	
	if(fillePath.exists()) {
		System.out.println("이미 존재하는 파일입니다.");
	}else {
		FileOutputStream fos = new FileOutputStream(fillePath);
		String msg ;
		System.out.println("내용을 입력하세요");
		input.nextLine();
		msg = input.nextLine();
		fos.write(msg.getBytes());
		System.out.println("저장되었습니다.");
	}
	
	//""안의 내용을 수정해서 다시 실행하면 해당하는 파일이 있다면 기존의 파일은 파괴한뒤 새롭게 만든다.
	//그렇기 때문에 if문을 사용해서 파일이 존재한다면 삭제되는 것을 방지해야 한다.
	//nextLine은 enter를 기준으로 입력값을 넣는 기능을 가지고 있다.
	
}
}
