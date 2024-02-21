package etc;

import java.util.Date;

public class SleepClass01 {
	public static void main(String[] args) {
		for(int i=0 ; i<5 ; i++) {
			System.out.println(i + " : " +new Date() );
			//Thread.sleep사용할때 필요함
			//Thread.sleep에 마우스를 놓고 try/catch선택
			try {
				Thread.sleep( 500 );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.5초 기다림
			
			System.out.println("시작");
			long start = System.currentTimeMillis();
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}
			long end = System.currentTimeMillis();
			System.out.println("종료");
			System.out.println("사용 시간 : " + (end - start) / 1000);
		}
	}
}
