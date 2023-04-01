package class_java;

public class Method3 {
	public static void main(String[] args) {
		MyClass6 mc6 = new MyClass6();
		
		System.out.println("func : "+mc6.func());
		System.out.println("func1 : "+mc6.func(3));
		System.out.println("func2 : "+mc6.func(3,6));
		System.out.println("func3 : "+mc6.func(3,6,9));
		System.out.println("func4 : "+mc6.func(3.1425));
	}

}
class MyClass6{
	//클래스 안에는 변수와 메서드만 올 수 있고, 메서드 안에는 코드를 쓸 수 있다.
	int num;
	String str;
	
	int func() {
		return 0;
	}
	int func(int num1) {
		return num1;
	}
	int func(int num1, int num2) {
		return num1+num2;
	}
	int func(int num1, int num2, int num3){
		return num1+num2+num3;
	}
	int func(double dnum) {
		System.out.print("실수는 정수로 변경됩니다 : ");
		return (int)dnum;
	}
	//메서드 오버로딩 : () 안에 내용이 달라지면 다른 메서드로 취급해줄 수 있다.
}
