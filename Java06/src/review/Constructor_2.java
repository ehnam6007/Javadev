package review;

public class Constructor_2 {
	public static void main(String[] args) {
		Person ps1 = new Person();
		Person ps2 = new Person();
		PersonView pv = new PersonView();
		
		ps1.setName("홍길동");
		ps1.setAge("23");
		ps2.setName("사임당");
		ps2.setAge("27");
		
		//pv.info();
		pv.info(ps1);
		pv.info();
		pv.info(ps2);	
		pv.info();

	}

}
class Person{
	//멤버변수(이름, 나이)
	//생성자 (생성자 통해서 멤버변수 초기화)
	//메서드(GETTER/SETTER)
	private String name, age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}

class PersonView{
	//생성자 : 받아온 객체를 멤버변수에 백업
	//메서드(멤버변수 출력용)
	Person person;
	public void info() {
		System.out.println("이름 : "+person.getName()+", 나이 : "+person.getAge());
		System.out.println("1");
	}
	//메서드 오버로딩(바뀐 사람으로 저장 후 출력)
	public void info(Person person) {
		this.person = person;
		System.out.println("이름 : "+person.getName()+", 나이 : "+person.getAge());
		System.out.println("2");
	}
}
