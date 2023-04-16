package review;

public class Review1 {
	// 자바1
	// 변수, 자료형, 연산자, 조건문, 반복문, 클래스, 메서드, 접근권한제어자, 캡슐화, 생성자, 상속, 인터페이스, 추상클래스
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();

		mc1.myMethod();
		MyClass2 mc2 = new MyClass2();
		
		MyClass3 mc3 = new MyClass3();
		System.out.println(mc3.num2);

	}

}

class MyClass1 {
	// 변수와 자료형
	String str; // 변수 선언(공간 생성)
	int num = 0; // 변수 초기화(공간 생성 + 처음값 대입)
	double dnum;
	// 멤버변수는 private, 메서드는 public(캡슐화, 정보 은닉)
	private boolean bool; // 클래스 멤버변수

	// 메서드
	int myMethod() {
		this.str = "Hello"; // 클래스 멤버변수
		String str = "World"; // 함수의 지역변수

		this.str = this.str + str;

		for (int i = 0; i < 3; i++) {
			if (this.str != null || !(this.str.equals(""))) {
				System.out.println(this.str);
			}
		}

		return 0; // return은 함수의 자료형과 맞춰준다.
	}
}

class MyClass2 extends MyClass1 {
	// MyClass1의 내용이 복붙되어있음
	String arr[] = { "일", "이", "삼", "사" };
	int[] nums = new int[4];

	// 수정(오버라이딩, 재정의)
	public int myMethod() {
		System.out.println("오버라이딩");
		return 1;
	}

	public MyClass2() {
		System.out.println("MyClass2 객체화 성공!");

	}

}

class MyClass3 extends Adapter1 {
	// 선언만 된 추상메서드를 오버라이딩 해줘야 오류가 없어짐
	// 클래스 이름 밑의 빨간줄에 마우스를 갖다대고 unimplemented methods 클릭

	public void must2() {
		System.out.println("머스트2");
	}

	public void must4() {
		System.out.println("머스트4");

	}

	public void must3() {
		System.out.println("머스트3");
	}
}