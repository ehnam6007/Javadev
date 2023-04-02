package review;

public class Class_6 {
	public static void main(String[] args) {
		Car ftr_car = new Car();
		Car mom_car = new Car();
		Car my_car = new Car();
		
		ftr_car.setName("제네시스");
		System.out.println(ftr_car.getName());

		
	}

}
//멤버변수는 private, 메서드는 public
/*
 접근권한 제어자
 private : 다른 클래스에서 접근 불가능
 default(아무것도 안적으면) : 다른 패키지에서 접근 불가능
 protected : 다른 패키지에서 접근 불가능하지만 상속했을 경우에는 가능
 public : 접근가능(같은 프로젝트)
 */ 

//캡슐화 : 멤버변수를 private으로 만들어서 외부 클래스로부터 데이터를 보호하고 public 메스드로 제공한다.
class Car{
	private String name, color;
	private int num;	//private이 되면 다른 클래스에서 사용 불가능
	//일반적으로 대입의 경우 set을, 사용의 경우 get을 많이 사용한다.
	//#set
	public void setName(String name) {	//public 메서드로 제공되지 않는 private변수는 대입이나 사용이 불가능.
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//#get
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getNum() {
		return num;
	}
}
