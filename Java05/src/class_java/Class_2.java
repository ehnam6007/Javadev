package class_java;

public class Class_2 {
	public static void main(String[] args) {

		Person 이순신 = new Person();
		Person 아빠 = new Person();
		Person 엄마 = new Person();
		Person 나 = new Person(); // 객체화를 할 때는 추상적인 클래스를 구체적으로 명시

		// 클래스(설계도) : 대상x
		// 객체(object) : 대상을 정한다.

		이순신.name = "이순신";
		이순신.year = 36;
		이순신.height = 188.8;

		나.name = "홍길동";
		나.year = 20;
		나.height = 177.1;
	}
}
class Person {
	String name;
	int year;
	double height; // 변수는 클래스의 정보들을 저장하기 위해 생성
	// 메스드 == 행위(사람이 할 수 있는 행위)

	void 말하기() {
		System.out.println(name + "가 말합니다.");
	}

	void 걷기() {
		System.out.println(name + "은 " + year + "가 말합니다.");
	}
}
