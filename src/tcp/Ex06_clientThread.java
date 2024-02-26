package tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Ex06_clientThread extends Thread{
	Socket sock;
	public Ex06_clientThread(Socket sock) { //server의 new Ex06_clientThread(s);과 연결
		this.sock = sock;
		start();
	}
	@Override
	public void run() {
		try {
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while(true) {
				String data = dis.readUTF();
				System.out.println("수신 테이터 : " + data);
			}
		}catch (Exception e) {
			
		}
	}
}
