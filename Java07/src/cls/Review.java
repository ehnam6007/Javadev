package cls;

public class Review { 
	public static void main(String[] args) {
		//다른 클래스의 변수나 메서드를 사용하기 위해선 '객체화'필요
		//클래스명 변수명 = new 변수명();
		Re r1 = new Re();
		
		r1.setStr("hello");
		System.out.println(r1.getStr());
		
	}

}
//클래스 : 변수 + 함수
class Re{
	//private 멤버변수
	private String str;
	
	//public 메서드
	public void setStr(String str) {
		this.str = str;		//멤버변수 str에 메서드 str값을 담는다.
		
	}
	public String getStr() {
		return str;		//멤버변수 str을 리턴 (되돌려줌)
	}
	
	//생성자 (객체화 할 때 자동사용되는 메서드)
	public Re() {
		System.out.println("객체화에 성공했습니다.");
	}
}
