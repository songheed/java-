package tcp;

import java.net.ServerSocket;
import java.net.Socket;


public class Ex06_server {
	public static void main(String[] args) throws Exception{
		//서버 생성 + throws예외처리를 해야 사용할 수 있다.
		ServerSocket server = new ServerSocket(12345);
		while(true) {
			System.out.println("접속을 기다립니다.");
			//client접속 accept
			Socket s = server.accept();
			System.out.println( s.getInetAddress()+ "님 접속");
			new Ex06_clientThread(s);
		}
	}
}
