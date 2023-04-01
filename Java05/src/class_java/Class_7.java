package class_java;

public class Class_7 {
	public static void main(String[] args) {
		MyClass9 m1 = new MyClass9();
		m1.setVar(3,4,"안녕",3.14);
		
		MyClass9 m2 = new MyClass9();
		m2.num1 = 11;
		m2.num2 = 22;
		m2.str = "반갑";
		m2.dnum = 123.123;
		
		//모든 메서드에는 this 변수가 숨겨져 있고
		//this.을 통해서 클래스의 멤버변수와 메서드를 사용할 수 있다.
		m1.info();
		m2.info();
		
		
	}

}

class MyClass9 {
	int num1; // 멤버변수
	int num2;
	String str;
	double dnum;

	void setVar(int num1, int num2, String str, double dnum) {
		int var = 0; // 지역변수나 매개변수는 함수가 실행된 후 삭제됨
		// 그래서 멤버변수에 백업
		this.num1 = num1;
		this.num2 = num2;
		this.str = str;
		this.dnum = dnum;
	}
	void info() {
		System.out.println(""+num1+num2+str+dnum);
	}

}
