package etc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeClass01 {
//시간을 얻어오는 기능
	public static void main(String[] args) {
		long time =System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat si = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		//데이터의 형식을 변화할때 사용
		String s =si.format(time); //초단위로 가지고옴
		System.out.println(s);
		
		
		System.out.println("-----------------");
		
		Date date = new Date();
		System.out.println(date); //년월일 형식으로 가지고옴
		//java에서 사용하는 유틸 사용
		
		System.out.println(si.format(date));
	}
}

//패키지를 만드는 이름명