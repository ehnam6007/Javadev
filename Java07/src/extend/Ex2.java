package extend;

public class Ex2 {
	public static void main(String[] args) {
		//상속 : 내 눈에는 안보이지만 컴퓨터가 클래스를 복사붙여넣기를 하게한다.
		//상속 : 물려주다(어떤 클래스에 있는 변수와 메서드를 다른 클래스에물려준다.)
		//extends
		Person p1 = new Person();
		p1.infoset("홍길동",16,false);
		p1.infoview();
		//기존 클래스(Person)를 복붙해서 새로운 클래스를 복사붙여넣기를 하게 하겠다.
		Member m1 = new Member();
		m1.infoset("유관순", 18,true);
		m1.infoview();
	
		
	}

}
class Person{
	//private : 자신 클래스 말고는 다 사용 불가능 → protected : 상속에 한해서 사용을 허용
	protected String name;
	private int age;
	private boolean gender;
	
	public void infoset(String name, int age, boolean gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void infoview() {
		System.out.println("이름 : "+name + "\n나이 : "+age+"살\n성별 : " );
		if(gender ==false) System.out.println("남성");
		else System.out.println("여성");
	}
}
class Member extends Person{	//사람 클래스를 복사해서 회원 클래스에 붙여넣어라
	private String gpname = "우리그룹";
	
	public void 회원정보() {
		System.out.println(gpname+"의 회원인 "+name+"입니다.");
	}
	public void infoview() {
		super.infoview();	//super. : 상속해준 클래스의 정보보기를 사용
		System.out.println("회원그룹은 "+gpname);
		//오버라이딩(수정)의 원리 : 부모의 것과 나의 것이 곂치면 나의 것이 '우선순위'가 더 높다.
	}
	
	//상속받은 다음 수정한는 법 : 오버라이딩, 물려받은 메서드를 재정의(다시 만든다)
}
//회원 클래스(회원도 사람 - 사람에게 있는변수와 메서드를 회원에게 물려주자!)























