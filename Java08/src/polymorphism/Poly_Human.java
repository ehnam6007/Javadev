package polymorphism;

public class Poly_Human {
	public static void main(String[] args) {
		//다형성 : 부모 클래스의 자료형으로 자식 클래서를 생성할 수 있다.
		//자료형이 통일되기 때문에 기능 추가에 대해서 코드 수정이 줄어듦(유지보수, 업데이트)
		//자료형을 인터페이스명으로 하고 생성자는 객체화하고자하는 클래스명을 적는다.
		
		Human hong = new Hong();
		Human gang = new Gang();
		
		hong.exer();
		hong.study();
		
		gang.exer();
		gang.study();
	}

}

class Hong implements Human{
	public void exer() {
		System.out.println("Hong씨가 운동합니다.");
	}
	public void study() {
		System.out.println("Hong씨가 공부합니다.");
	}
}
class Gang implements Human{
	public void exer() {
		System.out.println("Kang씨가 운동합니다.");
	}
	public void study() {
		System.out.println("Kang씨가 공부합니다.");
	}
	
}