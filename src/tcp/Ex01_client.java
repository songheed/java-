package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_client {
	public static void main(String[] args) throws Exception {
		//192.168.42.93 , 12345
		Socket sock = new Socket("192.168.42.93",12345);
		System.out.println("클라이언트 실행");
//		실행하면 서버에 대한 엑셉트와 만난다.
		
		//데이터 전송
		OutputStream os = sock.getOutputStream(); //연결통로를 통해 스트림을 활성화 시킴
		//1bate크기로 전송
		
		Scanner input = new Scanner(System.in);
		System.out.println("수입력");
		int data = input.nextInt();
		
		os.write(data);
		os.close(); sock.close();
	}
}
