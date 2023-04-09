package extend;

public class Ex1 {
	public static void main(String[] args) {
		Human hm1 = new Human("홍길동",16);
		hm1.말하기();
		hm1.걷기();		
	}

}
//사람(Human) 클래스
//이름, 나이, 키, 몸무게
class Human{
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void 말하기() {
		System.out.println(name + "("+age+")이(가) 말합니다.");
	}
	public void 걷기() {
		System.out.println(name + "("+age+")이(가) 걷습니다.");
	}
	public void 밥먹기() {
		System.out.println(name + "("+age+")이(가) 밥을 먹습니다.");
	}
}