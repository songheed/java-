package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex06_client02 {
	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("127.0.0.1", 12345);
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		Scanner input = new Scanner(System.in);
		String mag = null;
		new Ex06_clientThread(sock);
		while(true) {
			System.out.println("전송 데이터 입력");
			mag = input.next();
			dos.writeUTF(mag);
			System.out.println("데이터수신했음");
		}

	}
}