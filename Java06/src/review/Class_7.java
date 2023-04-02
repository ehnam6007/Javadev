package review;

public class Class_7 {
	public static void main(String[] args) {
		Human hm1 = new Human();		//클래스 객체화
		Human hm2 = new Human();		//클래스 객체화
		HumanView HV = new HumanView();
		
		//데이터 저장
		hm1.set_name("홍길동");
		hm1.set_gender("남성");
		hm1.set_age(23);
		
		hm2.set_name("사임당");
		hm2.set_gender("여성");
		hm2.set_age(27);
		
		//데이터 출력
		HV.printInfo(hm1);
		HV.printInfo(hm2);
	}

}
class Human{
	//멤버변수
	private String name, gender;
	private int age;
	
	//#SET(저장 메서드)
	public void set_name(String name) {
		this.name = name;
	}
	public void set_gender(String gender) {
		this.gender = gender;
	}
	public void set_age(int age) {
		this.age = age;
	}
	//#GET(사용 메서드)
	public String get_name() {
		return name;
	}
	public String get_gender() {
		return gender;
	}
	public int get_age() {
		return age;
	}
		
}
class HumanView{
	//출력 메서드
	public void printInfo(Human human) {
		//데이터 사용
		System.out.println("=========================");
		System.out.println("이름 : "+human.get_name());
		System.out.println("성별 : "+human.get_gender());
		System.out.println("나이 : "+human.get_age()+"세");
		System.out.println("=========================");
	}	
}
