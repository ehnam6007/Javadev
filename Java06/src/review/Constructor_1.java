package review;

public class Constructor_1 {
	public static void main(String[] args) {
		//생성자는 객체화를 하는 순간에 자동 실행
		MyClass9 m1 = new MyClass9(9,"홍길동",130.9);	//클래스명 객체명 = new 생성자명();
		MyClass9 m2 = new MyClass9(17,"유관순",130.9);
		MyClass9 m3 = new MyClass9(21,"사임당",169.9);
		
		//m1.setName("홍길동");
		//m1.setHeight(177.56);
		//m1.setAge(12);
		
		//m2.setName("사임당");
		//m2.setHeight(149.56);
		//m2.setAge(18);
		
		MC9TEST rslt = new MC9TEST();
		rslt.test(m1);
		rslt.test(m2);
		rslt.test(m3);
	}

}
class MyClass9{
	//생성자 (초기 세팅을 빼먹지 못하도록)
	public MyClass9() {
		//초기값 세팅을 위한 메서드이기 때문에 자료형은 적지 않는다.
	}
	
	//생성자 오버로딩(매개변수만 바꿔놓기)
	public MyClass9(int age, String name, double height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}
	//멤버변수
	private int age;
	private String name;
	private double height;
	
	//getter/setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
class MC9TEST{
	public void test(MyClass9 mc) {
		if(mc.getAge() < 13) {
			System.out.println(mc.getName()+"은 나이가 적습니다. 탑승 불가!");
		}else if(mc.getHeight()<150) {
			System.out.println(mc.getName()+"은 키가 미달입니다. 탑승 불가!");
			}
		else {
			System.out.println(mc.getName()+"은 탑승 가능합니다!");
			}
		}
	}
	