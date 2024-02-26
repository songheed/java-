package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_client {
public static void main(String[] args) throws Exception{
	Socket sock = new Socket("127.0.0.1" , 1000);
	OutputStream out = sock.getOutputStream();
	DataOutputStream dos = new DataOutputStream(out);
	
	Scanner input = new Scanner(System.in);
	System.out.println("전송할 문자열 입력");
	String data = input.next();
	dos.writeUTF(data);
	
	InputStream in = sock.getInputStream();
	DataInputStream dis = new DataInputStream(in);
	
	String readData = dis.readUTF();
	System.out.println("수신 데이터 : "+ readData);
	
	
	dos.close(); out.close(); 
	dis.close(); in.close();
	sock.close();
}
}
