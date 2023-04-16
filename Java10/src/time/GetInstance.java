package time;

public class GetInstance {

	//getInstance() : 싱글턴패턴
	//디자인패턴 : MVC패턴, 싱글턴패턴, ...
	//디자인패턴이란 코딩 방식(구조)
		
	//싱글턴패턴 : 한번만 객체화를 허용해주되, static으로 객체화를 시켜서 어디서든 자유롭게 사용 가능하게 함.
	// 생성자를 private으로 해서 일반적인 객체화를 불가능하게함.
			
			
	private GetInstance() {}
	
	private static GetInstance instance;	//객체를 저장할 멤버변수
	
	//객체 멤버변수를 반환해줄 static 메서드 : getInstance()
	public static GetInstance getInstance() {
		if(instance ==null) {
			instance = new GetInstance();
		}
		return instance;
	}
	
	//멤버변수와 메서드
	public void print() {
		System.out.println("싱글턴패턴 클래스 입니다.");
	}
}


