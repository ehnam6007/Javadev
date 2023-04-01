package class_java;

public class Class_6 {
	public static void main(String[] args) {
		MyClass8 mc8 = new MyClass8();
		mc8.set_str("담기!");
		mc8.get_str();

	}

}

class MyClass8 {
	String str; // 클래스에 있는 변수는 '클래스 멤버변수'라고 한다.

	void func(/*MyClass8 this*/) { //MyClass8안에 있는 변수를 찾아줘
	} // 클래스에 있는 함수는 '메서드'라고 한다.
	// 클래스 기원 : 초보자에게 코드교육을 하지 않고 사용하게 하기 위해 생성.

	void set_str(String str) {
		// str 변수에 값을 담는 함수
		//this.변수 : 클래스에 있는 변수, str: 함수의 변수 ; 클래스의 멤버 변수를 사용하고 싶을 때 this를 사용
		this.str = str;	//이름이 겹칠 경우에만 this.을 사용
		
	}

	String get_str() {	//클래스명 this
		// str 변수를 사용하는 함수
		System.out.println(str);
		return str;
	}
	// this : 포인터
}