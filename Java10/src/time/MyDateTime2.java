package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime2 {
	public static void main(String[] args) {
		MyDate md = new MyDate();
		
		while(true) {
			System.out.println(md.now());
			try {Thread.sleep(1000);
			}catch(Exception e) { System.out.println("예외처리!");}
			
		}
		
	}

}

class MyDate {

	// 현재 시간 가져오기
	public String now() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		String str = null;
		str = sdf.format(date);
		return str;
	}

}