package time;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyDateTime {
	String str1 = "멤버변수";	//객체화 없이는 사용 불가능
	static String str2 = "static정적 멤버변수";		//객체화 안하고 사용 가능(변수 생성 시점 이후에만)
	public static void main(String[] args) {
		MyTime mt = new MyTime();
		/*
		System.out.println(mt.dateTime());
		System.out.println(mt.date());
		System.out.println(mt.time());
		System.out.println(mt.tomorrow());
		System.out.println(mt.after30());
		
		//static으로 올려놓으면 객체화없이 그 안에 있는 메서드와 멤버변수를 바로 사용 가능
		GetInstance get = GetInstance.getInstance();	//GetInstance : static으로 올려놔서 막 접근이 가능/성능이 많이 떨어짐.
		
		
		//System.out.println(str1);	객체화를 해야 변수와 메서드 사용가능
		System.out.println(MyDateTime.str2); 	//static이어서 어느ㅡ 클래스 안에 있는지만 알려주면 바로 접근 가능
		
		get.print();
		*/
		
		// Singleton ton1 = new Singleton(); 정석적인 객체화
		
		//싱글턴패턴의 객체화
		Singleton ton = Singleton.getInstance();	//getInstance는 static메서드
		//일반메서드는 객체화 후 사용가능하나, static 메서드는 객체화 없이 사용가능하며 기울임꼴으로 표현된다.
		
		ton.SetStr("Hello");
		System.out.println(ton.GetStr());
		
		
		
	}

}
class MyTime{
	private String str;
	
	public String dateTime() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		str=sdf.format(date);
	
		
		return str;
	}

	public String date() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		str=sdf.format(date);
		

		return str;
		
	}
	public String time() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		str = sdf.format(date);
		
		return str;
	}
	public String tomorrow() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("hh");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		String year = sdf1.format(date);
		String month = sdf2.format(date);
		String day = sdf3.format(date);
		String hour = sdf4.format(date);
		String minute = sdf5.format(date);
		String second = sdf6.format(date);
		
		str = year + "년-" + month +"월-"+(Integer.parseInt(day)+1)+"일 "+(Integer.parseInt(hour)+1)+"시:"+minute+"분:"+second+"초";
		
		return str;
	}
	
	public String after30() {
		Calendar cal = Calendar.getInstance();	//시간을 가져옴
		cal.add(Calendar.MINUTE,30);	//30분 더한 시간 출력
		cal.add(Calendar.DATE,-1);		//하루 전 날짜 출력
		Date date = cal.getTime();	//형변환 진행
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh"); //원하는 포맷으로 변환
		SimpleDateFormat sdf2 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("ss");
		
		String ytoh = sdf1.format(date);
		String minute = sdf2.format(date);
		String second = sdf3.format(date);
		
		str = ytoh + ":" + minute +":" + second;
		return str;
	}

}













