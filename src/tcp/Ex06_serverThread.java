package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;



public class Ex06_serverThread extends Thread {
//현재접속한 모든사용자에게 모두 보냄
	
	public static ArrayList<Socket> arr;
	static {
		arr = new ArrayList<>();
	}
	private Socket s;
	
	public Ex06_serverThread(Socket s) {
		arr.add(s); //add를 통해 사용자 저장
		this.s =s;
		start();
	}
	public void run() {
		try{
	//InputStream in = arr.get( arr.size()-1 ).getInputStream();
			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
		while(true) {
			String mag = dis.readUTF();
			for(Socket ss : arr) {
				OutputStream out = ss.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF(mag);
			}
		}
	}catch (Exception e) {
		
	}
	}		
}
