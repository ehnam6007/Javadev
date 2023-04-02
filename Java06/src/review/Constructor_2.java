package review;

public class Constructor_2 {
	public static void main(String[] args) {
		Person ps1 = new Person("홍길동", 23);
		Person ps2 = new Person("사임당", 27);
		PersonView pv1 = new PersonView();
		PersonView pv2 = new PersonView();

		// pv.info();
		pv1.info(ps1);
		pv1.info();
		pv2.info(ps2);
		pv2.info();

	}

}

class Person {
	// 멤버변수(이름, 나이)
	private String name;
	private int age;

	// 생성자 (생성자 통해서 멤버변수 초기화)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메서드(GETTER/SETTER)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class PersonView {
	// 생성자 : 받아온 객체를 멤버변수에 백업
	// 메서드(멤버변수 출력용)
	Person person;

	public void info() {
		System.out.println("이름 : " + person.getName() + ", 나이 : " + person.getAge());
		
		System.out.println("1");
	}

	// 메서드 오버로딩(바뀐 사람으로 저장 후 출력)
	public void info(Person person) {
		this.person = person;
		System.out.println("이름 : " + person.getName() + ", 나이 : " + person.getAge());
		System.out.println("2");
	}
}
