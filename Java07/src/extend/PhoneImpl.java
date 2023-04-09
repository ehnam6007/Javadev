package extend;

//Impl : 구현부(인터페이스를 상속받아 적용)
public class PhoneImpl {
	public static void main(String[] args) {
		Phone2G p2 =  new Phone2G();
		Phone3G p3 =  new Phone3G();
		PhoneLTE p4 =  new PhoneLTE();
		Phone5G p5 = new Phone5G();
		
		p2.call();
		p3.internet();
		p4.speed();
		p5.bigdata();
	}

}
class Phone2G implements Phone{		//전화+문자
	public void call() {
		System.out.println("전화를 합니다.");
	}
	public void msg() {
		System.out.println("문자를 보냅니다.");
	}
}
class Phone3G{		//전화+문자+인터넷
	public void call() {
		System.out.println("전화를 합니다.");
	}
	public void msg() {
		System.out.println("문자를 보냅니다.");
	}
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
}
class PhoneLTE{		//전화+문자+인터넷+속도
	public void call() {
		System.out.println("전화를 합니다.");
	}
	public void msg() {
		System.out.println("문자를 보냅니다.");
	}
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
	public void speed(){
		System.out.println("속도가 빠릅니다.");
	}

}
class Phone5G{		//전화+문자+인터넷+속도+빅데이터
	public void call() {
		System.out.println("전화를 합니다.");
	}
	public void msg() {
		System.out.println("문자를 보냅니다.");
	}
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
	public void speed(){
		System.out.println("속도가 빠릅니다.");
	}
	public void bigdata(){
		System.out.println("빅데이터를 사용합니다.");
	}
}