package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Ex01_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);  //throws 추가 //12345는 port번호
		//ip와 지정한 port번호로 접속할수 있다.
		System.out.println("접속을 기다립니다.");
		
		//accept는클라이언트로부터 접속을 할때까지 접속을 기다림
		Socket sock =server.accept(); //연결이 될때까지 일시중지됨
		System.out.println("클라이언트 연결되었습니다.");
		
		InputStream is = sock.getInputStream();
		int readData = is.read();
		System.out.println("수신 데이터 : "+readData);
		
		is.close(); sock.close(); server.close();
		//클라이언트 먼저 실행하면 안되고 서버 먼저 실행후 클라이언트 실행
	}
}


//server 먼저 실행후 client를 나중에 실행해야 error가 나지 않는다.**