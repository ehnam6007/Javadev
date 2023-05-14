package review;

public class _07_Extends {
	public static void main(String[] args) {
		MyExtends me = new MyExtends();
		me.setStr("123");
		String str = me.getStr();
		System.out.println(str);
		
	}
	

}

class MyExtends extends MyClass7{
	// 여기서 MyClass7 변수와 메서드를 사용 가능
	
	//상속 조금 바꿔야 할 메서드가 있을 경우 오버라이딩(재정의) 진행해준다.
	public String getStr() {
		return "=="+super.getStr()+"==";
		//super. : 부모의
	}
	
}
class MyClass7{
	// 클래스는 변수들과 함수들의 묶음
	private String str;		//멤버변수
	
	//생성자 : 클래스의 이름과 동일한 이름의 메서드, 객체화 할 때 자동 호출
	// 객체 선언할 때 new myclass() <- 괄호가 생성자
	public MyClass7(/*클래스명 this*/) {		//모든 메서드에는 '클래스명 this'가 숨어있음.
		
	}
	public void setStr(String str) {
		this.str = str;		//매개변수() str을 멤버변수 str에 담는다. 
		//함수가 메서드로 바뀔 때 매개변수로 삽입
		// this : 내 클래스의 멤버(변수 또는 메서드)
	}
	public String getStr(){
		return str;		//겹치는 명칭이 없으면 this. 생략 가능.
	}
	
	// 오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드 취급 함.
	public String getStr(String str) {
		return this.str+str;
	}
}